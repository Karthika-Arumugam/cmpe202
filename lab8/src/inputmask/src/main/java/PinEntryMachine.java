public class PinEntryMachine implements IPinObserver{
    private ICursorState state;
    private ICursorState cardNumber;
    private ICursorState cardExp;
    private ICursorState cardCvc;
    private String Statename="CardNumber";
    private int count;
    public PinEntryMachine(){
        cardNumber=new CreditCardNumState(this);
        cardExp=new CreditCardExpState(this);
        cardCvc=new CreditCardCvcState(this);
        this.state =cardNumber ;

    }

    public void cursorChange(int count) {

         this.count=count;
         setState();
    }

    public void setState() {
        if(this.count<=16)
            cardNumber.setState();
        else if(this.count<21)
            cardExp.setState();
       else  if(this.count==21)
            cardCvc.setState();
    }

    public void cursor(String s)
    {
        this.Statename= s;
    }

    public String getstateName()
    {
        return this.Statename;
    }
}
