package java;

public class Encapsulation {
	private int pin = 1234;
	Encapsulation()
	{
		//LI
	}
	public int getpin()
	{
		return pin ;
	}
	public void setpin(int n_pin)
	{
		this.pin=n_pin;
	}
}

class Driver
{	
	public static void main(String [] args)
	{
	Encapsulation E = new Encapsulation();
	System.out.println("The old pin is "+E.getpin());
	E.setpin(9876);
	System.out.println("The new pin is "+E.getpin());
}
}