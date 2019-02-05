

abstract class GumballMachine implements State {
 
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;

 
	State state = soldOutState;
	int count = 0,amt;
 
	
 
	abstract public void insertCoin() ;
        public void setState(State state) {
		this.state = state;
	}
	public void insertQuarter()
	   {
	        amt=amt + 25;
	       this.insertCoin();
	   }
	   public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
	public void dispense()
	{
	    state.dispense();
	   }
	   
	   public void ejectQuarter() {
		state.ejectQuarter();
	}
	  public void insertNikels()
	   {
	       amt=amt + 25;
	       this.insertCoin();
	   }
	  
	  public void insertDimes()
	   {
	       amt=amt + 25;
	       this.insertCoin();
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
		state = noQuarterState;
	}

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
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
