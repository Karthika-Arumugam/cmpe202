
/**
 * Write a description of class GumballMahine2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Type2GumballMachine extends GumballMachine
{
    

    public Type2GumballMachine( int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
    }

    void insertCoin(int coin)
    {
        if ( coin == 25 )
        {
            System.out.println("gumballs:"+this.num_gumballs);
             this.cost=this.cost+coin;       
             System.out.println("cost"+this.cost);
            if(this.cost==50)
            {
            System.out.println("Got 50 cents");
            this.cost=0;
            this.has_quarter = true ;
        }
            else
            {
                System.out.println("expecting one more Quarter");
            this.has_quarter = false ;
        }
        }
        else 
            this.has_quarter = false ;
    }
    
    /*public void turnCrank()
    {
    	if ( this.has_quarter )
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			this.has_quarter = false ;
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
    }*/
}
