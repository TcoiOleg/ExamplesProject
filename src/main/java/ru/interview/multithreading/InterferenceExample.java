package ru.interview.multithreading;

/**
 * o.tsoy
 * 29.08.2017
 */
public class InterferenceExample {

    private static class Counter {
        private int c = 0;

        public void increment() {
            c++;
        }

        public void decrement() {
            c--;
        }

        public int value() {
            return c;
        }
    }

    private static class InterferenceIncrement implements Runnable {

        private Counter counter;

        public InterferenceIncrement(Counter counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            counter.increment();
            System.out.println("increment: " + counter.value());
        }
    }

    private static class InterferenceDecrement implements Runnable {

        private Counter counter;

        public InterferenceDecrement(Counter counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            counter.decrement();
            System.out.println("decrement: " + counter.value());
        }
    }


    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Thread a = new Thread(new InterferenceIncrement(c));
        Thread b = new Thread(new InterferenceDecrement(c));
        a.start();
        b.start();
    }
}
