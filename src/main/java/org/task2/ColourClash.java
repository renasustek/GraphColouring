package org.task2;

import java.util.ArrayList;
import java.util.Objects;

public class ColourClash {

    private int[][] matrix;

    private ArrayList<Integer> solution;

    private int clashes;

    public ColourClash(int[][] matrix, ArrayList<Integer> solution) {
        this.matrix = matrix;
        this.solution = solution;
    }

    public int clashes(){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i+1; j < matrix[i].length; j++) {
                if (Objects.equals(solution.get(i), solution.get(j))) {
                    clashes++;
                }
            }
        }
        return clashes;
    }
}
