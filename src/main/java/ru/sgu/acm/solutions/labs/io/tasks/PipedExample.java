package ru.sgu.acm.solutions.labs.io.tasks;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
olts
 */
public class PipedExample {
    public void execute() throws IOException {
        final PipedOutputStream output = new PipedOutputStream();
        final PipedInputStream input  = new PipedInputStream(output);

        Thread thread1 = new Thread(() -> {
            try {
                output.write("Hello world, pipe!".getBytes());
                System.out.println("1 Writed thread.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                System.out.println("Readed thread.");
                int data;
                while((data = input.read()) != -1){
                    System.out.print((char) data);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        Thread thread3 = new Thread(() -> {
            try {
                output.write("Second writing!".getBytes());
                System.out.println("2 Writed thread.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
