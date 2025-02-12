import java.util.Scanner;

public class Main {		

	private static double maximum;
	private static int sum;
	private static double average;
	private static int cnt;
	private static double maxnumber;
	private int number;
	
//	public static boolean IsQ (char number) {
//		  if (number == 'Q') {
//			  return true;
//		  }
//		  if (number >= 'a' && number <= 'z') {
//			  return false;
//		  }
//		return false;
//	}
//	public static boolean IsDigit(char number) {
//		if (number >= '0' && number <= '9') return true;
//		  else return false;
//	}
//		  
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number(Q to quit): ");
//		String number = "";
		
		while (true) {
			
			System.out.println("Enter number(Q to quit): ");
			
			 if (sc.hasNextDouble()) {
	                double number = sc.nextDouble();
	                cnt++;
					sum += number;
					average = (sum / cnt);
					maximum = Math.max(number, maxnumber);
					maxnumber = maximum;
					} 
			 else {
				 String input = sc.next();
	             if (input.equalsIgnoreCase("Q")) {
	            	 break;
	            	 }
	             }
			
//			if (input.equalsIgnoreCase("Q")) {
//				break;
//			}
//			
//			else {
//				int a;
//				if (input instanceof String) continue;
//				else a = Integer.valueOf(input);
//				cnt++;
//				sum = sum + a;
//				average = (sum / cnt);
//				maximum = Math.max(a, maxnumber);
//				maxnumber = maximum;
//				
//			}
			
			
		}
		System.out.print("Average = " + average);
		System.out.println();
		System.out.print("Maximum = " + maximum);
		
	}
}
