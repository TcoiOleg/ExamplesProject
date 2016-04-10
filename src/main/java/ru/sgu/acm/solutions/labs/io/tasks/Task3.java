package ru.sgu.acm.solutions.labs.io.tasks;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

/**
 3.	Распечатайте в стандартный поток вывода дерево файлов указанной директории,
 включая подкаталоги и их содержимое. При выводе добавляйте один пробел отступа
 за каждый уровень вложенности файла или папки. Корневая директория передается
 параметром командной строки.
 */
@SuppressWarnings("unused")
public class Task3 {

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter folder path: ");
        // C:\Users\Oleg\IdeaProjects\ExamplesProject\src\main\java\ru\sgu\acm\solutions - for example
        final String path = scanner.next();
        File file = new File(path);
        printListFiles(file, 0, "    ", System.out);
    }

    private void printListFiles(File file, int splitterCount, String splitter, PrintStream printStream) {
        String temp = "";
        int i = splitterCount;
        while (i-- > 0) {
            temp += splitter;
        }
        printStream.println(temp + file.getName());
        splitterCount++;
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files == null) {
                return;
            }
            for (File fileE : files) {
                printListFiles(fileE, splitterCount, splitter, printStream);
            }
        }
    }


}
