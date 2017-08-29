package ru.interview.multithreading;

/**
 * o.tsoy
 * 29.08.2017
 */
public class JoinExample {

    /* without join answer:
     *  main
        main thread end
        thread calc start
        thread calc end */

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        Thread t = new Thread(() -> {
            System.out.println("thread calc start");
            for(int i = 0; i < 100000; i++) {}
            System.out.println("thread calc end");
        });
        t.start();
        t.join();
        System.out.println("main thread end");
    }
}
