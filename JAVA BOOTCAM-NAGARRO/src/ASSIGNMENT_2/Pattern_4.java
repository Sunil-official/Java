package ASSIGNMENT_2;

public class Pattern_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		int N=40;
		
		int nst=1;
		int row=1;
		while (row<=N) {
			if (row%2==0) {
				for(int cst=1; cst<=nst; cst=cst+1) {
					if( cst%2==0) {
						System.out.print("1 ");
					}
					else {
						System.out.print("0 ");
					}
								
				}
				
			}
			else {
				for(int cst=1; cst<=nst; cst=cst+1) {
					if( cst%2==0) {
						System.out.print("0 ");
					}
					else {
						System.out.print("1 ");
					}
				}
				}
			row=row+1;
			nst=nst+1;
			System.out.println();	
			}
					
		}		
		
	}


