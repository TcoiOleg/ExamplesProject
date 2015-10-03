package ru.sgu.acm.solutions.task.executors.impl.file.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

/**
 * User: 1
 * Date: 29.07.15
 */
public class FileCreatorUtils {

    private static final Logger LOGGER = LogManager.getLogger(FileCreatorUtils.class);

    public static PrintStream getPrintStreamFromFile(String pathToOutput) {
        // todo: get path by getClass.getResource
        pathToOutput = System.getProperty("user.dir") + pathToOutput;
        File file = new File(pathToOutput);
        if (!file.exists()) {
            LOGGER.trace("create file from path: {}", pathToOutput);
            try {
                file.createNewFile();
            } catch (IOException e) {
                LOGGER.error("FIle exception: {}", e.getMessage());
            }
        }
        LOGGER.trace("get file from path: {}", pathToOutput);
        PrintStream printStream;
        try {
            printStream = new PrintStream(file);
        } catch (FileNotFoundException e) {
            LOGGER.warn("file not found. Sout");
            printStream = System.out;
        }
        return printStream;
    }
}
