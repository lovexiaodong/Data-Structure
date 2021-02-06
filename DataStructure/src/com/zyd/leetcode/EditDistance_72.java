package com.zyd.leetcode;

public class EditDistance_72 {

    public static void main(String[] args) {
        String word1 = "horse", word2 = "ros";
        System.out.println(new Solution().minDistance(word1,word2));
    }
}



//class Solution {
//    public int minDistance(String word1, String word2) {
//
//        int[][] index = new int[word1.length()][word2.length()];
//        return distance(word1.length() - 1, word2.length() - 1, word1,word2, index);
//    }
//
//    public int distance(int n, int m, String world1, String world2, int[][] index){
//
//        if(n == -1) return m + 1;
//        if(m == -1) return n + 1;
//
//        if(world1.charAt(n) == world2.charAt(m)){
//
//            if(index[n][m] != 0){
//                return index[n][m];
//            }else {
//                return index[n][m] = distance(n -1, m -1, world1, world2, index);
//            }
//
//        }else {
//
//            if(index[n][m] != 0){
//                return index[n][m];
//            }else {
//                return index[n][m] = min(distance(n, m -1, world1, world2, index) + 1,
//                        distance(n - 1, m, world1, world2, index) + 1,
//                        distance(n - 1, m -1, world1, world2, index) + 1);
//            }
//            //插入 删除， 替换
//        }
//    }
//
//    public int min(int ... temp){
//
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < temp.length; i++){
//            min  = Math.min(min, temp[i]);
//        }
//
//        return min;
//    }
//}


//class Solution {
//    public int minDistance(String word1, String word2) {
//
//        return distance(word1.length() - 1, word2.length() - 1, word1,word2);
//    }
//
//    public int distance(int n, int m, String world1, String world2){
//
//        if(n == -1) return m + 1;
//        if(m == -1) return n + 1;
//
//        if(world1.charAt(n) == world2.charAt(m)){
//
//            return distance(n -1, m -1, world1, world2);
//
//        }else {
//
//
//            //插入 删除， 替换
//
//            return min(distance(n, m -1, world1, world2) + 1,
//                    distance(n - 1, m, world1, world2) + 1,
//                    distance(n - 1, m -1, world1, world2) + 1);
//        }
//    }
//
//    public int min(int ... temp){
//
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < temp.length; i++){
//            min  = Math.min(min, temp[i]);
//        }
//
//        return min;
//    }
//}


class Solution {
    public int minDistance(String word1, String word2) {

        int[][] index = new int[word1.length() + 1][word2.length() + 1];

        for (int i = 1; i <= word1.length(); i++){
            index[i][0] = i;
        }

        for (int i = 1; i <= word2.length(); i++){
            index[0][i] = i;
        }

        for (int i = 1; i <= word1.length(); i++){
            for (int j = 1; j <= word2.length(); j++){
                if(word1.charAt(i -1) ==  word2.charAt(j-1)){
                    index[i][j] =  index[i-1][j-1];
                }else {
                    index[i][j] = min( index[i - 1][j] + 1,
                            index[i][j - 1] + 1,
                            index[i - 1][j - 1] + 1);
                }


            }
        }



        return index[word1.length()][word2.length()];
    }


    public int min(int ... temp){

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < temp.length; i++){
            min  = Math.min(min, temp[i]);
        }

        return min;
    }
}
