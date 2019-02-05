

public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new Type1GumballMachine(5);
		GumballMachine gumballMachine2 = new Type2GumballMachine(5);
		GumballMachine gumballMachine3 = new Type3GumballMachine(5);

		System.out.println(gumballMachine);

		gumballMachine.insertCoin();
		gumballMachine.turnCrank();

		/*System.out.println(gumballMachine);

		gumballMachine.insertCoin();
		
		gumballMachine.turnCrank();
		gumballMachine.insertCoin();
		gumballMachine.turnCrank();gumballMachine.insertCoin();
		gumballMachine.turnCrank();
		gumballMachine.insertCoin();
		gumballMachine.turnCrank();*/
		

		System.out.println(gumballMachine);
		
		System.out.println(gumballMachine2);

		gumballMachine2.insertCoin();
		gumballMachine2.insertCoin();
		gumballMachine2.turnCrank();

		/*System.out.println(gumballMachine2);

		gumballMachine2.insertQuarter();
		
		gumballMachine2.turnCrank();
		gumballMachine2.insertQuarter();
		gumballMachine2.turnCrank();gumballMachine2.insertQuarter();
		gumballMachine2.turnCrank();
		gumballMachine2.insertQuarter();
		gumballMachine2.turnCrank();
		

		System.out.println(gumballMachine2);*/
		
		System.out.println(gumballMachine3);

		gumballMachine3.insertCoin();
		gumballMachine3.insertQuarter();
		gumballMachine3.insertQuarter();
		gumballMachine3.turnCrank();

		System.out.println(gumballMachine3);

		
	}
}
