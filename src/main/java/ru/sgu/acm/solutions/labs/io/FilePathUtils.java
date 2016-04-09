package ru.sgu.acm.solutions.labs.io;

import java.io.File;

// because File not support generating path (it maybe can nio.Path)
public class FilePathUtils {
    public static String createPath(String ... pathElements) {
        String str = File.separator;
        // compiler knows many concatenations - and used
        for (String pathElement : pathElements) {
            str += pathElement + File.separator;
        }
        return str;
    }
}
