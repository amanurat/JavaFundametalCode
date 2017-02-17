package com.training.oop.inheritance;

/**
 * Created by amanurat on 11/13/14 AD.
 */
public class Hello {

    public static void main(String args[]){

//        System.out.println("com.training.oop.inheritance.Hello.statements.Hello world");


//        variable();
//        arrays();
//        ifelse();
//        switchcase();
//        whileFunction();
//        doWhileFunction();
//        forFunction();
//        forEachFunction();

//        breakFunction();
//        continueFunction();



//        returnTypeValue();
        returnFunction();
    }

    private static void returnTypeValue() {
        String name = "Assanai Manurat";

        String resultMessage = sayHello(name);
        System.out.println(resultMessage);

        int addResult = add(1, 2);
        System.out.println("add result : "+ addResult);
    }

    private static void returnFunction() {

        for (int i = 0; i < 5; i++) {

            if (i == 3) {
                return;
            }
            System.out.println(i);
        }

    }

    private static int add(int number1, int number2) {
        return number1 + number2;
    }

    private static String sayHello(String message) {

        return "Hi, "+ message;
    }

    private static void continueFunction() {
        System.out.println("### continue ###");


        int[] i =new int[]{1,2,3,4,5};

        for (int x = 0; x < 5; x++) {

            if (x == 3) {
                continue;
            }

            System.out.println("i = " + i[x]);
        }

    }

    private static void breakFunction() {
        System.out.println("### break ###");
        int[] i =new int[]{1,2,3,4,5};

        for (int x = 0; x < 5; x++) {

            if (x == 3) {
                break;
            }

            System.out.println("i = " + i[x]);
        }

    }

    private static void forEachFunction() {
        System.out.println("### for-each ###");
        int[] i =new int[]{1,2,3,4,5};

        for (int x : i) {
            System.out.println("i = "+x);
        }
    }

    private static void doWhileFunction() {
        System.out.println("### do-while ###");
        int[] i =new int[]{1,2,3,4,5};

        int count = 0;
        do {
            System.out.println("i = "+ i[count]);
            count += 1;
        } while (count < 5);

    }

    private static void forFunction() {
        System.out.println("### for ###");
        int[] i =new int[]{1,2,3,4,5};
        for (int count = 0; count < 5; count++) {
            System.out.println("i = " + i[count]);
        }

    }

    private static void whileFunction() {
        System.out.println("### while ###");
        int[] i =new int[]{1,2,3,4,5};

        int count = 0;
        while (count < 10) {
            System.out.println("i = "+ i[count]);
            count++;
        }
    }

    private static void switchcase() {
        System.out.println("### switch ###");
        int i = 3;
        switch (i) {
            case 0 :
                System.out.println(i);
                break;
            case 1 :
                System.out.println(i);
                break;
            default:
                System.out.println("Sorry not matched");
                break;
        }
    }

    private static void ifelse() {
        System.out.println("### if-else ###");
        int i1 = 3;

        if (i1 == 0) {
            //Statement
            System.out.println(i1);
        } else if (i1 == 1) {
            System.out.println(i1);
        } else {
            System.out.println("Sorry not matched");
        }
    }

    public static void variable() {
        byte b = 100;
        int i = 10;
        long l = 100;
        float f = 10.00f;
        double d = 100.00;
        char c = 'c';
        boolean bl = true;


        long l2 = i;

        int i2 = (int)l2;
        System.out.println("l2 : "+ l2);
        System.out.println("i2 : "+ i2);

        String s = "Assanai Manurat" + ".";


        /*System.out.println("byte : " +b);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(s);
        System.out.println(bl);*/
    }

    public static void arrays() {
        int[] intArray2 = new int[]{1, 2, 3, 4, 5};
        System.out.println(intArray2[0]);
        System.out.println(intArray2[1]);
        System.out.println(intArray2[2]);
        System.out.println(intArray2[3]);
        System.out.println(intArray2[4]);
    }
}
