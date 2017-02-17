package com.training.basic.flow;
public class BreakTest {

    public static void main(String[] args) throws Exception {
        breakJump();

//        System.out.println(message("java"));
//        System.out.println(message(null));
    }

    private static String message(String str) {

        if (str == null) {
            throw new IllegalArgumentException("parameter should not null");
        }

        return "Hello " + str;
    }

    private static void breakJump() {
        String[] str = new String[]{"a","b","c","e","d","e"};

        String find = "e";
        int foundIndex = 0;
        for (int i = 0; i < str.length; i++) {

            if (find.equals(str[i])) {
                System.out.println(str[i]);
                return;
            }
            foundIndex++;
        }

        System.out.println("Found "+ find + " at index "+ foundIndex);
    }
}
