
/**
 * Write a description of class CreditCard here.
 *
 * @author (22067841 Nirjal Byanjankar)
 * @version (1.0.0)
 */
public class CreditCard extends BankCard
{
    //new attributes are made
    private int cvcNumber;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;
    
    //constructor
    public CreditCard(int balanceAmount,int cardId,String bankAccount,String issuerBank, String clientName, int cvcNumber, double interestRate, String expirationDate)
    {
        super(balanceAmount,cardId,bankAccount,issuerBank);
        setclientName(clientName);
        this.cvcNumber = cvcNumber;
        this.interestRate = interestRate;
        this.expirationDate = expirationDate;
        this.isGranted = false;
    }
    
    //methods
    public void setCreditLimit(double creditLimit, int gracePeriod)
    {
        if (creditLimit <= 2.5 * getbalanceAmount()) {
            this.creditLimit = creditLimit;
            this.gracePeriod = gracePeriod;
            this.isGranted = true;
        } else {
            System.out.println("Credit cannot be issued.");
        }
    }
    
    public void cancelCreditCard()
    {
        if (isGranted == true) {
            this.cvcNumber = 0;
            this.creditLimit = 0;
            this.gracePeriod = 0;
            this.isGranted = false;
            System.out.println("Credit card cancelled successfully.");
        } else {
            System.out.println("No credit card to cancel.");
        }
    }
    
    public void display()
    {
        if (isGranted == true) {
            super.display();
            System.out.println("CVC number: " + cvcNumber);
            System.out.println("Credit limit: " + creditLimit);
            System.out.println("Interest rate: " + interestRate);
            System.out.println("Expiration date: " + expirationDate);
            System.out.println("Grace period: " + gracePeriod);
        } else {
            super.display();
            System.out.println("CVC number: " + cvcNumber);
            System.out.println("Interest rate: " + interestRate);
            System.out.println("Expiration date: " + expirationDate);
        }
    }

    public int getcvcNumber()
    {
        return cvcNumber;
    }
    
    public double getcreditLimit()
    {
        return creditLimit;
    }
    
    public double getinterestRate()
    {
        return interestRate;
    }
    
    public String getexpirationDate()
    {
        return expirationDate;
    }
    
    public int getgracePeriod()
    {
        return gracePeriod;
    }
    
    public boolean getisGranted()
    {
        return isGranted;
    }
}