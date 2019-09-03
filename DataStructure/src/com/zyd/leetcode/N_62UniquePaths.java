package com.zyd.leetcode;

public class N_62UniquePaths {


    public static void main(String[] args) {
        N_62UniquePaths paths = new N_62UniquePaths();
       int path =  paths.uniquePaths1(51, 9);
        System.out.println(path);
    }

    public int uniquePaths1(int m, int n){
        if(m == 1 || n == 1){
            return 1;
        }
        if(m == 0 || n == 0){
            return 0;
        }

        int[][] rest = new int[m][n];
        for (int i = 0; i < m; i++){
            rest[i][0] = 1;
        }
        for (int i = 0; i < n; i++){
            rest[0][i] = 1;
        }

        for (int i =1 ; i < m; i++){
            for (int j = 1; j < n;j++){
                rest[i][j] = rest[i-1][j] + rest[i][j-1];
            }
        }

        return rest[m-1][n-1];
    }

    public int uniquePaths(int m, int n) {
        if(m == 1 || n == 1){
            return 1;
        }
        if(m == 0 || n == 0){
            return 0;
        }

        return path(m, n);
    }


    public int path(int m , int n){
        if(m == 1){
            return 1;
        }
        if(n == 1){
            return 1;
        }

        return path(m-1, n) + path(m,n-1);
    }
}
