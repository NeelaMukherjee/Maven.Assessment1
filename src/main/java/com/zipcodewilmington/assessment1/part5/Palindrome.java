package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){

        String temp = "";
        StringBuffer stf;
        int count = 0;
        // Iterate the loop twice
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                // Get each substring
                temp = input.substring(i, j);

                // If length is greater than or equal to two
                // Check for palindrome
                if (temp.length() >= 2) {
                    // Use StringBuffer class to reverse the string
                    stf = new StringBuffer(temp);
                    stf.reverse();
                    // Compare substring wih reverse of substring
                    if (stf.toString().compareTo(temp) == 0)
                        count++;
                }
            }
        }
        // return the count
        return count+input.length();



    }
}
