

public interface State {
       
	/*default void insertCoin(){
	    System.out.println("Check");
	   }*/
	   
	public void insertCoin();
	public void ejectQuarter();
	public void turnCrank();
        public void dispense();
	/*default void ejectQuarter() {
		state.ejectQuarter();
	}
 
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
	
	public void dispense()
	{
	    state.dispense();
	   }

	void setState(State state) {
		this.state = state;
	}*/
	
}
 

