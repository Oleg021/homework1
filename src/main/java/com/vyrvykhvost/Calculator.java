package com.vyrvykhvost;

import java.util.ArrayList;
import java.util.List;



public class Calculator {
    public static  final  double FAULT = 1e-9;
    private double a = 2.3;

    /**
     * The method takes the parameter x and,
     * according to the condition,
     * substitutes it into a certain
     * expression and evaluates the expression
     * @param x
     * @return
     */
    public double calculate(double x) {
        if(x <= 0.3 + FAULT) {
            return 1.5 * a * Math.pow(Math.cos(x), 2);
        } else if(x > 2.3 + FAULT) {
            return 3 * a * Math.tan(x);
        } else {
            return Math.pow((x - 2), 2) + 6 * a;
        }
    }

    /**
     * The method counts the number of steps
     * to calculate the function in the given interval and step
     * @return
     */
    public int calculateStep() {
        int count = 0;
        for (double x = 0.2; x <= 2.8; x+= 0.002) {
            calculate(x);
            count++;
        }
        return count;
    }


    /**
     * The method returns an array of double values of all Y
     * @return
     */
    public double[] findArgY() {
        List<Double> doubleList = new ArrayList<>();
        for (Double elem : findArgX()) {
            doubleList.add(calculate(elem));
        }
        return toPrimitive(doubleList);
    }


    /**
     * The method returns an array of double values of all X
     * @return
     */
    public double[] findArgX() {
        List<Double> doubleList = new ArrayList<>();
        for (double x = 0.2; x <= 2.8; x+= 0.002) {
            doubleList.add(x);
        }
            return toPrimitive(doubleList);
        }

    /**
     * The method takes a list of double
     * elements and returns an array of double elements
     *
     * @param array a list with double elements that we pass to the method
     * @return
     */
    public  double[] toPrimitive(List<Double> array) {
        final double[] result = new double[array.size()];
        for (int i = 0; i < array.size(); i++) {
            result[i] = array.get(i).doubleValue();
        }
        return result;
    }


    /**
     * The method returns the maximum and minimum values
     * of the array passed to it.
     *
     * @param array array of double elements
     * @return
     */
    public String findMaxAndMin(double[] array) {
        double min = array[0];
        double max = array[0];
        double[] result = new double[2];
        for (double elem : array) {
            if(elem < min) {
                min = elem;
                result[0] = min;
            }
            if (elem > max) {
                max = elem;
                result[1] = max;
            }
        }
        return "Max = " + max + "\nMin = " + min;
    }

    /**
     * The method returns a double value
     * of the sum of all elements of the passed array
     *
     * @param array array of double elements
     * @return
     */
    public double findSum(double[] array) {
        double sum = 0.0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    /**
     * The method returns the arithmetic mean and the sum of the passed array
     *
     * @param array array of double elements
     */
    public String findAverage(double[] array) {
        double average = findSum(array) / array.length;
        return  "Average = " + average + "\nSum = " + findSum(array);
    }

    /**
     * The method returns the maximum
     * and minimum values of the array with the specified indices
     *
     * @param array array of double elements
     */
    public String findMaxMinWithIndex(double[] array) {
        double min = array[0];
        double max = array[0];
        int indexMax = 0;
        int indexMin = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
                indexMin = i;
            } else if (array[i] > max) {
                max = array[i];
                indexMax = i;
            }

        }

        return "Max = " + max + " withIndex: " + indexMax + "\nMin = " + min +
                " with index: " + indexMin;
    }

    /**
     * The method returns a double value
     * from the array of values Y at the given index
     *
     * @param index array index the element we want to get
     * @return
     */
    public double findElementFromIndex(int index) {
        double result = 0.0;
        double[] array = findArgY();
        for (int i = 0; i < array.length; i++) {
            result = array[index];
        }
        return result;
    }


}
