package org.task2;

public class Main {
    public static void main(String[] args) {
        InitialStartingPoint initialStartingPoint = new InitialStartingPoint(4);
        System.out.println(initialStartingPoint.createStartingPoint());
        System.out.println(initialStartingPoint.createStartingPoint());
        System.out.println(initialStartingPoint.createStartingPoint());

        InitialStartingPoint initialStartingPoint2 = new InitialStartingPoint(8);
        System.out.println(initialStartingPoint2.createStartingPoint());
        System.out.println(initialStartingPoint2.createStartingPoint());
        System.out.println(initialStartingPoint2.createStartingPoint());
    }
}