package org.dangerous.algorithm.math;

/**
 * Created by Administrator on 2017/3/3.
 */
public class FibonacciSeq {
    /**
     * 动态规划
     *
     * @param n
     * @return
     */
    public int f(int n) {
        int[] dy = new int[n + 1];
        dy[0] = 1;
        dy[1] = 1;
        for (int i = 2; i <= n; i++) {
            dy[i] = dy[i - 1] + dy[i - 2];
        }
        return dy[n];
    }

    /**
     * 递归
     *
     * @param n
     * @return
     */
    public int fn(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return fn(n - 1) + fn(n - 2);
    }

    /**
     * 交换
     *
     * @param n
     * @return
     */
    public int fn1(int n) {
        int n0 = 1;
        int n1 = 1;
        int result = 0;
        for (int i = 2; i <= n; i++) {
            result = n0 + n1;
            n0 = n1;
            n1 = result;
        }
        return result;
    }

    public static void main(String[] args) {
        FibonacciSeq seq = new FibonacciSeq();
        int n = 100000;
        //动态规划，交换时间差不多
        long beginf = System.currentTimeMillis();
        System.out.println(seq.f(n));
        System.out.println(System.currentTimeMillis() - beginf);
        beginf = System.currentTimeMillis();
        System.out.println(seq.fn1(n));
        System.out.println(System.currentTimeMillis() - beginf);
        //递归很慢
        beginf = System.currentTimeMillis();
        System.out.println(seq.fn(n - 1));
        System.out.println(System.currentTimeMillis() - beginf);
    }

}
