package com.company;

import java.text.DateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //int[] arr = new int[] {1,3,4,5,6};
        //System.out.println(SimpleArraySum(arr));
        String s = "12:05:45PM";
        System.out.println(TimeConversion(s));
    }
    static int SimpleArraySum(int[] ar){
        return IntStream.of(ar).sum();
    }
    static String TimeConversion(String s){
        int hour = Integer.parseInt(s.substring(0,2));

        if (s.contains("PM")){
            if (hour == 12){
                return s.substring(0,8);
            }else {
                hour = hour + 12;
            }
            s = hour + s.substring(2,8);
        }else if (s.contains("AM")) {
            if (hour == 12){
                return "00" + s.substring(2,8);
            }else {
                s = s.substring(0,8);
            }
        }
        return s;
    }

}
