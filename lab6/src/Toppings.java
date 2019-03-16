import java.util.ArrayList;

public class Toppings extends Composite
{
    protected String[] options ;
    protected ArrayList<String> topadd = new ArrayList<String>()  ;
    protected ArrayList<String> bottomadd = new ArrayList<String>()  ;
    //constructor
    public Toppings( String d)
    {
        super(d) ;
    }    
    // set Topping options
    public void setTopOptions( String[] options )
    {
        this.options = options ;
        for ( int i = 0; i<options.length; i++ )
        {
        	if ( "Lettuce".equals(options[i]) ) topadd.add(options[i]);
        	if ( "Tomato".equals(options[i]) ) topadd.add(options[i]);
        	if ( "Pickles".equals(options[i]) ) topadd.add(options[i]);
        	if ( "G Onion".equals(options[i]) ) bottomadd.add(options[i]);
        	if ( "JALA Grilled".equals(options[i]) ) bottomadd.add(options[i]);
        }
    }
    // get Toppings
    public String[] getTopOptions()
    {
        return options;
}

}