 

public class Main {

public static void main(String[] args) {
  
    
      GumballMachine gm1 = new GumballMachine(5,"Type1");
      GumballMachine gm2 = new GumballMachine(5,"Type2");
      GumballMachine gm3 = new GumballMachine(5,"Type3");
      System.out.println(gm1);
     gm1.insertCoin(25);
     gm1.turnCrank();
     gm1.insertCoin(10);
     gm1.turnCrank();

     System.out.println(gm1);
     
     System.out.println(gm2);

     gm2.insertCoin(25);
     gm2.insertCoin(25);
     gm2.insertCoin(25);
     gm2.insertCoin(25);
     
     
  
     gm2.turnCrank();
     gm2.insertCoin(10);
     gm2.turnCrank();

     System.out.println(gm2);
     System.out.println(gm3);

     gm3.insertCoin(25);
     gm3.insertCoin(25);
     gm3.insertCoin(25);
     gm3.insertCoin(25);
     
     
  
     gm3.turnCrank();
     gm3.insertCoin(10);
     gm3.turnCrank();

     System.out.println(gm3);


        
        

        
    }
}
