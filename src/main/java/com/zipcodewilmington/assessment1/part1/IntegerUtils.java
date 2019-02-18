package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        Integer sumOfInputs = 0;

        for (int i = 1; i <= n; i++) {

            sumOfInputs = sumOfInputs + i;
        }


        return sumOfInputs;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        Integer product = 1;

        for (int i = 1; i <= n; i++) {

            product = product * i;
        }



        return product;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {

StringBuilder rev = new StringBuilder(String.valueOf(val));

rev.reverse();

Integer reverseInt = Integer.valueOf(rev.toString());

        return reverseInt;
    }
}
