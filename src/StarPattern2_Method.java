
public class StarPattern2_Method {
	
	static void pattern(int rows) {
		
for (int i=1;i<=rows+3; i=i+2) {
			
			for (int j=rows+3;j>=i;j--) {
				System.out.print(" ");
		}
			for (int k=1;k<=i;k=k+2) {
				
				System.out.print(" *");
			}
			
			
			System.out.println();
	}
		
	}

	public static void main(String[] args) {
		
		int rows=4;
		pattern(4);
		
       

}
}
