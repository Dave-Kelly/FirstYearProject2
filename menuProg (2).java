class menuProg

// Student Name : 		Enda Dunican
// Student Id Number : 	COM1234
// Date :				1/9/2005
// Purpose : 			A Sample program to illustrate a menu 

{
	
		
	
	
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
	
	for (index = 0; index < 25; index ++)
		{
			System.out.println();
		}
}

public static void options()

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
   				case '1': System.out.println("Add Option");
   						  EasyIn.pause();
    	   	      		  break;
   				case '2': System.out.println("Delete Option");
   						  EasyIn.pause();
       		      		  break;
   				case '3': System.out.println("List All");
   						  EasyIn.pause();
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
    	options();
    }
}
