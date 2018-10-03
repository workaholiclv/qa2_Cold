import org.junit.jupiter.api.Test;

public class First_03_10 {

    private String text = "Sum is ";

    @Test
    public void someTwoDigits() {
        /* Integer a = 45;
        Integer b = 90; */

        /* double d = 1.50;
        double e = 99.30;

        double f = d + e;*/

        sumAndPrint(45, 90);
        sumAndPrint(100, 30);
        sumAndPrint(200, 25);

        //System.out.println(text + "for double: "+  f);
    }

    private void sumAndPrint(Integer a, Integer b) {
        Integer c = a + b + b;
        System.out.println(text + "for int: "+ c);

    }
}
