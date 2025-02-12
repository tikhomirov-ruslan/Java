package practice5;

public class Example2
{
    public static void main(String[] args)
    {
    	int        ratio;
    	int[]      numbers = {100,10,5,5,2,8,0,30};
    	
    	int i = 0;
    	
    	try
    	{
//			i = 0;
    		for (i = 0; i < numbers.length-1; i++)
    		{
    			ratio = numbers[i] / numbers[i+1];
    			System.out.println(numbers[i] + "/" + numbers[i+1] + "=" + ratio);
            }
    	} 
    	catch (ArithmeticException ae)
    	{
    		System.out.println("Couldn't calculate "+
			       numbers[i] + "/" + numbers[i+1]);
    	}
    }
}

// Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
//The local variable i may not have been initialized
//The local variable i may not have been initialized

// 100/10=10
// Couldn't calculate 10/0

