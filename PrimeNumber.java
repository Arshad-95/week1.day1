
public class PrimeNumber {

	public static void main(String[] args) {
		int input = 13;
		boolean flag = false;
		for (int i = 2; i<input/2; i++) {
			if (input%2==0) {
				flag=true;
				break;
			}
			
		}
			if (flag==false) {
				System.out.println("Prime number");
			}
			else {
				System.out.println("Not a Prime number");
			}
	}
	
	

}
