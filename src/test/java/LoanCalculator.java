import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// Homework Nr.1.

public class LoanCalculatorTest {
    private int takenLoanAmount = 2500;
    private int totalAmountToPay = 13500;

    @Test
    public void CalculationOfLoan() {

        double loanAmountForThirtyYears, firstTenYearsToPay, secondTenYearsToPay, thirdTenYearsToPay;

        firstTenYearsToPay = amountReceived(0.1);
        secondTenYearsToPay = amountReceived(0.08);
        thirdTenYearsToPay = amountReceived(0.06);
        
        loanAmountForThirtyYears = firstTenYearsToPay + secondTenYearsToPay + thirdTenYearsToPay;

        Assertions.assertEquals(totalAmountToPay, loanAmountForThirtyYears, "Total amount and calculated amount not equal!");
    }

    private double amountReceived(double percent) {
        return takenLoanAmount * (1 + 10 * percent);
    }
}
