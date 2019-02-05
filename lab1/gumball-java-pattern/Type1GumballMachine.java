
/**
 * Write a description of class Type1GumballMachine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Type1GumballMachine extends GumballMachine 
{
    // instance variables - replace the example below with your own
    
    public Type1GumballMachine(int numberGumballs) {
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
	 System.out.println("Just Entered Quarter");   
    state.insertCoin();
}
}