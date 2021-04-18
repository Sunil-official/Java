package prime;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =71;
		int div=1;
		int count=0;
		while (div<=n){
		      if (n%div==0){
		//         System.out.println(div);
		         count=count+1;
		      }
		      div=div+1;     
		}
		
		
		if (count==2) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
		}
	}


