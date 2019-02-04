

public class Main {

	public static void main(String[] args) {
	GumballMachine gumballMachine = new Type1GumballMachine(5);
		GumballMachine gumballMachine2 = new Type2GumballMachine(5);
		GumballMachine gumballMachine3 = new Type3GumballMachine(5);

		System.out.println("gumballMachine1 status"+gumballMachine);

		gumballMachine.insertCoin( 25 );
		gumballMachine.turnCranc();
		System.out.println("gumballMachine1 status"+gumballMachine);

		gumballMachine.insertCoin( 25 );
		gumballMachine.turnCranc();
		
		System.out.println("gumballMachine1 status"+gumballMachine);

		gumballMachine.insertCoin( 25 );
		gumballMachine.turnCranc();

		System.out.println("gumballMachine2 status"+gumballMachine2);
		
		gumballMachine2.insertCoin( 25 );
		gumballMachine2.insertCoin( 25 );

		gumballMachine2.turnCranc();
                System.out.println("gumballMachine3 status"+gumballMachine3);
                gumballMachine3.insertCoin( 10 );
                gumballMachine3.insertCoin( 5 );
                gumballMachine3.insertCoin( 10);
                gumballMachine3.insertCoin( 25 );
                
                gumballMachine3.turnCranc();
                

		System.out.println("gumballMachine2 status"+gumballMachine2);
		
		
		    gumballMachine2.insertCoin( 25 );
		gumballMachine2.insertCoin( 25 );

		gumballMachine2.turnCranc();
                System.out.println("gumballMachine3 status"+gumballMachine3);
                gumballMachine3.insertCoin( 10 );
                gumballMachine3.insertCoin( 5 );
                gumballMachine3.insertCoin( 10);
                gumballMachine3.insertCoin( 25 );
                
                gumballMachine3.turnCranc();
                
                
                
                
                
		/*gumballMachine.insertCoin( 25 );
		gumballMachine.turnCrank();
		gumballMachine.insertCoin( 25 );
		gumballMachine.turnCrank();*/

		//System.out.println("gumballMachine1 status"+gumballMachine);
		//System.out.println("gumballMachine2 status"+gumballMachine2);
	}
}
