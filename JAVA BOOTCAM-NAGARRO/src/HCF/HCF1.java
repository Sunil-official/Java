package HCF;

public class HCF1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1=99;
		int n2=65;
		int HCF=0;
		
		int min= Math.min(n1,n2);
		int div=1;
		while (div<=min) {
			if (n1%div==0 && n2%div==0) {
				HCF=div;
				}
			div=div+1;
		}
	    System.out.println(HCF);		

	}

}
