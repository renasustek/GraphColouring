package org.task2;

import java.util.ArrayList;

public class InitialStartingPoint {

    private int size;

    private ArrayList<Integer> startingPoint = new ArrayList<>();

    public InitialStartingPoint(int N){
        this.size = N;
    }

    public ArrayList<Integer> createStartingPoint(){
        for (int i = 0; i < size; i++){
            double randomNumber = randomNumberGenerator();
            if (randomNumber < 0.25){
                startingPoint.add(i,1);
            } else if (randomNumber < 0.5){
                startingPoint.add(i, 2);
            } else if (randomNumber < 0.75){
                startingPoint.add(i, 3);
            } else if (randomNumber < 1){
                startingPoint.add(i, 4);
            }
        }
        return startingPoint;
    }

    private double randomNumberGenerator(){
        return Math.round(Math.random() * 100.0) / 100.0;
    }

}
