package fibb;

public class fibb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=15;
		int a=0;
		int b=1;
		
		
		int count=1;
		while(count<=n) {
			System.out.println(a);
			int sum =a+b;
			a=b;
			b=sum;
			count=count+1;
			
		
			
		}
				

	}

}
