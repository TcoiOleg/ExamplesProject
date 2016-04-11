package ru.sgu.acm.solutions.labs.io;

import ru.sgu.acm.solutions.labs.io.tasks.PipedExample;

import java.io.IOException;

public class IOTaskExample {

    public static void main(String[] args) {
        /*try {
            new Task1().execute();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        //new Task2().execute();
        //new Task3().execute();
        //new Task4().execute();
        //new PushbackInputStreamExample().execute();
        try {
            new PipedExample().execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
