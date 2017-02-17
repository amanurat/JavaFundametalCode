package com.training.basic.operator;

public class IncrementOperator {

    public static void main(String[] args) {

        int x = 0;
        int j = x++;

//        System.out.println(x);

//        System.out.println(j);


        for (int i = 1; i < 10; ++i) {
//            System.out.println(i);
        }
        System.out.println("### while loop ###");

        int w = 1;
        while (w < 10) {
//            System.out.println(w);
            ++w;
        }


//        int u = 0; System.out.println(++u);
//        for (int i=1; i< 5;i++) System.out.println(i);



        int y = 1;
        y += y++;
        System.out.println("y = " + y); // y = 2


        int z = 1;
        z += ++z;
        System.out.println("z = " + z); // z =3

    }
}
