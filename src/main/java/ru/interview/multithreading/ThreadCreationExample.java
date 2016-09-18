package ru.interview.multithreading;

import ru.interview.Example;

/**
 * User: 1
 * Date: 02.10.15
 */
public class ThreadCreationExample implements Example {
    @Override
    public void runMain() {
        Thread thread = new Thread(() -> System.out.println("Hi, i am thread!"));
        thread.start();
    }
}
