package org.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        InitialStartingPoint initialStartingPoint = new InitialStartingPoint(4);
//        System.out.println(initialStartingPoint.createStartingPoint());
//        System.out.println(initialStartingPoint.createStartingPoint());
//        System.out.println(initialStartingPoint.createStartingPoint());
//
//        InitialStartingPoint initialStartingPoint2 = new InitialStartingPoint(8);
//        System.out.println(initialStartingPoint2.createStartingPoint());
//        System.out.println(initialStartingPoint2.createStartingPoint());
//        System.out.println(initialStartingPoint2.createStartingPoint());

        int[][] matrix = {
                {0,1,1,1},
                {1,0,0,1},
                {1,0,0,0},
                {1,1,0,0}
        };


        ArrayList<Integer> solution = new ArrayList<>(List.of(1,1,2,1));
        ColourClash colourClash = new ColourClash(matrix, solution);

        System.out.println(colourClash.clashes());

    }
}