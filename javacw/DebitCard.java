
/**
 * Write a description of class DebitCard here.
 *
 * @author (22067841 Nirjal Byanjankar)
 * @version (1.0.0)
 */
public class DebitCard extends BankCard 
{
    //new attriputes are made
    private int pinNumber;
    private int withdrawalAmount;
    private String dateOfWithdrawal;
    private boolean hasWithdrawn;

    //constructor
    public DebitCard(int balanceAmount,int cardId,String bankAccount, String issuerBank, String clientName ,int pinNumber){
        super(balanceAmount,cardId,bankAccount,issuerBank);
        setclientName(clientName); 
        this.pinNumber = pinNumber;
        this.hasWithdrawn = false;
    }
    
    //methods 
    public void setWithdrawalAmount (int withdrawalAmount){// method used to set withdrawal amount
        this.withdrawalAmount = withdrawalAmount;
    }
    public void Withdrawal(int withdrawalAmount,String dateOfWithdrawal,int pinNumber){
        if(this.pinNumber == pinNumber && super.getbalanceAmount() >= withdrawalAmount ){
            super.setbalanceAmount(super.getbalanceAmount() - withdrawalAmount);
            this.withdrawalAmount = withdrawalAmount;
            this.dateOfWithdrawal = dateOfWithdrawal;
            this.hasWithdrawn = true;
            System.out.println("Withdrawal has been successful.");
            System.out.println("New Balance: " + super.getbalanceAmount());
        }
        else if(this.pinNumber != pinNumber){
            System.out.println("Invalid PIN number.Withdrawal unsuccessful.");
        }
        else{
            System.out.println("Insufficient balance ammount.Withdrawal unsuccessuful");
        }
    }
    public void display() {
        super.display();
        System.out.println("Pin number: " + pinNumber);
        if (hasWithdrawn == true) {
            System.out.println("Withdrawal amount: " + withdrawalAmount);
            System.out.println("Date of withdrawal: " + dateOfWithdrawal);
        } else {
            System.out.println("No withdrawal has been made yet.");
        }
    }
     public int getPinNumber(){
        return pinNumber;
    }
    public int getWithdrawalAmount(){
        return withdrawalAmount;
    }
    public String getDateOfWithdrawal(){
        return dateOfWithdrawal;
    }
    public boolean getHasWithdrawn(){
        return hasWithdrawn;
    }
}