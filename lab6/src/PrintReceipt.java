import java.util.ArrayList;
import java.util.Date;
import java.text.*;

public class PrintReceipt implements PrintStrategy
{
	ArrayList<Component> components;
	DecimalFormat fmt = new DecimalFormat("0.00");
	double cash=20.00;
	Burger b;
	Toppings t;
	Fries f;
	
	DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	Date date = new Date();
	
	@Override
	public void printSlip(ArrayList<Component> componentslist) {
		
		//System.out.println("In Print Receipt Slip Strategy\n\n");
		
		components = componentslist;
		
		//store all components of order in local objects
		for (Component obj  : components)
        {
            if(obj.getClass().getName()=="Burger")
            	b=(Burger) obj;
            if(obj.getClass().getName()=="Toppings")
            	t=(Toppings) obj;
            if(obj.getClass().getName()=="Fries")
            	f=(Fries) obj;
        }

		System.out.println("\t\tCustomer Receipt Slip");
		System.out.println("----------------------------------------------\n");
		
		System.out.println("\t\t  FIVE GUYS");
		System.out.println("\t      BURGERS AND FRIES");
		System.out.println("\t       Stores # CA-1294");
		System.out.println("\t    5353 ALMADEN EXPY N60");
		System.out.println("\t      SAN JOSE, CA 95118");
		System.out.println("\t       (P) 408-264-9300\n");
		
		
		
		

		System.out.println("\t     "+dateFormat.format(date));
		System.out.println("\n\t\t  FIVE GUYS");
		System.out.println("\n  Order Number: 45\n");
		
		
		
		//print choice of burger and meat
		b.getBurgerOption();
		
		//print toppings in the order as it is  ordered by the client
		for ( int i = 0; i<t.options.length; i++ )
        {
        	String temp="";
        	
        	if(t.bottomadd.contains(t.options[i]))
        		temp += "->| " + t.options[i];
        	else
        		temp += t.options[i] ;
        	
            if (i>0) System.out.println("\t" +  temp) ;
            else System.out.println("\t"+temp) ;
        }
		
		//print fries option if any
		System.out.println("\n  1\t"+f.option+"\t\t\t"+f.getPrice());
		
		
		//calculate total bill with tax of 9%
		double subTotal = b.getPrice()+ f.getPrice();	
		double totalPrice=subTotal+(subTotal*0.09);
		
		
		System.out.println("  Sub. Total:\t\t" + fmt.format(subTotal));        
                System.out.println("  Tax:       \t\t" + fmt.format(subTotal*0.09));        
                System.out.println("  Total:     \t\t" + fmt.format(totalPrice));  
                System.out.println("  Cash $20     \t\t"+"$"+ fmt.format(cash)); 
                System.out.println("  Change     \t\t"+"$"+ fmt.format(cash-totalPrice)); 
                System.out.println("Register:1\t\t"+"Tran Seq No: 57845");
                System.out.println("Sakda*S.");
                System.out.println("*************************************************");
                System.out.println("  Don't throw away your receipt!!!");
                
		
		
		
		
		System.out.println("\n==============================================");
		
	}

}
