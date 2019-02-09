

 class GumballMachine implements State{
        //instance varaibale Declaration an initiation
    State soldOutState;
    State noCoinState;
    State hasCoinState;
    State soldState;
    Process p;

        
    State state = soldOutState;
    int count = 0,amt,i=0;
    int coins[];
    
    //Constructor for GumballMachine Class
    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        soldState = new SoldState(this);
        

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noCoinState;
        } 
    }
     
    
    

   public void insertCoin1()
   {
    
    state.insertCoin1();
       
   }


   public void insertType()
   {
    
   
               
                this.insertCoin1();
            
    
               
    
   }

   public void insertType2()
   {
           
            
        amt+=25;
         
         if(amt>=50)
            {  
                if((state==hasCoinState)){
                System.out.println("Gumball Cost is 50 cents, you entered more amount .Please get the change");
                ejectCoin(25);
                //amt=amt-50;
            }
            else
                insertCoin1();
                //amt=0;
            }
        
            else if(amt<50)
            {
            System.out.println("Gumball cost is 50 cents, please enter more coins for "+(50-amt)+"cents");
    
        }     
            
    
               
    
    }

   public void insertType3(int coin)
   {     
       
    
           amt+=coin;
         
         if(amt>=50)
            {  
                if((state==hasCoinState)){
                System.out.println("Gumball Cost is 50 cents, you entered more amount .Please get the change");
                ejectCoin(coin);
                //amt=amt-50;
            }
            else
                insertCoin1();
                //amt=0;
            }
        
            else if(amt<50)
            {
            System.out.println("Gumball cost is 50 cents, please enter more coins for "+(50-amt)+"cents");
    
        }     
            
    
               
               
    
    }
    

    public void setState(State state) {
           this.state = state;
    }
    
        public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }
    public void dispense()
    {
        state.dispense();
       }
       
    public void ejectCoin(int coin) {
        state.ejectCoin(coin);
    }
      
    
    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }
 
    int getCount() {
        return count;
    }
 
    void refill(int count) {
        this.count = count;
        state = noCoinState;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getHasCoinState() {
        return hasCoinState;
    }

    public State getSoldState() {
        return soldState;
    }
 
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
