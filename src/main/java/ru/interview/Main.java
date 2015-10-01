package ru.interview;

import ru.interview.innerclasses.InnerClassesExample;
import ru.interview.multithreading.ThreadCreationExample;

import java.util.ArrayList;
import java.util.List;

/**
 * User: 1
 * Date: 18.09.15
 */
public class Main {

    public static void main(String[] args) {
        List<Example> examples = new ArrayList<>();
        examples.add(new InnerClassesExample());
        examples.add(new ThreadCreationExample());
        examples.forEach(example -> System.out.println("IN"));
    }
}
