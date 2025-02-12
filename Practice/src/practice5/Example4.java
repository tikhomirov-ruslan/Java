package practice5;

import java.util.*;

public class Example4
{
	public static void main(String[] args)
    {
       double                 leftOperand, result = 0.0, rightOperand;
       String                 leftString = "", operator, rightString = "";
       StringTokenizer        tokenizer;
       Scanner in = new Scanner(System.in);
       
       while (true) {
           System.out.print("Enter an expression (or 'exit' to quit): ");
           String input = in.nextLine();

           if (input.equalsIgnoreCase("exit")) {
               System.out.println("Exiting the program.");
               break;
           }
           
           tokenizer = new StringTokenizer(in.nextLine(), "+-*/", true);

           try
           {
        	   leftString   = tokenizer.nextToken();
        	   operator     = tokenizer.nextToken();
        	   rightString  = tokenizer.nextToken();

        	   leftOperand  = Double.parseDouble(leftString);
        	   rightOperand = Double.parseDouble(rightString);

        	   if (operator.equals("+")) 
        	   {
        		   result += leftOperand + rightOperand;
        		   System.out.println("Result: " + result);
        		   result = 0.0;
        	   }
        	   
        	   else if (operator.equals("-"))
        	   {
        		   result += leftOperand - rightOperand;
        		   System.out.println("Result: " + result);
        		   result = 0.0;
        	   }
        	   
        	   else if (operator.equals("*"))
        	   {
        		   result += leftOperand * rightOperand;
        		   System.out.println("Result: " + result);
        		   result = 0.0;
        	   }
        	   
        	   else if (operator.equals("/")) 
        	   {
        		   if (rightOperand == 0.0 || leftOperand == 0.0) 
        		   {
        			   System.out.println("Division by zero is not allowed");
//        			   return;
        		   }
        		   
        		   result += leftOperand / rightOperand;
        		   System.out.println("Result: " + result);
        		   result = 0.0;
        	   }
           }
       
       
           catch (NoSuchElementException nsee)
           {
        	   System.out.println("Invalid syntax");
           }
           
       
           catch (NumberFormatException nfe)
           {
        	   try 
        	   {
        		   Double.parseDouble(leftString);
        	   }
    	   
        	   catch (NumberFormatException leftNfe) 
        	   {
        		   System.out.println("Left operand is not a number");
        	   }

    	   
        	   try 
        	   {
        		   Double.parseDouble(rightString);
        	   } 
           
        	   catch (NumberFormatException rightNfe) 
        	   {
        		   System.out.println("Right operand is not a number");
        	   }
           }

//           System.out.println("Result: " + result);
       
       }
    }
}

//5.3+9.2
//Result: 14.5

//5.3+
//Invalid syntax

//5.3+a
//One or more operands is not a number

//5.3+a
//Right operand is not a number

//a+5.3
//Left operand is not a number

//5.3/0
//Infinity
//Division by zero is not allowed