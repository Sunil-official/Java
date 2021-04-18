package Patterns;

public class P14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int nst=1;
		int nsp=n-1;
		int row=1;
		int p=2*n;
		while(row<=p-1) {
			for(int csp=1;csp<=nsp;csp++) {
				System.out.print("   ");
			}
			for(int cst=1;cst<=nst;cst++) {
				System.out.print("*  ");
			}
			System.out.println();
			
			if(row<n) {
				nst++;
				nsp--;
			}
			else {
				nst--;
				nsp++;
			}
			row++;
		}
	

	}

}
