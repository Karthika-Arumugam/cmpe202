
/**
 * Write a description of interface GmMixin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public interface Type1GM 
{
    /**
     * An example of a method header - replace this comment with your own
     *
     * @param  y a sample parameter for a method
     * @return   the result produced by sampleMethod
     */
   
    public GumballMachine insert();
    
    default public void costProcess1(int coin)
        {
        if(insert().machinetype.equals("Type1"))
        {
        if(coin==25)
        insert().insertCoin();
        else
        insert().ejectQuarter(coin);
    }
}
}
      /*  else if(insertCoin().machinetype.equals("Type2"))
        {if (coin==25)
            {
        fiftyCentsGM(coin,insertCoin());
    }
        else
        insertCoin().ejectQuarter(coin);
    }
        else if (insertCoin().machinetype.equals("Type3"))
        {
        fiftyCentsGM(coin,insertCoin());    
        }
    } 

    
    
    
    
    default public void fiftyCentsGM(int coin,GumballMachine gm)
    {
        gm.amt+=coin;
         
         if(gm.amt>=50)
            {  
                if((gm.state==gm.hasQuarterState)){
                System.out.println("Gumball Cost is 50 cents, you entered more amount .Please get the change");
                gm.ejectQuarter(25);
                //amt=amt-50;
            }
            else
                gm.insertCoin1();
                //amt=0;
            }
        
            else if(gm.amt<50)
            {
            System.out.println("Gumball cost is 50 cents, please enter more coins for "+(50-gm.amt)+"cents");
    }

}
}*/