package ru.sgu.acm.solutions;

import ru.patterns.factorymethod.FactoryMethodExample;
import ru.sgu.acm.solutions.main.Main;
import ru.sgu.acm.solutions.main.impl.MainImplWithBuilder;
import ru.sgu.acm.solutions.task.executors.TaskExecutor;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * User: 1
 * Date: 30.07.15
 */


public class MainLoader {

    static Scanner scanner = new Scanner(System.in);
    static PrintStream out = System.out;
    //static TaskExecutor taskExecutor = (TaskExecutor) TasksContext.getBean(BeanConstants.taskExecutor);
    //static TaskExecutor taskExecutor = (TaskExecutor) TasksContext.getBean(BeanConstants.taskExecutorToFile);
    static TaskExecutor taskExecutor = FactoryMethodExample.initFactoryMethod(FactoryMethodExample.TASK_EXECUTORS.SOUT);

    public static void main(String[] args) {
        //Main main = new MainImplBridge();
        //Main main = new MainForAliasTask();
        //Main main = new MainImplForFacade();
        //Main main = new MainImplValuesProviders();
        Main main = new MainImplWithBuilder.Builder().scanner(scanner).outStream(out).taskExecutor(taskExecutor).build();
        main.runMain();
    }
}
