import java.text.DecimalFormat;

public class Carloan {
     double amount;  // total amount for car
    double downpay; // down payement for car loan
    double loan;    // total loan amount
    int duration; // Duration in years
    float intrest; // interest rate

    public Carloan(double amount, double downpay, int duration, float intrest) {
        this.amount = amount;
        this.downpay= downpay;
        this.duration = duration;
        this.intrest = intrest;
        this.loan=this.amount-this.downpay;
    }

    public double getTotalIntrest() {
        return loan*intrest/100*duration;
    }

    public double getMonthlyPayementLoan() {
        
        return (loan+getTotalIntrest())/(duration*12);
    }
    
    public String displaySummary(){
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        String message= " ";
        
        message+="Amount: " +df.format (amount)+ "\n";
         message+="Down payement: " + df.format(downpay)+ "\n";
          message+="Total Loan: " +  df.format(loan)+ "\n";
           message+="Duration: " +duration+ " year(s)\n";
            message+="Interest: " + df.format(intrest)+ "%\n";
             message+="Monthly Payement: " + df.format(getMonthlyPayementLoan())+ "\n";
        
        return message;
    }   
}
