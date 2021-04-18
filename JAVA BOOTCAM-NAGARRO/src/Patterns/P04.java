package Patterns;

public class P04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int nsp=n-1;
		int nst=1;
		int row=1;
		while(row<=n) {
			for(int csp=1;csp<=nsp;csp++) {
				System.out.print(" ");
			}
			for(int cst=1;cst<=nst;cst++) {
				System.out.print("*");
			}
			nst++;
			nsp--;
			row++;
			System.out.println();
			
		}

	}

}
