//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Casey Martinez

public class Number
{
	private int theValue;
	
	public Number(int value)
	{
	this.theValue = value;
	
	}	
	
	public int getValue()
	{
		return theValue;
	}
	
	public boolean equals(Object obj)
	{
		return obj instanceof Number && theValue == ((Number) obj).theValue;
	} 
	
	public int hashCode()
	{
		return theValue % 10;
	}

	public String toString()
	{
		return "" + theValue;
	}	
}
