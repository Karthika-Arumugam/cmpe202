import java.lang.*;

 class GumballMachine implements State,Type1GM,Type2GM,Type3GM{
        //instance varaibale Declaration an initiation
    State soldOutState;
    State noCoinState;
    State hasCoinState;
    State soldState;  
    State state = soldOutState;
    int count = 0,amt;
    String machinetype;
    
    
    //Constructor for GumballMachine Class
    public GumballMachine(int numberGumballs,String type) {
        soldOutState = new SoldOutState(this);
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        soldState = new SoldState(this);
        machinetype=type;
       // gm=this;
        //costMethod=cost;

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noCoinState;
        } 
    }
     
     public GumballMachine insert(){        
    
    return this;
       
   }
    
    public void insertCoin(){        
    
    state.insertCoin();
       
   }
   
        
       public void insertCoin(int coin)
   {   if(machinetype.equals("Type1")){
          Type1GM gm=this;
          gm.costProcess1(coin);
            
        } 
        else if(machinetype.equals("Type2")){
          Type2GM gm=this;
          gm.costProcess2(coin);
            
        } 
        else{
         if(machinetype.equals("Type3")){
          Type3GM gm=this;
          gm.costProcess3(coin);
            
        } 
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
       
    public void ejectQuarter(int coin) {
        state.ejectQuarter(coin);
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



