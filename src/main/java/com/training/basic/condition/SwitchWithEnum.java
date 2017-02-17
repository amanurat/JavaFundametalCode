package com.training.basic.condition;
public class SwitchWithEnum {

    public static void main(String[] args) {
        Month month = Month.FEBRUARY;

        switch (month) {
            case JANUARY:
                System.out.println("It's the first month");
                break;
            case FEBRUARY:
                System.out.println("It's the second month : " + month);
                break;
            case MARCH:
                System.out.println("It's the third month");
                break;
            default:
                System.out.println("You choose another month");
                break;
        }

    }

    public void test() {

    }

}
