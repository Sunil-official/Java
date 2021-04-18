package Patterns;

public class P05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int nst=n;
		int nsp=0;
		int row=1;
		while(row<=n) {
			for(int csp=1;csp<=nsp;csp++) {
				System.out.print(" ");
			}
			for(int cst=1;cst<=nst;cst++) {
				System.out.print("*");
			}
			nsp++;
			nst--;
			row++;
			System.out.println();
			
		}

	}

}
