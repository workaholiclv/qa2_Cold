import org.junit.jupiter.api.Test;

public class Hmwk_N1 {

    private String text = " EUR. Interest to pay for ";

    @Test
    public void interest2Pay() {

        intrstAmountPrint(30000, 10);
        intrstAmountPrint(30000, 8);
        intrstAmountPrint(30000, 6);

    }

    private void intrstAmountPrint(Integer a, Integer b) {
        Integer c = a * b / 100;
        System.out.println("Loan " + a + text + b + "% is: " + c + " EUR");

    }
      public static void main(String[] args){
        new Hmwk_N1().interest2Pay();
    }
}