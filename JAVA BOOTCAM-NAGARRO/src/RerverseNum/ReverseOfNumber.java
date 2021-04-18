package RerverseNum;

public class ReverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 42341;
		int ans =0;
		while (n!=0) {
			int digit = n%10;
			ans= ans*10+digit;
//			System.out.print(digit + " ");
			n = n/10;
		}
		System.out.println(ans);
	}

		

	}


