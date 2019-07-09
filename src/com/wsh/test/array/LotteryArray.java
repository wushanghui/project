package com.wsh.test.array;

/**
 * 不规则数组 class
 *
 * @author wsh
 * @date 2019-07-04 21:50
 */
public class LotteryArray {

    public static void main(String[] args) {
        final int MAX = 10;

        int[][] odds = new int[MAX+1][];
        for (int n = 0; n < odds.length; n++) {
            odds[n] = new int[n+1];
        }
        for (int n = 0; n < odds.length; n++) {
            for (int k = 0; k < odds[n].length; k++) {
                int lotteryOdds = 1;
                for (int i = 1; i <= k; i++) {
                    lotteryOdds = lotteryOdds * (n-i+1) / i;
                }
                odds[n][k] = lotteryOdds;
            }
        }
        for (int[] row : odds) {
            for (int odd : row) {
                System.out.printf("%4d", odd);
            }
            System.out.println();
        }

    }
}
