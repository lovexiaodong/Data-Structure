package com.zyd.leetcode;

public class N_37SudokuSolver {


    public static void main(String[] args) {
        char[][] str = {{'5','3','.','.','7','.','.','.','.'},
                        {'6','.','.','1','9','5','.','.','.'},
                        {'.','9','8','.','.','.','.','6','.'},
                        {'8','.','.','.','6','.','.','.','3'},
                        {'4','.','.','8','.','3','.','.','1'},
                        {'7','.','.','.','2','.','.','.','6'},
                        {'.','6','.','.','.','.','2','8','.'},
                        {'.','.','.','4','1','9','.','.','5'},
                        {'.','.','.','.','8','.','.','7','9'}};

        N_37SudokuSolver sudokuSolver = new N_37SudokuSolver();
        sudokuSolver.solveSudoku(str);
        char[][] temp = str;
        for (int i = 0;i < str.length; i ++){
            for (int j = 0; j < str[i].length;j++){
                System.out.print(str[i][j]);
                if(j == str[i].length -1){
                    System.out.println("");
                }
            }
        }
    }

    public void solveSudoku(char[][] board) {
            fill(board);
    }


    public boolean fill(char[][] board){
        for (int i = 0; i < board.length; i ++){
            for (int j = 0; j < board[i].length;j++){

                if(board[i][j] == '.'){
                    for (int k = 1; k <= 9; k++){
                        char ch1 = (char) (k + 48);
                        //如果是有效的字符，则给当前的位置赋值,并继续调用
                        if(isValid(board, i, j, ch1)){
                            board[i][j] = ch1;
                            boolean result = fill(board);
                            //返回true代表匹配成功，如果是false的话，说明不匹配，需要将数据还原，接着填充
                            if(result){
                                return true;
                            }else{

                                board[i][j] ='.';
                            }
                        }

                    }

                    //循环完了一到9，没找到有效的数字，则证明上一级的数字不对
                    return false;
                }
            }
        }

        return true;
    }

    public boolean isValid(char[][] board, int x, int y, char str){
        //列中查找是不是有相同的
        for (int i = 0; i < board.length;i++){
            if(i != x && board[i][y] == str){
                return false;
            }
        }
        //行中查找
        for (int i = 0; i < board[x].length;i++){
            if(i != y && board[x][i] == str){
                return false;
            }
        }

        //在3*3的宫格中查找，很简单 想想就明白
        int temp = x/3;
        int startX = temp * 3;
        int endX = (temp+1)*3;
        temp = y/3;
        int startY = temp*3;
        int endY = (temp + 1) * 3;

        for (int i = startX; i< endX; i++){
            for (int j = startY; j < endY; j++){
                if(i !=x && j != y && board[i][j] == str){
                    return false;
                }
            }
        }

        return true;

    }
}
