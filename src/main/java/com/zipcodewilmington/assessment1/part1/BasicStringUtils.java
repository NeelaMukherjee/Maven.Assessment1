package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {

        String camel_case = "";

        //StringBuilder camel = new StringBuilder(str.length());

        Character ch = Character.toUpperCase(str.charAt(0));

        String camel_string = str.replace(str.charAt(0),ch);


        return camel_string;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {

        int len = str.length();
        String reverse1 = "";


        for (int i = 0; i < len; i++) {
            reverse1 = reverse1 + str.charAt(len - (i + 1));
        }


        return reverse1;

    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {


        String rev = reverse (str);

        String result = camelCase(rev);
        return result;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {

        int len = str.length();

        StringBuilder stringBuilder = new StringBuilder(str);

        stringBuilder.deleteCharAt(len-1);
        stringBuilder.deleteCharAt(0);

        String new_string = stringBuilder.toString();

        return new_string;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        return null;
    }
}
