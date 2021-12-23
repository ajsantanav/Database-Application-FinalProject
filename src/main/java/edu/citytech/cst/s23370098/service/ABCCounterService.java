package edu.citytech.cst.s23370098.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ABCCounterService {
    public static boolean isVowel(String digit) {
        boolean isVowel = Stream.of("a","e","i","o","u","A-a","E-e","I-i","O-o","U-u").anyMatch(digit::equalsIgnoreCase);
        return isVowel;
    }
    public static boolean isConsonant(String digit){
        boolean isConsonant = Stream.of
                ("b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","v","w","x","z","y","B-b","C-c","D-d",
                        "F-f","G-g","H-h","J-j","K-k","L-l","M-m","N-n","P-p","Q-q","R-r","S-s","T-t","V-v",
                        "W-w","X-x","Z-z","Y-y")
                .anyMatch(digit::equalsIgnoreCase);
        return isConsonant;
    }


    public static ArrayList<Character> countABC() {

        ArrayList<Character> list = new ArrayList<>();

        for (char c = 'A'; c<='Z'; ++c) {
            list.add(c);
        }
        for (char c = 'a'; c<='z'; ++c) {
            list.add(c);
        }

        return list;
    }

    public static boolean isEven(int digit){
        return (digit % 2 == 0);
    }

    public static boolean isOdd(int digit){
        return !isEven(digit);
    }

    public static List<Integer> count123() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int c = 1; c<=500; ++c) {
            list.add(c);
        }

        return list;
    }

        // Test portion
    public static List<Integer> count321() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int c = 500; c>= 1; c--) {
            list.add(c);
        }

        return list;
    }

    public static boolean isEvery6(int digit){
        return (digit % 6 == 0);
    }

    public static List<Integer> count369() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int c = 3; c<=1500; c=c+3) {
            list.add(c);
        }

        return list;
    }

    public static ArrayList<Character> countCBA() {

        ArrayList<Character> list = new ArrayList<>();

        for (char c = 'Z'; c>='A'; --c) {
            list.add(c);
        }
        for (char c = 'z'; c>='a'; --c) {
            list.add(c);
        }

        return list;
    }

    public static ArrayList<Character> countAa() {
        ArrayList<Character> list = new ArrayList<>();
        for (char c = 'A'; c<='Z'; ++c)
        {
            list.add(c);
        }
        return list;
    }

    public static boolean isContainsSeven(int digit){
        while(digit > 0)
        {
            if(digit%10 == 7)
            {
                break;
            }
            digit = digit/10;
        }
        return (digit>0);
    }
}
