public class CreditCardCvcState implements ICursorState {
    PinEntryMachine m;
    public CreditCardCvcState(PinEntryMachine m)
    {
        this.m=m;
    }
    public void setState() {
         setCursor();
    }
    public void setCursor() {
         m.cursor("CardCVC");

    }

    public void getState() {

    }
}
