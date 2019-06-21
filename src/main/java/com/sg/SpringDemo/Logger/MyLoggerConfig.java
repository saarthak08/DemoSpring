package com.sg.SpringDemo.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLoggerConfig {
    private String rootLoggerLevel;
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
