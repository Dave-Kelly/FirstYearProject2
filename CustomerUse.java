class CustomerUse
{

  // Student Name : 		David Kelly
  // Student Id Number : 	C00193216
  // Date :					23/04/2015
  // Purpose : 				Second Java Project - Object Orientation
	
    

	public static int addOne(Customer theArray[],  Customer theObject, int noOfValues)	
	{
 		int step;
 		int place ;
		
		if (noOfValues == 0)
			{
				theArray [0] = theObject;
				
			}
 		else
			{					
	  			place = findPlace(theArray, theObject.getBalance(),noOfValues); //Index pos. in array in which to add new object
	  			for (step = noOfValues - 1 ; step >= place; step --)
					{
						theArray[step + 1] = theArray[step] ;						
					}
				theArray[place] = theObject;	//Adds the new object to the array		
				
			}
 		return noOfValues + 1;
 	}
    public static int deleteOne(Customer theArray[], String theId, int noOfValues)
    {
    	int index;
 		int location ;
		
		location = locateOne(theArray, theId, noOfValues);		//Index pos. of object to delete
	  	for (index = 0; index < noOfValues; index++)
				{
					if((location + 1) == index)
						{
							theArray[index - 1] = theArray[index];		//Moves objects up one pos. after "location"
						}						
				}
    	return noOfValues - 1;	
    }    
    public static void listAll(Customer theArray[], int noOfValues)
    {
    	int index;
    	
    	for (index = 0; index < noOfValues; index ++)
			{							
				System.out.println(theArray[index].toString());		//Prints objects to screen
    		}	
    }
    public static int findPlace(Customer theArray[], int theBalance, int noOfValues)	
	{
		int step; 
		int place;
	
		step = 0 ;
		while ((step < noOfValues) && (theBalance < theArray[step].getBalance()))
			{
				step ++;
			}
		place = step ;   // Location in array	
		return place;
    }
    public static int locateOne(Customer theArray[], String theId, int noOfValues)
    {
        int index;
        int location;
        location = -1;
        
        for(index = 0; index < noOfValues; index ++)
            {
                if(theId.equals(theArray[index].getId()))
                    {
                        location = index;		//Location of search Id in array
                    }
            }
        return location; 
    }
    public static void clearScreen()
	{
		int index;
		
		for (index = 0; index < 5; index ++)
			{
				System.out.println();
			}
	}
    public static void menu()
    {
        System.out.println("\n    Menu    ");
        System.out.println(" ----------   ");
        System.out.println();
        System.out.println("  1. Add    ");
        System.out.println("  2. Delete ");
        System.out.println("  3. List All ");
        System.out.println("  4. Exit   ");   
    }
    public static void options(Customer cusArray[], int noOfElements)
    {
        Customer tempObject;  // Temp Customer - before sorting
        int place;
        int index;
        String currentName;
        String currentId;
        int currentBalance;
        char option;
        int location; 		//Result from locate() method - index pos. of Id     
        menu();
        System.out.println();
        System.out.print("Enter Option Required (1-4) ");
        option = EasyIn.getChar(); 
        while (option != '4')
            {
        		switch(option) 
                    {
                        case '1': System.out.println("\nAdd Customer");
                                  System.out.print("\tEnter Id : ");
                                  currentId = EasyIn.getString();
                                  location = locateOne(cusArray, currentId, noOfElements);
                                  while(location >= 0)											//If Id exists
	                                  {
		                                 System.out.println("ID found. Try Again");
		                                 System.out.print("\tEnter Id: ");
		                                 currentId = EasyIn.getString();
		                                 location = locateOne(cusArray, currentId, noOfElements);  
	                                  }
                                  System.out.print("\tEnter Name : ");
                                  currentName = EasyIn.getString();
                                  System.out.print("\tEnter Balance : ");
                                  currentBalance = EasyIn.getInt();
                                  tempObject = new Customer(currentName,currentId,currentBalance);
                                  noOfElements = addOne(cusArray,  tempObject, noOfElements);                  
                                  break;
                        case '2': System.out.println("Delete Customer");
                                  System.out.print("\tEnter Id to delete : ");
                                  currentId = EasyIn.getString();
                                  location = locateOne(cusArray, currentId, noOfElements);
                                  while(location < 0)											//If Id does not exist
	                                  {
		                                 System.out.println("ID not found. Try Again");
		                                 System.out.print("\tEnter Id to delete : ");
		                                 currentId = EasyIn.getString();
		                                 location = locateOne(cusArray, currentId, noOfElements);  
	                                  }
	                              noOfElements = deleteOne(cusArray, currentId, noOfElements);
                                  break;
                        case '3': System.out.println("List All Customers");
                                  listAll(cusArray,  noOfElements);
                                  break;
                        default:  System.out.println("Invalid Option!");
                     }
                   clearScreen();  
                   menu();	
                   System.out.println();
                   System.out.println("Enter Option Required (1-4) ");
                   option = EasyIn.getChar();
               }
    }
    public static void main(String[] args)
    {
    	Customer cusArray[];  // Array of Customer objects
		int noOfElements;
        int arraySize;
		
		noOfElements = 0;
        
        System.out.print("How many customers : "); //Set up size of array
        arraySize = EasyIn.getInt();
        cusArray = new Customer[arraySize];
        options(cusArray, noOfElements);	
    }

}
