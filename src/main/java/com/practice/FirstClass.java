package com.practice;

public class FirstClass {
    public static void main (String[] args){
        for (int i = 1; i <= 100; i++){
            System.out.println(convert(i));
        }
    }

    public static String convert (int something) {
        if (something%15 == 0) {
            return "Something";
        }
        if (something%3 == 0) {
            return "Some";
        }
        if (something%5 == 0){
            return "Thing";
        }

        return String.valueOf(something);
    }
}
