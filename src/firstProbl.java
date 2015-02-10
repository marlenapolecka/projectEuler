
public class firstProbl  {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// get numbers 1-1000
		int i = 1;
		int sum = 0;
		for (i = 1; i <1000; i = i+1) {
			if (i%3 == 0 || i%5 == 0) {
				sum = sum + i; 
			}
		} 
		System.out.println(sum); 
		// if the number is divided by 3 and results in whole number, add to the sum
		// print output 
	}

}
