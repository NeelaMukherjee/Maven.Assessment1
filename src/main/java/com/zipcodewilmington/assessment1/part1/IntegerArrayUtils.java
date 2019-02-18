package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {

        Integer summation = 0;

        for (int i=0 ;i< intArray.length ; i++){

            summation = summation +intArray[i];

        }

        return summation;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        Integer product = 1;

        for (int i=0 ;i< intArray.length ; i++){

            product = product * intArray[i];

        }

        return product;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {

        Double average = new Double(getSum(intArray)/intArray.length);

        //average = (getSum(intArray)/intArray.length);

        return average;
    }
}
