package ru.sgu.acm.solutions.task.executors.impl.file;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.sgu.acm.solutions.task.Task;
import ru.sgu.acm.solutions.task.executors.TaskExecutor;

import java.io.PrintStream;
import java.util.Map;
import java.util.Scanner;

import static ru.sgu.acm.solutions.task.executors.impl.file.utils.FileCreatorUtils.getPrintStreamFromFile;

/**
 * User: 1
 * Date: 28.07.15
 */
public class TaskExecutorToFile extends TaskExecutor {

    private Map<String, Task> taskMap;
    private String pathToOutput;

    private static final Logger LOGGER = LogManager.getLogger(TaskExecutorToFile.class);

    @Override
    public void executeTaskByNumber(Scanner scanner, int taskNumber) {
        PrintStream printStream = getPrintStreamFromFile(getPathToOutput());
        LOGGER.trace("Execute task: {}", taskNumber);
        Task task = taskMap.get(String.valueOf(taskNumber));
        printStream.println(task.execute(scanner));
    }

    public void setTaskMap(Map<String, Task> taskMap) {
        this.taskMap = taskMap;
    }

    public String getPathToOutput() {
        return pathToOutput;
    }

    public void setPathToOutput(String pathToOutput) {
        this.pathToOutput = pathToOutput;
    }
}
