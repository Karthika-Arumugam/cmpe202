
/**
 * Write a description of class Type2GumballMachine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Type2GumballMachine extends GumballMachine
{
    // instance variables - replace the example below with your own
    private int amt=1;
    public Type2GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);

		this.count = numberGumballs;
 		if (numberGumballs > 0) {
			state = noQuarterState;
		} 
	}
	
	public void insertCoin()
	{
	    if(amt==2)
	    {
    state.insertCoin();
}
else{
    amt++;
    System.out.println("Gumball Cost 50 cents,Please insert one more Quarter");
}
}
}
