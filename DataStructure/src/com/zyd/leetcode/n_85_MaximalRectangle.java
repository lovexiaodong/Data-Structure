package com.zyd.leetcode;

public class n_85_MaximalRectangle {

    public static void main(String[] args) {
        char[][] matrix = {{'1','0','1','0','1'},
                            {'1','0','1','1','1'},
                            {'1','1','1','1','1'},
                            {'1','0','0','1','0'}};
        System.out.println(maximalRectangle(matrix));
    }

    public static int maximalRectangle(char[][] matrix) {

        if(matrix == null || matrix.length <= 0){
            return 0;
        }
        int[][] result = new int[matrix.length][matrix[0].length];

        for (int i = 0 ; i <matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){

                if('1' == (matrix[i][j])){
                    result[i][j]= 1;
                }else{
                    result[i][j]= 0;
                }
            }
        }

        int max = 0;
        for (int i = 0 ; i <result.length; i++){
            for (int j = 0; j < result[i].length; j++){
                System.out.println(matrix[ i][j]);

                if(i > 0){
                    if(result[ i -1][j] != 0 && result[ i][j] != 0){
                        result[ i][j] = result[ i][j] + result[i-1][j];
                        max = Math.max(max, result[ i][j]);
                    }
                }
                if(j > 0){
                    if( result[i][j-1] != 0 && result[i][j] != 0){
                        result[i][j]  = result[i][j-1] + result[i][j];
                        max = Math.max(max, result[ i][j]);
                    }
                }
            }
        }

        return max;
    }
}
