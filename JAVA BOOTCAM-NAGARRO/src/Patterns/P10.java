package Patterns;

public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		int nsp=0;
		int nst=2*n-1;
		
		
		
		while(row<=n) {
			for(int csp=1;csp<=nsp;csp++) {
				System.out.print("  ");
			}
			for(int cst=1;cst<=nst;cst++) {
				System.out.print("* ");
			}
			
			nsp++;
			nst=nst-2;
			
			row++;
			System.out.println("");
		}
		

	
		
		

	}

}
