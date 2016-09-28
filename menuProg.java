class menuProg

// Student Name : 		Enda Dunican
// Student Id Number : 	COM1234
// Date :				1/9/2005
// Purpose : 			A Sample program to illustrate a menu 

{
	
public static int addOne(Customer theArray[], int place, Customer theObject, int noOfValues)	
	{
 		int step;
		
		if (noOfValues == 0)
			{
				theArray [0] = theObject;
				noOfValues ++;	
			}
 		else
			{					
	  			for (step = noOfValues - 1 ; step >= place; step --)
					{
						theArray[step + 1] = theArray[step] ;						
					}
				theArray[place] = theObject;			
				noOfValues ++	;
			}

 		return noOfValues;
 	}		
	
	
public static void menu()
	
	{
		System.out.println("    Menu    ");
		System.out.println(" ----------   ");
		System.out.println();
		System.out.println("  1. Add    ");
		System.out.println("  2. Delete ");
		System.out.println("  3. List All ");
		System.out.println("  4. Exit   ");
		
	}
	
public static void clearScreen()

{
	int index;
	
	for (index = 0; index < 5; index ++)
		{
			System.out.println();
		}
}

public static void listAll(Customer cusArray[], int noOfElements)

{
	int index;
	
	for (index = 0; index < noOfElements; index ++)
		{
			System.out.println(cusArray[index].toString());
		}
	
	
	}
public static void options(Customer cusArray[], int noOfElements)

{

char option;
 
menu();
System.out.println();
System.out.print("Enter Option Required (1-4) ");
option = EasyIn.getChar(); 
while (option != '4')
	{
	
		switch(option) 
			{
   				case '1': System.out.println("Add Customer");
   						  EasyIn.pause();
   						  Customer tempObject;
   						  
   						  String currentName;
   						  String currentId;
   						  int currentBalance;		  
		
   						  System.out.print("Enter name ");
   						  currentName = EasyIn.getString();
   						  System.out.print("Enter Id ");
   						  currentId = EasyIn.getString();
   						  System.out.print("Enter age ");
   						  currentBalance = EasyIn.getInt();
   						  tempObject = new Customer(currentName,currentId,currentBalance);
   						  noOfElements++ ;
					   						  
    	   	      		  break;
   				case '2': System.out.println("Delete Customer");
   						  EasyIn.pause();
       		      		  break;
   				case '3': System.out.println("List All Customers");
   							listAll(cusArray,  noOfElements) ;
   						  
       		      		  break;
   				default:  System.out.println("Invalid Option!");
   						  EasyIn.pause();
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
    	Customer cusArray[];  // Array of Employee objects
		Customer tempObject;
		int place;
		int index;
		int noOfElements;
		
		String currentName;
		String currentId;
		int currentBalance;
		
		cusArray = new Customer[5];
		noOfElements = 0;  // Occupied
		
		

		System.out.print("Enter name ");
		currentName = EasyIn.getString();
		System.out.print("Enter Id ");
		currentId = EasyIn.getString();
		System.out.print("Enter age ");
		currentBalance = EasyIn.getInt();
		tempObject = new Customer(currentName,currentId,currentBalance);
		cusArray[0] = tempObject ;
		noOfElements++ ;
		
		
		
		System.out.print("Enter name ");
		currentName = "pat" ; // EasyIn.getString();
		System.out.print("Enter Id ");
		currentId = "qw44" ; // EasyIn.getString();
		System.out.print("Enter age ");
		currentBalance = 100 ; //EasyIn.getInt();
		tempObject = new Customer(currentName,currentId,currentBalance);
		cusArray[1] = tempObject ;
		
		noOfElements++ ;
		
		
		
		
		
		
		
		options(cusArray,noOfElements);
		//place = findPlace(cusArray,currentBalance,noOfElements);
		//noOfElements = addOne(cusArray,place,tempObject,noOfElements);
		
    }
}
