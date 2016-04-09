package ru.sgu.acm.solutions.labs.io;

import ru.sgu.acm.solutions.labs.io.tasks.Task1;

import java.io.IOException;

public class IOTaskExample {

    public static void main(String[] args) {
        try {
            new Task1().execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //new Task2().execute();
    }

}
