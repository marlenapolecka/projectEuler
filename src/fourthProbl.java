
public class fourthProbl {

	/**
	 * @param args
	 */
	//Reverses integer 
	public static int reverse(int number) {
		String v = Integer.toString(number);
		v = new StringBuilder(v).reverse().toString();
		int r = Integer.parseInt(v);
		
		return r;
		
	}
	public static void main(String[] args) {
		int temp = 0; 
		for (int a = 100; a < 1000; a++) {
			for (int b = 100; b < 1000; b++) {
				int rev = reverse(a * b);
				if (rev == a * b)
					if (rev > temp)
						temp = rev;
			}
		}
		
		// TODO Auto-generated method stub
			System.out.println(temp);
		
	}

}
