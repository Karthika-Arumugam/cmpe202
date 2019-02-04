
public class Type1GumballMachine extends GumballMachine
{

   

    public Type1GumballMachine( int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
    }

     void insertCoin(int coin)
    {
        if ( coin == 25 )
        {System.out.println("gumballs:"+this.num_gumballs);
        
            this.has_quarter = true ;
        }
        else 
            this.has_quarter = false ;
    }
    
   
}
