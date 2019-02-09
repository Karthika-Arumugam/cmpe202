

public class NoCoinState implements State {
    GumballMachine gumballMachine;
 
    public NoCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    public void insertCoin() {
        System.out.println("Got the amount,Please turn cranc");
        gumballMachine.setState(gumballMachine.getHasCoinState());
    }
 
    public void ejectQuarter(int coin) {
        System.out.println("You haven't inserted a valid coin.Coin returned "+coin +" cents");
    }
 
    public void turnCrank() {
        System.out.println("You turned, but there's no sufficient amount entered");
        
     }
 
    public void dispense() {
        System.out.println("You need to pay first");
    } 
 
    public String toString() {
        return "waiting for coin";
    }
}
