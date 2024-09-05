import java.text.DecimalFormat;

public class HouseLoan {
    double Price,downpay,loan;
    int duration;
    float interest;

    public HouseLoan(double Price, double downpay, int duration, float interest) {
        this.Price = Price;
        this.downpay = downpay;
        this.duration = duration;
        this.interest = interest;
        this.loan= this.Price-this.downpay;
        
    }
    
    public double getTotalIntrest(){
     return interest*loan/100*duration;
     
    }
      
       public double getMonthlypayementloan(){
           return (loan+ getTotalIntrest())/(duration*12);
       }
       
       public String dispaySummary(){
           DecimalFormat fd = new DecimalFormat();
           fd.setMaximumFractionDigits(2);
           
           String Message="";
        
                 Message+= "Amount : "+ fd.format(Price)+"\n";
          Message+= "Down payement : "+ fd.format(downpay)+"\n";
                   Message+= "Loan : "+ fd.format(loan)+"\n";
               Message+= "Duration : "+ duration+"\n";
               Message+= "Interest : "+ fd.format(interest)+"%\n";
         Message+="Monthly Payement: "+fd.format(getMonthlypayementloan());
               
               return Message;
               
       }
}   

    
