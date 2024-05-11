 /**
 * Write a description of class BankCard here.
 *
 * @author (22067841 Nirjal Byanjankar) 
 * @version (1.0.0)
 */
public class BankCard
{
    //attributes{kept private}
    //declaring the attributes
    private int cardId; 
    private String clientName = ""  ;
    private String issuerBank;
    private String bankAccount;
    private int balanceAmount;

    //constructor
    public BankCard(int balanceAmount,int cardId,String bankAccount,String issuerBank){ //constructor that accepts 4 parameters
        this.balanceAmount = balanceAmount;//initializing attributes with parameters 
        this.cardId = cardId;
        this.bankAccount = bankAccount;
        this.issuerBank = issuerBank;

    }
    
    //methods
    public int getcardId(){
        return this.cardId;
    }
    public void setclientName(String clientName){
        this.clientName = clientName;
    }
    public void setissuerBank(String issuerBank){
        this.issuerBank = issuerBank;
    }
    public void setbalanceAmount(int balanceAmount){
        this.balanceAmount = balanceAmount;
    }
    public int getbalanceAmount(){
        return this.balanceAmount;
    }
    public void display(){
        if(this.clientName == ""){
            System.out.println("Client Name is Empty");

        }
        else{
            System.out.println("the Bank CardId:" + cardId);
            System.out.println("the client Name:" + clientName);
            System.out.println("the Issuer Bank:" + issuerBank);
            System.out.println("the Bank Account:" + bankAccount);
            System.out.println("the Balance Amount:" + balanceAmount);
        }
    }
}