/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardNum implements IDisplayComponent, IKeyEventHandler
{


	private  Screen s;
	private IKeyEventHandler nextHandler ;
	private String number = "" ;


	public CreditCardNum(Screen s)
	{
		this.s=s;
	}

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
		if (number.equals(""))
			return "[4444 4444 4444 4444]" + "  ";
		else
			return "[" + number + "]" + "  ";
	}



	public void key(String ch, int cnt) {
		if ( cnt >= 1 && cnt <= 16 && number.length()<=21) {
			 s.setState(this);
			if(ch.equalsIgnoreCase("X"))
			{
				number=number.substring(0, number.length() - 1);
			}
			else {
				number += ch;
				System.err.println("count down" + cnt);
			}
		}
		else if ( nextHandler != null )
		{
			nextHandler.key(ch, cnt) ;
		}

	}	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}