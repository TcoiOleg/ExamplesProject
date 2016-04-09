package ru.sgu.acm.solutions.labs.io.tasks;

import ru.sgu.acm.solutions.labs.io.FilePathUtils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Formatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Task1 {

    public void execute() throws IOException {
        final String root = System.getProperty("user.home") + FilePathUtils.createPath("IdeaProjects", "ExamplesProject\\src\\main\\java\\ru\\sgu\\acm\\solutions\\labs\\io");// "SolutionEx", "src", "main", "java");
        final String defaultInFilePath = root + "in.txt";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(defaultInFilePath), "UTF-8"));
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("\\p{javaWhitespace}+"); // default pattern. used for example
        scanner.useDelimiter(pattern);
        String next = scanner.next();
        char target = next.charAt(0);
        int temp;
        int cnt = 0;
        while ((temp = bufferedReader.read()) != -1) {
            if (temp == target) {
                cnt++;
            }
        }
        System.out.println(new Formatter().format("The number of occurrences of a character '%s' is: %s", target, cnt));
    }
}
