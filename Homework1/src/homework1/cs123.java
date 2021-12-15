package homework1;
import java.util.Scanner ;



public class cs123 {

	public static void main(String[] args) {
		//Variable declaration
	     int value, value2 ;
	   
	    //Displays name, course name, and University 
	     System.out.println("Name: Justus Contreras");
	     System.out.println("Course: CS 123 - Computer Science I");
	     System.out.println("University: Eastern New Mexico University");
	     
	     
	     //Allows user to enter number
	     Scanner in = new Scanner (System.in);
	    //do-while loop that repeats till the user enters a number within the range
	    do
	    {
	    	 //Prompts user to enter an integer between 0 and 50
	     System.out.print("\nEnter an integer between 0 and 50, inclusively:");
	     value = in.nextInt();
         //if statement that prompts an error message if 
	     //the user enters a number out of range 
	     if(value<0 || value >50)
            	   System.out.println("ERROR: the entered number is out of range");
	    }
           while (value < 0 || value > 50); 
	       
	        //do-while loop for value2
	        do
	        {
	        	//Prompts user to enter an integer between -5 and 20
	         System.out.print("Enter another integer between -5 and 20, inclusively: ");
		     value2 = in.nextInt();
		            if(value2 < -5 || value2 > 20)
		             System.out.println("ERROR: the entered number is out of range ");
	        }
	        while ( value2 < -5 || value2 > 20);
		            		        
		        //Prompt for user to enter an arithmetic operation
		        System.out.print("Enter the arithmetic operation (+, -, *, /, or %) you wish to perform: ");
		        String operator=in.next();
		        
		       //Variable declaration
		       boolean zero_error = false;
		       int result = 0;
			   //Once user enters a operation switch will determine which action will be used  
			  switch(operator)
		        {
			    //addition
		        case "+":
		        	result = value + value2;
                    System.out.print("Addition: " + value + " + " + value2 + " = " + result);
		            break ;
		        //subtraction
		        case "-":
		        	result = value - value2;
		        	System.out.print("Subtraction: " + value + " - " + value2 + " = " + result);
		            break ;		            
		        //multiplication
		        case "*":
		        	result = value * value2;
		        	System.out.print("Multiplication: " + value + " * " + value2 + " = " + result);
		            break ;		            
		        //division
		        case "/":
		            //if statement that determines if value2 is not 0
		        	if (value2!=0)
		        	{
		        		result = value / value2;
		 		        System.out.print("Division: " + value + " / " + value2 + " = " + result);
		        	}
		        	//else-if statement that determines if value2 is 0 then displays an ERROR 
		        	else if (value2==0)
		        	{
		        		System.out.print("ERROR: division by zero");
		        		zero_error = true ;
		        	}
		        	break;
		        //Module   
		        case "%":
		        	//if statement that determines if value2 is not 0
		        	if (value2!=0)
		        	{
		        		result = value % value2;
		 		        System.out.print("Division: " + value + " / " + value2 + " = " + result);
		        	}
		        	//else-if statement that determines if value2 is 0 then displays an ERROR 
		        	else if (value2==0)	        	
		        	{
		        		System.out.print("ERROR: division by zero");
		        		zero_error = true ;
		        	}
		        	break;	        	
		         //default         
		        default:
		        	//If user enters an invalid operation a error message will display
		        	System.out.println("Error: Invalid operation");
		        	return ;
		        	
		        	
		        	
		        	
		       }
			  //If-else statement that determines if results are positive, negative, or zero
		      
			  if(!zero_error)
			  {
			  if(result > 0)
		        {
		            System.out.print("\nThe result is positive");
		        }
		        else if(result < 0)
		        {
		            System.out.print("\nThe result is negative");
		        }
		        else if (result==0)
		        {
		            System.out.print("\nThe result is zero");
		        }
			  else 
			  {
	                System.out.print("Error: division by zero");
	                zero_error = true;
	            }
	        }        
			
	}  
	}      
		        
	
			
		
		
			  
		     
		
		       
			  
		       
		        
		     
	     
	     
	  
	

