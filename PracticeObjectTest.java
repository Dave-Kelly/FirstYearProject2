class PracticeObjectTest	
{
	
	// Student Name : 		David Kelly
 	// Student Id Number : 	C00193216
  	// Date :					22/04/2015
 	// Purpose : 				Object Orientation
 	

	public static void main(String[] args)
    {
    	Customer theArray[]; 
    	Customer tempObject; 
		int index;
		
        String currentName;
        String currentId;
        int currentBalance;
     
        theArray = new Customer[4];
        
        for (index = 0; index < 4; index ++)
        	{
		       	System.out.print("Enter Id : ");
		        currentId = EasyIn.getString();
		        System.out.print("Enter Name : ");
		       	currentName = EasyIn.getString();
		        System.out.print("Enter Balance : ");
		        currentBalance = EasyIn.getInt();
		        tempObject = new Customer(currentName,currentId,currentBalance);
	        }
	        
	    System.out.println(theArray[0].toString());
    	//for (index = 0; index < 4; index ++)
		//	{							
				//System.out.println(theArray[index].toString());
    	//	}		
    }

}
