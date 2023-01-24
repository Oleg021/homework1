package com.vyrvykhvost;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Main main = new Main();
      main.runHomeWork1();
    }

    public void runHomeWork1() {
        System.out.println("Pick 1 to calculate function wit X"
        + "\nPick 2 to calculate steps"
        + "\nPick 3 to find all Y"
        + "\nPick 4 to find all X"
        + "\nPick 5 to find Max and Min of X"
        + "\nPick 6 to find Max and Min of Y"
        + "\nPick 7 to find index of Max and Min of X"
        + "\nPick 8 to find index of Max and Min of Y"
        + "\nPick 9 to find Average and sum of all element Y"
        + "\nPick 10 to find Average and sum of all element X"
        + "\nPick 11 to find element Y from index");

        Scanner scanner = new Scanner(System.in);
        int comand = scanner.nextInt();
        Calculator calculator = new Calculator();
        switch (comand) {
            case  1:
                System.out.println("Enter your X");
                double x = scanner.nextDouble();
                System.out.println(calculator.calculate(x));
                break;
            case 2:
                System.out.println(calculator.calculateStep());
                break;
            case 3:
                for (double elem : calculator.findArgY()) {
                    System.out.println(elem);
                }
                break;
            case 4:
                for (double elem : calculator.findArgX()) {
                    System.out.println(elem);
                }
                break;
            case 5:
                calculator.findMaxAndMin(calculator.findArgX());
                break;
            case 6:
                calculator.findMaxAndMin(calculator.findArgY());
                break;
            case 7:
                calculator.findMaxMinWithIndex(calculator.findArgX());
                break;
            case 8:
                calculator.findMaxMinWithIndex(calculator.findArgY());
                break;
            case 9:
              calculator.findAverage(calculator.findArgY());
              break;
            case 10:
                calculator.findAverage(calculator.findArgX());
                break;
            case 11:
                System.out.println("Enter index of element: ");
                int index = scanner.nextInt();
                System.out.println(calculator.findElementFromIndex(index));
        }
    }
}
