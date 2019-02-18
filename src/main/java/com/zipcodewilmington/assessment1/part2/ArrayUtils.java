package com.zipcodewilmington.assessment1.part2;

import java.util.*;
import java.util.stream.Stream;


/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {

        int occur = 0;
        int len = objectArray.length;

        for (int i = 0; i < len; i++) {

            if (objectArray[i].equals(objectToCount)) {

                occur++;
            }
        }
        return occur;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {


        int len = objectArray.length;

        //String [] new_string

        Integer[] intarr = new Integer[len];

        int count = 0;

        for (int i = 0; i < len; i++) {

            intarr[i] = (Integer) objectArray[i];
        }

        for (int i = 0; i < len; i++) {

            if (intarr[i].equals(objectToRemove)) {
                intarr[i] = 0;
                count++;
                break;

            }
        }

        Integer[] new_string = new Integer[(len - count)];

        for (int i = 0,j=0; i < len; i++) {

            if (!(intarr[i].equals(0))) {
                //int j = 0;

                new_string[j] = intarr[i];

                j++;

            }

        }


        return new_string;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {


        int numOfelements = objectArray.length;

        // Object [] objectArray1 = new Integer [numOfelements];

        Integer[] objectArray1 = (Integer[]) objectArray;


        for (int i = 0; i < objectArray.length; i++) {

            objectArray1[objectArray1[i] % numOfelements] += numOfelements;
        }

        int max = objectArray1[0], result = 0;

        for (int j = 1; j < numOfelements; j++) {

            if (objectArray1[j] > max) {
                max = objectArray1[j];
                result = j;

            }
        }

        return result;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {

        int numOfelements = objectArray.length;

        Integer[] objectArray1 = (Integer[]) objectArray;

        Arrays.sort(objectArray1);

        int count = numOfelements + 1;
        int curr_count = 1;
        int res = -1;

        for (int i = 1; i < numOfelements; i++) {

            if (objectArray1[i] == objectArray1[i - 1]) {
                curr_count++;
            }
            //objectArray1[objectArray1[i] % numOfelements] += numOfelements;
            else {

                if (curr_count < count) {
                    count = curr_count;
                    res = objectArray1[i - 1];

                }
                curr_count = 1;
            }
        }

        if (curr_count < count) {
            count = curr_count;
            res = objectArray1[numOfelements - 1];

        }


        return res;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {


        int alen = objectArray.length;

        int blen = objectArrayToAdd.length;

        Integer[] intarr = new Integer[alen + blen];

        for (int i = 0; i < alen; i++) {

            intarr[i] = (Integer) objectArray[i];
        }

        for (int i = alen, j = 0; i < alen + blen; i++) {

            intarr[i] = (Integer) objectArrayToAdd[j];

            j++;
        }


        return intarr;
    }
}
