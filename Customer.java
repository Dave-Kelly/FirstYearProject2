class Customer
{

	private String name;
	private String customerId;
	private int balance;

	public Customer () // constructor
	
	{
		
	}
	
	public Customer (String theName, String theId, int theBalance) // constructor
	
	{
		name = theName;
		customerId = theId;
		balance = theBalance;
		
	}
	
	// Mutators (Setter Methods)
	
	public void setName (String theName)
	
	{
		name = theName;
	}
	
	public void setId (String theId)
	
	{
		customerId = theId;
	}
	
	public void setBalance (int theBalance)
	
	{
		balance = theBalance;
	}
	
	// Selectors (Getter Methods) no parameters
	
	public String getName ()
	
	{
		return name;
	}
	
	public String getId ()
	
	{
		return customerId;
	}
	
	public int getBalance ()
	
	{
		return balance;
	}

	
	public String toString ()
	
	{
		String myString;
		
		myString = "";
		myString += "\n Name : " + name;
		myString += "\n ID   : " + customerId;
		myString += "\n balance  : " + balance;
		
		return myString;
	
	}

}
