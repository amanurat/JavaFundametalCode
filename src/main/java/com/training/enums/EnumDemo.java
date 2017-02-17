package com.training.enums;

public class EnumDemo {

    public static void main(String[] args) {

        String day = getDay("10");
//        System.out.println(day);

        Day dayEnum = Day.SUNDAY;
        System.out.println(dayEnum);
        System.out.println(dayEnum.getValue());

        Day[] days = Day.values();
        for (Day dayObject : days) {
            System.out.println(dayObject);
        }

//        System.out.println(getDay(Day.SUNDAY));
//        System.out.println(getDay(Day.FRIDAY).toString());
    }
    public static String getDay(String day) { //

        if (day.equals("1")) {
            return "Sunday";
        } else if (day.equals("2")) {
            return "Monday";
        } else if (day.equals("3")) {
            return "Tuesday";
        }else if (day.equals("4")) {
            return "Wednesday";
        }else if (day.equals("5")) {
            return "Tuesday";
        }else if (day.equals("6")) {
            return "Friday";
        }else if (day.equals("7")) {
            return "Saturday";
        }else {
            return "don't know";
        }
    }

    public static String getDay(Day day) {

        if (day == Day.SUNDAY) {
            return "Today is Sunday";
        } else if (day == Day.MONDAY) {
            return "Today is Monday";
        } else if (day == Day.TUESDAY) {
            return "Today is Tuesday";
        } else {
            return "Today is Saturday";
        }


    }


}

