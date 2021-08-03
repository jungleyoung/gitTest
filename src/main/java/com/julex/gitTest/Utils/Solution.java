package com.julex.gitTest.Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author Julex yangjie
 * @Date 2021/7/31 14:54
 * @Version 1.0
 **/
public class Solution {

    public static void main(String[] args) throws ParseException {
        weekDays();
    }

    public static void weekDays() throws ParseException {
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = dateFormat1.parse("2021-08-08");
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        System.out.println(instance.get(Calendar.DAY_OF_WEEK));
    }
}
