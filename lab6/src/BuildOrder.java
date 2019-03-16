  

public class BuildOrder {

    public static Component getOrder()
    {
        
        Composite order = new Composite( "" ) ;

        
        Burger b = new Burger( "LBB" ) ;
                
        Toppings t = new Toppings( "Toppings Options" ) ;
        String[] top = { "Lettuce", "Tomato", "G Onion", "JALA Grilled" } ;
        t.setTopOptions( top ) ;
        
        Fries f = new Fries("LTL CAJ");
         
        //Adding components for composit pattern
        order.addChild( b ) ;
        order.addChild( t ) ;
        order.addChild( f ) ;

        return order ;
    }

}