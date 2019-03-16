public class Fries extends Composite
{
	protected String option ;
	protected double total ;
	double price;


    
    public Fries( String d )
    {
        super(d) ;
        setOptions(d);
    }
    
    public void setOptions( String option )
    {
        this.option = option ;
        
        switch (option) {
        
    	case "LTL CAJ":
    		this.price =2.79; ;
    		break;
    	case "REG CAJ":
    		this.price =3.39 ;
    		break;
    	case "LAR CAJ":
    		this.price =5.59 ;
    		break;
    	case "LTL 5G":
    		this.price =2.79 ;
    		break;
    	case "REG 5G":
    		this.price =3.39 ;
    		break;
    	case "LAR 5G":
    		this.price =5.59 ;
    		break;
    	default:
    		break;
        }
    }

	public double getPrice(){
	        
	    return this.price;
		
	}
	
	
	

    
}
