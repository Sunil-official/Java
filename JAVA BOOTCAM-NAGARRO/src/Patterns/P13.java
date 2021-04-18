package Patterns;

public class P13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int nst=1;
		int row=1;
		int p=2*n;
		while(row<=p-1) {
			for(int cst=1;cst<=nst;cst++) {
				System.out.print("*  ");
			}
			System.out.println();
			
			if(row<n) {
				nst++;
			}
			else {
				nst--;
			}
			row++;
		}
	

	}

}
