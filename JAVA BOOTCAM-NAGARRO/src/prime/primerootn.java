package prime;

public class primerootn {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =2;
		
		int div=2;
		int count=0;
		while (div<=Math.sqrt(n)){
		      if (n%div==0){
	//	          System.out.println(div);
		         count=count+1;
		      }
		      div=div+1;     
		}
		
		
		if (count==0) {
			System.out.println(n+" is Prime");
		}
		else {
			System.out.println(n+" is Not Prime");
		}
	}


}
