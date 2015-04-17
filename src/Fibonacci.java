public class Fibonacci {

	public static void main(String[] args) {
		
		long begTime = System.nanoTime();
		
	    long sumOfEvens = 0;
	    long odd1, odd2 = 1, even = 2;
	    final int MAX_NUM = 4000000; 
	        
	    while (even <= MAX_NUM) {
	        sumOfEvens += even;
	        odd1 = even + odd2;
	        odd2 = odd1 + even;
	        even = odd2 + odd1;
	    }   
	    
	    long endTime = System.nanoTime();
	    System.out.println("Total time: " + (endTime-begTime));
	    System.out.println("Result: " + sumOfEvens);
 
	}

}
