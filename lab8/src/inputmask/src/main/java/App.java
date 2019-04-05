/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

/**
 *  Main App Class for Displaying Screen.
 */
public class App {

    private Screen screen;
    private IDisplayComponent num;
    private IDisplayComponent exp;
    private IDisplayComponent creditcard,creditexp,creditcvc;

    private CreditCardCVC cvc;
    private int count;

    public App() {

        screen = new Screen();
        creditcard=new CreditCardNum(screen);
        creditexp=new CreditCardExp(screen);
        num = new ConcreteCardNumDecorator(creditcard);
        exp = new ConcreteCardExpDecorator(creditexp);
        cvc = new CreditCardCVC(screen);


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
        output+="====="+screen.cur_name()+"=================\n";
        return output;
    }

    public void key(String ch) {
        try {

                if (ch.equalsIgnoreCase("X")) {
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

            } catch(Exception e){

            }

    }

}

