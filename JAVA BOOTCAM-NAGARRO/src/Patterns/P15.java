package Patterns;

public class P15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int nsp=0;
		int nst=n;
		int row=1;
		while(row<=2*n-1){
			for(int csp=1;csp<=nsp;csp++) {
				System.out.print("   ");
			}
			for(int cst=1;cst<=nst;cst++) {
				System.out.print("* ");
			}
			if(row<n) {
				nst--;
				nsp=nsp+2;
			}
			else {
				nst++;
				nsp=nsp-2;
			}
			row++;
			System.out.println();
		}

	}

}
