import org.junit.jupiter.api.Test;

public class Hmwk_N1_V2 {

    private String text = " EUR. Interest to pay for ";
 
    private Integer loan = 30000;
    private Integer prct10 = 10;
    private Integer prct8 = 8;
    private Integer prct6 = 6;
    
    @Test
    public static void main(String[] args){
        new Hmwk_N1_V2().interest2Pay();
        new Hmwk_N1_V2().totalIntAm();
    }
    
    public void interest2Pay() {
        intrstAmountPrint(loan, prct10);
        intrstAmountPrint(loan, prct8);
        intrstAmountPrint(loan, prct6);
    }
    
    private void intrstAmountPrint(Integer a, Integer b) {
        Integer c = a * b / 100;
        System.out.println("Loan " + a + text + b + "% is: " + c + " EUR");
    }
    
    private void totalIntAm() {
        Integer intrSum = (loan * prct10 / 100) + (loan * prct8 / 100) + (loan * prct6 / 100);
        System.out.println("Total interest amount is: " + intrSum + " EUR");
    }

}