package Patterns;

public class P07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n=5;

	
	int row=1;
	while(row<=n) {
				
		for(int cst=1;cst<=n;cst++) {
			if(cst==1 || cst==n || row==1 || row==n) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
				
			}
		}
		
		System.out.println();
		row++;
		
	}

	}

}
