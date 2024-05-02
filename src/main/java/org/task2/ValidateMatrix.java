package org.task2;

import java.util.regex.MatchResult;

public class ValidateMatrix {

    private int[][] matrix;

    public ValidateMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int validate(){
        if (!checkSquare()){
            return 1;
        } else if (!checkBinary()) {
            return 2;
        } else if (!checkSymmetry()){
            return 3;
        } else {
            return 0;
        }
    }

    public boolean checkSquare() {
        for (int row = 0; row < matrix.length; row++) {
            int count = 0;
            for (int col = 0; col < matrix[row].length; col++) {
                count++;
            }
            if (count != matrix.length) {
                return false;
            }
        }
        return true;
    }

    public boolean checkBinary() {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] != 1) {
                    if (matrix[row][col] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean checkSymmetry() {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (row == col) {
                    if (matrix[row][col] != 0) {
                        return false;//leading diagonal not equal to 0
                    }
                }
                if (matrix[row][col] != matrix[col][row]) {
                    return false;//Mij != Mji
                }
            }
        }
        return true;
    }

}



