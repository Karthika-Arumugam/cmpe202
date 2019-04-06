/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

/**
 *  Main App Class for Displaying Screen.
 */
public class App {

    private Screen screen;
    private IDisplayComponent num;
    private IDisplayComponent exp;
    private IDisplayComponent creditcard,creditexp,creditcvc;
    private IPinObserver pin;

    private CreditCardCVC cvc;
    private int count;

    public App() {

        screen = new Screen();
        creditcard=new CreditCardNum(screen);
        creditexp=new CreditCardExp(screen);
        num = new ConcreteCardNumDecorator(creditcard);
        exp = new ConcreteCardExpDecorator(creditexp);
        cvc = new CreditCardCVC(screen);
        pin=new PinEntryMachine();
        this.registerObserver(pin);

        screen.addSubComponent(num);
        screen.addSubComponent(exp);
        screen.addSubComponent(cvc);

     screen.setState(creditcard);

        count = 1;

    }

    public String display() {
        String output = "";
        output += "========================================\n";
        output += screen.name() + "\n";
        output += "========================================\n";
        output += "\n\n\n\n";
        output += screen.display() + "\n";
        output += "\n\n\n\n";
        output += "========================================\n";
        output+="====="+pin.getstateName()+"=================\n";
        return output;
    }

    public void key(String ch) {
        try {
            System.out.println("count:"+count);


                if (ch.equals("X")) {

                    if(count>23)
                        count=24;
                    if (count <= 1) {
                        return;
                    }
                    count--;
                    screen.key(ch, count);
                } else if (Integer.parseInt(ch) >= 0 || Integer.valueOf(ch) <= 9) {

                    if(count<=23)
                    screen.key(ch, count);
                    count++;
                }
            if(count==1||count==17||count==21||count==20||count==16)
            {
                System.out.println("notifying because the count is:"+count);
                notifyObserver();
            }


            } catch(Exception e){

            }

    }

    /**
     * register Observer
     * @param obj Observer Object to register
     */
    public void registerObserver(IPinObserver obj) {
        this.pin = obj;
    }

    /**
     * reove observer
     * @param obj Screen Observer to Remove
     */
    public void removeObserver(IPinObserver obj) {
        this.pin = null;


    }
void notifyObserver(){
        if(pin!=null)
        pin.cursorChange(count);
}

}

