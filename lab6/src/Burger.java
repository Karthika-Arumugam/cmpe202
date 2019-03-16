public class Burger extends Composite
{
    protected String option ;
    protected double total ;
    double price;
    String meat;


    //costructor
    public Burger( String d )
    {
        super(d) ;
        setOptions(d);
    }
    // setting the Burger option
    public void setOptions( String option )
    {
        this.option = option ;
        
        switch (option) {
        
        	case "HamB":
        	        this.price=6.39;
        		this.meat="{{{{HAM}}}}";
        		break;
                case "CheeseB":
        		this.price = 7.19 ;
        		this.meat="{{{{NOMEAT}}}}";
        		break;
                case"BB":
        	       this.price = 7.19;
        	       this.meat="{{{{BACON}}}}";
                        break;
               case"BCB":
                       this.price = 7.79;
                       this.meat="{{{{BACON}}}}";
                       break;
               case"LHB":
                      this.price = 4.59;
                       break;
               case "LCB":
        		this.price =5.29;
        		this.meat="{{{{HAM}}}}";
        		break;
        	case "LBB":
        		this.price =5.59 ;
        		this.meat="{{{{BACON}}}}";
        		break;
        	case "LBCB":
        		this.price =7.10 ;
        		this.meat="{{{{BACON}}}}";
        		break;
        	default:
        		break;
        }
        
                
    }
    //getting burger option ordered to print 
    public  void getBurgerOption()
    {
        System.out.println("  1\t"+this.option+"\t\t\t"+this.price);
		System.out.println("\t"+this.meat);
    }
    //get the priceof the price for the burger option to print receipt
    public  Double getPrice()
    {   
        return this.price;
    }
    
    
    
}

	

