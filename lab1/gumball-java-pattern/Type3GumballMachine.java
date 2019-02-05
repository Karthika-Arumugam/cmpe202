
/**
 * Write a description of class Type3GumballMachine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Type3GumballMachine extends GumballMachine
{
    // instance variables - replace the example below with your own
    //private int amt;
   public Type3GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);

		this.count = numberGumballs;
 		if (numberGumballs > 0) {
			state = noQuarterState;
		} 
	}
	/*public void insertCoin()
	{
	   }*/
	   
	   
	
	public void insertCoin()
	{
	   
	    if(amt==50)
	    {
	        state.insertCoin();
	       }
	       else
	       {
	           
	           System.out.println("Gumball Cost 50 cents.Please insert Coin worth of"+(50-amt));
	       }
	   }

}