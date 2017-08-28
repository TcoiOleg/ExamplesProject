package ru.interview.multithreading;

/**
 * o.tsoy
 * 28.08.2017
 */
public class InterruptExample {

    public static void main(String[] args) {
        final Runnable runnableForInterrupted = () -> {
            System.out.println(Thread.currentThread().getName() + " start");
            if (Thread.interrupted() /* Clears interrupted status! */ ) {
                System.out.println("Interrupt thread by 'return;' statement");
                return;
            }
            System.out.println(Thread.currentThread().getName() + " end");
        };
        Thread interrupted = new Thread(runnableForInterrupted);
        Thread notInterrupted = new Thread(runnableForInterrupted);
        interrupted.setName("interrupted1");
        notInterrupted.setName("notInterrupted1");

        interrupted.start();
        notInterrupted.start();

        interrupted.interrupt();

        if (interrupted.isInterrupted()) {
            System.out.println(String.format("thread {%s} is interrupted", interrupted.getName()));
        }
    }
}
