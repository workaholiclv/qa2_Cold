import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//Homework Nr.1.

public class LoanCalculator {
    private int loanPeriod = 10;
    private int takenLoanAmount = 2500;
    private int totalAmountToPay = 13500;

   @Test
    public void loanCalculation() {
        double loanAmountForThirtyYears, firstTenYearsToPay, secondTenYearsToPay, thirdTenYearsToPay;

        firstTenYearsToPay = (takenLoanAmount * (1 + loanPeriod * 0.1));
        secondTenYearsToPay = (takenLoanAmount * (1 + loanPeriod * 0.08));
        thirdTenYearsToPay = (takenLoanAmount * (1 + loanPeriod * 0.06));
        loanAmountForThirtyYears = firstTenYearsToPay + secondTenYearsToPay + thirdTenYearsToPay;

        Assertions.assertEquals(totalAmountToPay, loanAmountForThirtyYears, "Entered totalAmountToPay is incorrect!");
    }
}
