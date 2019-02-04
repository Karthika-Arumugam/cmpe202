
/**
 * Write a description of class GumballMachine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class GumballMachine
{
    // instance variables - replace the example below with your own
    protected int num_gumballs;
    protected boolean has_quarter;
    protected int cost;
    
    
    abstract void insertCoin(int coin);
    protected void turnCranc()
    {
    	if ( has_quarter )
    	{
    		if ( num_gumballs > 0 )
    		{
    			num_gumballs-- ;
    			has_quarter = false ;
    			System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
    		}
    	}
    	else 
    	{
    		System.out.println( "Please insert a quarter" ) ;
    	}        
    }
    

    
}
