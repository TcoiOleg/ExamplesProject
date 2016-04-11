package ru.sgu.acm.solutions.labs.io;

import java.io.*;

/**
olts
 */
@SuppressWarnings("unused")
public class PushbackInputStreamExample {
    public void execute() {
        String strExpression = "a=a++b;";
        byte bytes[] = strExpression.getBytes();
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        try {
            PushbackInputStream pushbackInputStream = new PushbackInputStream(bis);
            int temp;
            while ((temp = pushbackInputStream.read()) != -1) {
                if (temp == '+') {
                    if ((temp = pushbackInputStream.read()) == 'b') {
                        pushbackInputStream.unread(temp);
                    }
                }
                System.out.println((char) temp);
            }
            pushbackInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
