package ru.interview.multithreading;

import ru.interview.Example;

/**
 * User: 1
 * Date: 02.10.15
 */
public class ThreadCreationExample implements Example {
    @Override
    public void runMain() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hi, i am thread from 'Runnable'!");
            }
        });
        thread.start();
        Thread t = new Thread() {
            @Override
            public void run() {
                System.out.println("Hi, i am thread from 'Thread'!");
            }
        };
        t.start();
    }
}
