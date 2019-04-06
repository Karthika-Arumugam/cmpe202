public class CreditCardExpState implements ICursorState{
    PinEntryMachine m;
    public CreditCardExpState(PinEntryMachine m)
    {
        this.m=m;
    }
    public void setState() {
      setCursor();
    }

    public void setCursor() {
        m.cursor("CardExpiry");

    }

    public void getState() {

    }
}
