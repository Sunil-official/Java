package Patterns;

public class P03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int nst=n;
		int row=1;
		
		while(row<=n) {
			for(int cst=1;cst<=nst;cst++) {
				System.out.print("* ");
			}
			row++;
			nst--;
			System.out.println();
			
		}

	}

}
