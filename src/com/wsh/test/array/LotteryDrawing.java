package com.wsh.test.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 二维数组 测试 class
 *
 * @author wsh
 * @date 2019-07-04 00:28
 */
public class LotteryDrawing {

    /**
     * 从 n个数中取出 k个数，并排序输出
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入 k");
        int k = in.nextInt();
        System.out.println("输入 n");
        int n = in.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) {
            int r  = (int)Math.random() * n;
            result[i] = numbers[r];
            numbers[r] = numbers[n-1];
            n--;
        }
        Arrays.sort(result);
        System.out.println("输出结果：");
        for (int r : result) {
            System.out.println(r);
        }

    }
}
