package com.sg.SpringDemo.Logger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.lang.annotation.Annotation;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

@Configuration
@PropertySource("classpath:myLogger.properties")
public class MyLoggerConfig {

    @Value("${root.logger.level}")
    private String rootLoggerLevel;

    @Value("${printed.logger.level}")
    private String printedLoggerLevel;

    public void setRootLoggerLevel(String rootLoggerLevel) {
        this.rootLoggerLevel = rootLoggerLevel;
    }

    public void setPrintedLoggerLevel(String printedLoggerLevel) {
        this.printedLoggerLevel = printedLoggerLevel;
    }

    public void initLogger(){
        // parse Level
        Level rootLevel = Level.parse(rootLoggerLevel);
        Level printLevel = Level.parse(printedLoggerLevel);

        //get logger for app context
        Logger applicationContextLogger = Logger.getLogger(AnnotationConfigApplicationContext.class.getName());

        // get parent logger
        Logger loggerParent = applicationContextLogger.getParent();

        // set root Logging level
        loggerParent.setLevel(rootLevel);

        // set up console handler
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(printLevel);
        consoleHandler.setFormatter(new SimpleFormatter());

            //add Handler to the logger
         loggerParent.addHandler(consoleHandler);
    }
}
