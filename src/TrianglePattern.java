
public class TrianglePattern {

	public static void main(String[] args) {
		
		int rows=4;
		
		for (int i=1;i<=rows;i++) {
			
			for (int j=rows-1;j>=i;j--) {
				System.out.print(" ");
				
			}
				
			for (int k=1;k<=i;k++) {
					
					System.out.print("* ");
				}
				
			System.out.println();	
			
			}
		
		
			
			
		}
		

	}


