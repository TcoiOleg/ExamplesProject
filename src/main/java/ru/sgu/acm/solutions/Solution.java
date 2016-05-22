package ru.sgu.acm.solutions;


import ru.sgu.acm.solutions.task.codingbat.AP1;
import ru.sgu.acm.solutions.task.codingbat.Recursion2;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static final AP1 AP_1 = new AP1();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(new Recursion2().groupSum(0, new int[]{2, 4, 8}, 10));
        //System.out.println(AP_1.new CommonTwo().commonTwo(new String[]{"a", "a", "b", "b", "c"}, new String[]{"c", "c"}));
        //System.out.println(Arrays.toString(AP_1.new MergeTwo().mergeTwo(new String[]{"a", "c", "z"}, new String[]{"a", "c", "z"}, 3)));
        //exec(scanner);
    }

    private static void exec(Scanner scanner) {
        int n = scanner.nextInt();
        int mas[] = new int[n],
                tempMas[],
                res[];
        for (int i = 0; i < n; i++) {
            mas[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            tempMas = new int[0];
            for (int j = i; j < n; j++) {
                tempMas = appendEl(tempMas, mas[j]);
                int s = n % tempMas.length;
                if (s == 0) {
                    s = n / tempMas.length;
                    res = new int[0];
                    while (s-- > 0) {
                        res = appendMas(res, tempMas);
                    }
                    if (Arrays.equals(res, mas)) {
                        System.out.println(tempMas.length);
                        return;
                    }
                }
            }
        }
    }

    public static int[] appendEl(int mas[], int n) {
        int newMas[] = new int[mas.length + 1];
        for (int i = 0; i < mas.length; i++) {
            newMas[i] = mas[i];
        }
        newMas[mas.length] = n;
        return newMas;
    }

    public static int[] appendMas(int targetMas[], int appendMas[]) {
        int newMas[] = new int[targetMas.length + appendMas.length];
        for (int i = 0; i < targetMas.length; i++) {
            newMas[i] = targetMas[i];
        }
        for (int i = 0; i < appendMas.length; i++) {
            newMas[targetMas.length + i] = appendMas[i];
        }
        return newMas;
    }
}
