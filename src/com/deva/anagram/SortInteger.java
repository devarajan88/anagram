package com.deva.anagram;

import java.util.*;
import java.util.stream.*;


class Result {

    public static int sortDesc(int num) {
        char[] chars = ("" + num).toCharArray();
        ArrayList<Integer> integer = new ArrayList<>();
        for(int i = 0; i < chars.length; i++) {
            int value = chars[i];
            integer.add(value);
        }

        Collections.reverse(integer);
        String number = integer.toString();
        int result =Integer.parseInt(number);
        return result;
    }

    public static void main(String[] args) {
        int num = sortDesc(122353467);
        System.out.println(num);
    }

}