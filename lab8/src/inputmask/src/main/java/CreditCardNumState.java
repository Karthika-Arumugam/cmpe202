public class CreditCardNumState implements ICursorState {
    PinEntryMachine m;
    public CreditCardNumState(PinEntryMachine m)
    {
        this.m=m;
    }
    public void setState() {
       setCursor();
    }

    public void setCursor() {
         m.cursor("CardNumber");

    }


}
