package com.wsh.test.array;

import org.junit.Test;

import java.util.Arrays;

/**
 * array test class
 *
 * @author wsh
 * @date 2019-07-03 22:35
 */
public class ArrayTest {

    /**
     * 数组copy 1
     * 两个数组指向一个对象
     */
    @Test
    public void testArrayCopy1() {
        int[] smallprimes = {1, 3, 6, 43, 10, 99};
        int[] luckyNumber = smallprimes;
        luckyNumber[5] = 1;
        System.out.println("遍历smallprimes数组：");
        for (int i : smallprimes) {
            System.out.println(i);
        }
        System.out.println("遍历luckyNumber数组");
        for (int j : luckyNumber) {
            System.out.println(j);
        }
    }

    /**
     * 数组copy 2
     * Arrays.copyOf 方法，形成一个新的数组
     * 设置新数组的长度比原数组大，数值型补0，布尔型默认false
     * 小了，只copy前面的数组元素
     */
    @Test
    public void testArrayCopy2() {
        int[] smallprimes = {1, 3, 6, 43, 10, 99};
        int newArrayLength = 9;
        int[] luckyNumber = Arrays.copyOf(smallprimes, newArrayLength);
        luckyNumber[2] = 1;
        System.out.println("遍历smallprimes数组：");
        for (int i : smallprimes) {
            System.out.println(i);
        }
        System.out.println("遍历luckyNumber数组");
        for (int j : luckyNumber) {
            System.out.println(j);
        }
    }

    @Test
    public void testArraySort() {

    }

    @Test
    public void testTwoArray() {
        int[][] a = {
                {1, 45, 3, 35},
                {3, 0, 22, 44},
                {4, 55, 32, 97}
        };

        //循环嵌套访问二维数组
        for (int[] b: a) {
            for (int c : b) {
                System.out.print(c+" ");
            }
        }
        System.out.println();
        System.out.println("-------------------------------------------------");
        //快速打印一个数组列表
        System.out.println(Arrays.deepToString(a));
    }
}
