package practice5;
public class Example1
{
    public static void main(String[] args)
    {
    	int     denominator, numerator, ratio;


    	numerator   = 5;
    	denominator = 0; // ArithmeticException
	
    	try {
    		ratio = numerator / denominator;
    		System.out.println("The answer is: " + ratio);

    		System.out.println("Done."); // Don't move this line
    	}
    	catch (Exception ex) {
    		System.out.println("Делить на 0.");
    		ex.printStackTrace();
    	}	
    	System.out.println("Done."); // Don't move this line
    }
}


