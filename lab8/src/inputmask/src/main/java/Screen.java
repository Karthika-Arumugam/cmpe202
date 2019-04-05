/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

import java.util.* ;

public class Screen implements IScreen, IDisplayComponent
{
    private ArrayList<IDisplayComponent> components = new ArrayList<IDisplayComponent>() ;
    private IKeyEventHandler chain ;
    private String description="";
    private IDisplayComponent current;
    public Screen()
    {
        // no constructor elements
    }

    public Screen(String d)
    {
      description=d;
    }

    public void key(String ch, int cnt) {
        chain.key(ch, cnt) ;
    }
    
    public void addSubComponent( IDisplayComponent c )
    {
        components.add( c ) ;
        if (components.size() == 1 )
        {
            chain = (IKeyEventHandler) c ;

        }
        else
        {
            IKeyEventHandler prev = (IKeyEventHandler) components.get(components.size()-2) ;
            prev.setNext( (IKeyEventHandler) c ) ;
        }
    }
    
    public String display() { 
        String value = "" ;
        for (IDisplayComponent c : components )
        {
            value = value + c.display() ;

        }
        return value ; 
    }

    public String name() {
        return (this.getClass().getName()) ;
    }

    public String cur_name(){
        return (current.getClass().getSimpleName()) ;
    }
    public void setState(IDisplayComponent c)
    {
        current=c;
    }
}