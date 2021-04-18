package HCF;

public class HCF3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=65;
		int n2=99;
		int HCF=0;
		
		int divisor= Math.min(n1,n2);
		int dividend= Math.max(n1,n2);
		
		while (true) {
			int r = dividend%divisor;
			if (r==0) {
		           HCF=divisor;
		           break;
			}
			dividend=divisor;
			divisor=r;        
		}
	    System.out.println(HCF);

	}

}
