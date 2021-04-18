package ASSIGNMENT_2;

public class FIBB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=92589;
		
		int sum=0;
		while(true) {
			int i = n%10;
			sum=sum+i;
			n=n/10;
			if (n==0) {
				break;
				
			}
			
				
			
					
		}
		
		System.out.println(sum);		
	}

}
