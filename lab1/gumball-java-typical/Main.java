 

public class Main {

public static void main(String[] args) {
      GumballMachine gumballMachine = new GumballMachine(5);
      GumballMachine gumballMachine2 = new GumballMachine(5);
      GumballMachine gumballMachine3 = new GumballMachine(5);
  
     Type1GumballMachine gm1 = coin->{if(coin==25) gumballMachine.insertType();
                                        else {System.out.println("Please enter Quarter only");
                                        gumballMachine.ejectCoin(coin);}};
                                        
                                        
     Type2GumballMachine gm2 = coin->{if(coin==25) gumballMachine2.insertType2();
                                        else {System.out.println("Please enter Quarter only");
                                            gumballMachine.ejectCoin(coin);}};


     Type3GumballMachine gm3 = coin->{ gumballMachine3.insertType3(coin);
                                        };
                                        
     System.out.println(gumballMachine);

    gm1.insertCoin(25);
  
    gumballMachine.turnCrank();
    gm1.insertCoin(10);
     gumballMachine.turnCrank();



     System.out.println(gumballMachine);
     System.out.println(gumballMachine2);

     gm2.insertCoin(25);
     gm2.insertCoin(25);
     gumballMachine2.turnCrank();
     gm2.insertCoin(5);
     gumballMachine2.turnCrank();

     System.out.println(gumballMachine2);
    
     System.out.println(gumballMachine3);

     gm3.insertCoin(25);
     gm3.insertCoin(10);
     gm3.insertCoin(10);
     gm3.insertCoin(10);
     
  
     gumballMachine3.turnCrank();
     gm3.insertCoin(10);
     gumballMachine3.turnCrank();

     System.out.println(gumballMachine3);


        
        

        
    }
}
