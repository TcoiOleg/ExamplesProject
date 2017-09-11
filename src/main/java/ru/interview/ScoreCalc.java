package ru.interview;

/**
 * o.tsoy
 * 01.09.2017
 */
public class ScoreCalc {
    public static void main(String[] args) {
        int nonCompletedCnt = 1;
        float difficulty = 5;
        int max = 21;
        for (int i = 0; i < max; i++) {
            Float score = calc(i, difficulty, max);
            System.out.println(score);
            System.out.println(score.intValue());
        }
    }

    private static Float calc(int nonCompletedCnt, float difficulty, int max) {
        Float score = (nonCompletedCnt * ((float)(difficulty / max)));
        if (score < 1) {
            score = 1F;
        }
        return score;
    }
}
