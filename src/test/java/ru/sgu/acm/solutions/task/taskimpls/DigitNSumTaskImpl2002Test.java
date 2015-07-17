package ru.sgu.acm.solutions.task.taskimpls;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * User: 1
 * Date: 17.07.15
 */
public class DigitNSumTaskImpl2002Test {

    @Test
    public void testForEach() {
        String[] strNums = new String[]{"1", "2", "3"};
        List<String> lst = Arrays.asList(strNums);
        int s = lst.stream().mapToInt(Integer::parseInt).sum();
        System.out.println(s);
    }
}
