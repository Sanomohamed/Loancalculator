import java.text.DecimalFormat;

public class CreaditLoan {
    
   double price, downpa,loan;
   int year;
   float interes;

    public CreaditLoan(double price, double downpa, int year, float interes) {
        this.price = price;
        this.downpa = downpa;
        this.year = year;
        this.interes = interes;
        this.loan= this.price- this.downpa;
    }
    
    public double getsumInteres(){
        
        return interes*loan/100*year;
    }
    
    public double getMonthlypay(){
        
        return (loan+getsumInteres())/(12*year);
    }
    
    public String dispaySummary(){
        
        String Message="";
        
         DecimalFormat df = new DecimalFormat();
         df.setMaximumFractionDigits(2);
         
         Message+=           "Price: "+df.format(price)+"\n";
         Message+=   "Down Payement: "+df.format(downpa)+"\n";
         Message+=      "Total Loan: "+df.format(loan)+"\n";
         Message+=            "Year: "+df.format(year)+"\n";
         Message+=        "Interest: "+df.format(interes)+"%\n";
         Message+="Monthly Payement: "+df.format(getMonthlypay());
         
        return Message;
    }   
}
