package com.training.basic.flow;
class BreakDemo {
    public static void main(String[] args) {

        int[] arrayOfInteger = {32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127};
        int searchFor = 12;

        int i;
        boolean foundIt = false;

        for (i = 0; i < arrayOfInteger.length; i++) {
            if (arrayOfInteger[i] == searchFor) {
                foundIt = true;
                break;
            }
        }

        if (foundIt) {
            System.out.println("Found " + searchFor + " at index " + i);
        } else {
            System.out.println(searchFor + " not in the array");
        }
    }
}