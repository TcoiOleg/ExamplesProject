package ru.sgu.acm.solutions.labs.io.tasks;

import ru.sgu.acm.solutions.labs.io.FilePathUtils;

import java.io.*;

public class Task2 {
    public void execute() {
        final String root = System.getProperty("user.home") + FilePathUtils.createPath("IdeaProjects", "ExamplesProject\\src\\main\\java\\ru\\sgu\\acm\\solutions\\labs\\io");// "SolutionEx", "src", "main", "java");
        final String defaultInFilePath = root + "in.txt";
        final String defaultOutFilePath = root + "out.txt";

        try {
            File inputFile = new File(defaultInFilePath);
            RandomAccessFile randomAccessFile = new RandomAccessFile(inputFile, "r");

            FileOutputStream fileOutputStream = new FileOutputStream(defaultOutFilePath);
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, "UTF-8"));

            long lastInd = inputFile.length() - 1;
            while (lastInd >= 0) {
                randomAccessFile.seek(lastInd);
                fileOutputStream.write(randomAccessFile.read());
                lastInd--;
            }

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
