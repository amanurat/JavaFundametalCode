package com.training.exception;

/**
 * Date: 10/3/2014
 * Time: 12:07 PM
 *
 * @author assanai.manurat
 */
public class ExceptionDemo {


    public static void main(String[] args) {

        Long l1;
        try {
//            l1 = new Long("sss");
//            System.out.println(l1);

            Long longResult = createNumber("");
            System.out.println("longResult is : "+ longResult);

        } catch (NumberFormatException e) {
            System.out.println("Cannot create long number!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("OOP!, Cannot parse the number");
            //when has exception will assign l1 to 2
            l1 = 2l;

            System.out.println("l1 is : " + l1);
        } finally {
            System.out.println("Good bye...");
        }
    }

    private static Long createNumber(String str) {

        if (str.equals("")) {
//            throw new IllegalArgumentException("IllegalArgumentException : Should not be empty");
        }

        return Long.parseLong(str);
    }

}
