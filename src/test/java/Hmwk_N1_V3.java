
import org.junit.jupiter.api.Test;


public class Hmwk_N1_V3 {
    private String text = "Amount to pay ";

    @Test
    public void calculateLoanPayment () {

        int loanAmount = 30000;
        int termInYears = 10;
        double interestRate10 = 0.1;
        double interestRate8 = 0.08;
        double interestRate6 = 0.06;

        double toPayFirst10y = loanAmount * (1 + termInYears * interestRate10);
        double toPaySecond10y = loanAmount * (1 + termInYears * interestRate8);
        double toPayThird10y = loanAmount * (1 + termInYears * interestRate6);
        double totalPayment = toPayFirst10y+toPaySecond10y+toPayThird10y;

        System.out.println(text + "for 1st 10 years"+ " " + toPayFirst10y);
        System.out.println(text + "for 2nd 10 years"+ " " + toPaySecond10y);
        System.out.println(text + "for 3rd 10 years"+ " " + toPayThird10y);
        System.out.println("Tolal amount to pay" + " " + totalPayment);
    }

}