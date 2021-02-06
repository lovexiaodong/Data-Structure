package com.zyd.leetcode;

public class DynamicDemo {

    public static void main(String[] args) {
        dynamic2();
    }

    public static void dynamic1(){
        int[] w = { 0 , 2 , 3 , 4 , 5 };			//商品的体积2、3、4、5
        int[] v = { 0 , 3 , 4 , 5 , 6 };
        int bagW = 8;

        int[][] dp = new int[5][9];

        for (int i = 1; i <= 4;i++){
            for (int j = 1; j < 9; j++){
                if(j < w[i]){
                    dp[i][j] = dp[i-1][j];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w[i]]+v[i]);
                }
            }
        }


        for (int i = 0; i < dp.length;i++){
            for (int j = 0; j < dp[i].length;j++){
                System.out.print(dp[i][j]);
            }

            System.out.println();
        }
    }

    public static void dynamic2(){
        int[] money = new int[]{1,2,5};
        int total = 11;

        System.out.println(coinChage(total, money));
    }

    public static int coinChage(int total, int[] money){
        if(total == 0) return 0;
        if(total < 0) return  -1;

        int result = Integer.MAX_VALUE;

        for (int i = 0; i < money.length; i++){

            int temp = coinChage(total - money[i], money);
            if(temp == -1){
                temp = Integer.MAX_VALUE - 1;
            }
            result = Math.min(result,  temp + 1);
        }

        return result;
    }
}
