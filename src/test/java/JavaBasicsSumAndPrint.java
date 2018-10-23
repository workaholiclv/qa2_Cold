import org.junit.jupiter.api.Test;

//Class work Nr.1.

//Creating main class
public class JavaBasicsSumAndPrint {

    //String with text "Sum is"
    private String text = "Sum is ";
    
    //Adding Junit test component
    @Test
    public void someTwoDigits() {
        /* Integer a = 45;
        Integer b = 90; */

        /* double d = 1.50;
        double e = 99.30;

        double f = d + e;*/
//Adding 2 variables to use with "SumAndPring"
        sumAndPrint(45, 90);
        sumAndPrint(100, 30);
        sumAndPrint(200, 25);

        //System.out.println(text + "for double: "+  f);
    }
//Using formula to sum 2 variables from someTwoDigits and print out a result
    private void sumAndPrint(Integer a, Integer b) {
        Integer c = a + b + b;
        System.out.println(text + "for int: "+ c);

    }
}
