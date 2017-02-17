package com.training.basic.datatype;

public class TypeConversion {

    public static void main(String[] args) {
        int integer1 = 10;
        long longImplicitValue = integer1;

        System.out.println("integer1 : "+ integer1);
        System.out.println("longImplicitValue : "+ longImplicitValue);


        long long1 = 100;
        int integerExplicitValue = (int) long1;
        System.out.println("integerExplicitValue : "+ integerExplicitValue);

    }

}
