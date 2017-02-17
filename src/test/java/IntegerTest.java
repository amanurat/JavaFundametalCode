import org.junit.Assert;
import org.junit.Test;

public class IntegerTest {

    @Test
    public void testCompare_100_AutoBoxing() throws Exception {

        int i = 100;
        Integer integer = 100;

        Assert.assertTrue(i == integer);

    }

    @Test
    public void testCompare_1000_AutoBoxing() throws Exception {

        int i = 1000;
        Integer integer = 1000;
        String a = "";

        System.out.println(i == integer);
        Assert.assertTrue(i == integer);

    }

    @Test
    public void testCompare_100_Multiple_Primitive() throws Exception {

        int a = 1000, b = 1000;

        System.out.println(a == b);
        Assert.assertTrue(a == b);

    }

    @Test
    public void testCompare_100_Multiple_Class() throws Exception {

        Integer a = 1000, b = 1000;



        Integer c = 128, d = 128;

        System.out.println(a == b);
        Assert.assertTrue(a == b);

        System.out.println(c == d);
        Assert.assertTrue(c == d);

    }

    @Test
    public void testCompare_100_Multiple_Class_ValueOf() throws Exception {

        Integer a = 1000, b = 1000;

        Integer c = Integer.valueOf(1000);
        Integer d = Integer.valueOf(1000);
        int e = 1000;

        System.out.println(c == d);
        System.out.println(c == e);

//        Assert.assertTrue(c == d);

    }

    @Test
    public void testCompareNewIntegerLessThan100() throws Exception {

        Integer a = new Integer(127);
        Integer b = new Integer(127);

        System.out.println(a == b);

    }

    @Test
    public void testAutoBoxigNullToZero() throws Exception {

        Integer integer = null;
        int i = integer;

        System.out.println(i);


    }
}
