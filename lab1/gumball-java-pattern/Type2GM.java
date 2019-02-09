
/**
 * Write a description of interface Type2GM here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface Type2GM 
{
    /**
     * An example of a method header - replace this comment with your own
     *
     * @param  y a sample parameter for a method
     * @return   the result produced by sampleMethod
     */
    
    public GumballMachine insert();
   default public void costProcess2(int coin)
   {
       insert().amt+=coin;
         
         if(insert().amt>=50)
            {  
                if((insert().state==insert().hasCoinState)){
                System.out.println("Gumball Cost is 50 cents, you entered more amount .Please get the change");
                insert().ejectQuarter(coin);
                //amt=amt-50;
            }
            else
                insert().insertCoin();
                //amt=0;
            }
        
            else if(insert().amt<50)
            {
            System.out.println("Gumball cost is 50 cents, please enter more coins for "+(50-insert().amt)+"cents");
    
        }
       
}
}