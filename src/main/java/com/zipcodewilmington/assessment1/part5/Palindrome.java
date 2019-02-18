package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){
        Character [] chars = {};

        int count = input.length();

        for (int i =0 ; i<input.length();i++) {

            chars[i] = input.charAt(i);

        }
        for (int j=0; j< input.length(); j++){

            if(chars[j]==chars[j+1]){


            }

        }




        return count;
    }
}
