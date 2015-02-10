
public class fifthProbl {

	/**
	 * @param args
	 */
	static boolean isDivisible(long i) { 
		for (int div = 2; div < 21; div ++) {
			if (i%div != 0) {
				return false;
			}
		} 
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long min = 2420;
		 
		while (isDivisible(min) == false) {
			min ++; 
			
			
		}
		System.out.println(min);		
	}

}
