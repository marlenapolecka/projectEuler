
public class secondProbl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int sum = 0;
		int temp = 1;
		int prev = 1;
		while (i < 4000000) {
			if(i%2 == 0) {
				sum = sum + i; 
			}
			temp = prev;
			prev = i;
			i = i + temp;
			
			
		}
		System.out.println(sum);
	} 
	
			

}
