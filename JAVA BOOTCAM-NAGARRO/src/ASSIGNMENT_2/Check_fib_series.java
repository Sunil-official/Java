package ASSIGNMENT_2;

public class Check_fib_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=7;
		int a=0;
		int b=1;
		
		int count=1;
		while (count<=n) {
			if(a==n) {
				System.out.println(n+ " is member");
				break;
			}
			else if(a>n) {
				System.out.println(n+ " is not a member");
				break;
			}
			int sum=a+b;
			a=b;
			b=sum;
			count=count+1;
		}
		
			

	}

}
