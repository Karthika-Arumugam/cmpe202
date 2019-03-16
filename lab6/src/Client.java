  

public class Client {

    public static void main(String args[])
    {
        Component theOrder = BuildOrder.getOrder() ;
        
        theOrder.setPrintStrategy(new PrintReceipt());
        theOrder.printSlip();
        
        theOrder.setPrintStrategy(new PrintPackageSlip());
        theOrder.printSlip();
        
    }
}
 
