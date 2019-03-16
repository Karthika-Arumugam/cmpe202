import java.util.ArrayList;
import java.util.Date;
import java.text.*;

public class PrintPackageSlip implements PrintStrategy{
	
	ArrayList<Component> components;
	DecimalFormat fmt = new DecimalFormat("0.00");
	Burger b;
	Toppings t;
	Fries f;
	
	DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	Date date = new Date();	

	@Override
	public void printSlip(ArrayList<Component> componentslist) {
		
		
		
		components = componentslist;
		
		
		for (Component obj  : components)
        {
            if(obj.getClass().getName()=="Burger")
            	b=(Burger) obj;
            if(obj.getClass().getName()=="Toppings")
            	t=(Toppings) obj;
            if(obj.getClass().getName()=="Fries")
            	f=(Fries) obj;
        }

		System.out.println("\t\tPackaging Slip");
		System.out.println("----------------------------------------------\n");
		
		System.out.println("  Patties - 1");
		System.out.println("\n  Order Number: 45");
		System.out.println("\n\t"+dateFormat.format(date));
		System.out.println("\n\tFIVE GUYS\n");
		System.out.println("\nSandwich# 1");
		
		//print choice of burger				
		System.out.print("  1\t"+b.option);
		
		
		//print top add toppings
		for (String topping  : t.topadd)
        {
        	System.out.println("\t" + topping );
        }        
		
		//print botton add bottings
        for (String topping  : t.bottomadd)
        {
        	System.out.println("\t->| " + topping );
        }
		
        //print meat choise of the burger option
		System.out.println("\t"+b.meat);
		
		//print choice of fries
		System.out.println("\n  1\t"+f.option);
		System.out.println("Register:1\t\t"+"Tran Seq No: 57845");
                System.out.println("Sakda*S.");
		
		System.out.println("\n==============================================");
		
	}

}
