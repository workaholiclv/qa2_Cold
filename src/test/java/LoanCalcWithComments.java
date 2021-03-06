import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//Homework Nr.1.

//Creating main class
public class LoanCalcWithComments {

    // Variables for calculations: one (default) and loanPeriod (10 years)
    private int one = 1;
    private int loanPeriod = 10;

    // Variables for loanAmount and totalAmountToPay which we expect to receive
    private double takenLoanAmount = 2500;
    private double totalAmountToPay = 6000;

    //Printing to the screen expected loan amount to pay and calculated loan amount to pay
    //System.out.println("Expected loan amount to pay: " + totalAmountToPay + " EUR" + " . Calculated loan amount to pay" + loanAmountForThirtyYears + " EUR");

    @Test
    public void loanCalculation() {

        // Defyning type of variables, it should be double
        double loanAmountForThirtyYears, firstTenYearsToPay, secondTenYearsToPay, thirdTenYearsToPay;

        //Calculation for first 10 years when client will pay 10%
        firstTenYearsToPay = (takenLoanAmount * (one + loanPeriod * 0.1));

        //Calculation for second 10 years when client will pay 8%
        secondTenYearsToPay= (takenLoanAmount * (one + loanPeriod * 0.08));

        //Calculation for third 10 years when client will pay 6%
        thirdTenYearsToPay= (takenLoanAmount * (one + loanPeriod * 0.06));

        //Summaryzing loan amount for thirty years based on data from previous calculations
        loanAmountForThirtyYears = firstTenYearsToPay + secondTenYearsToPay + thirdTenYearsToPay;

        //Comparing our calculation result with expected result from variable totalAmountToPay
        Assertions.assertEquals(totalAmountToPay,loanAmountForThirtyYears,"Entered totalAmountToPay is incorrect!");

        //double loanAmountForThirtyYears = (takenLoanAmount(one + loanPeriod * 0.1)) + (takenLoanAmount(one + loanPeriod * 0.8)) + (takenLoanAmount(one + loanPeriod * 0.6));

    }
}
