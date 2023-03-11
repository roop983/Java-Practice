
public class MathRandom {

	public static void main(String[] args) {
		
		int min=300;
		int max=700;
		
		double final_num;
		
		int final_num1;
		
		double Random_num=Math.random();
		
		System.out.println("The random number is: "+Random_num);
		
		//final_num=(Random_num+1)*(max-min);
		
		final_num=Random_num*(max-min)+min;   
		
		System.out.println("The Double final number is: "+final_num);
		
		 final_num1=(int)final_num;  //convert from double to int
		 
		 System.out.println("The Integer final number is: "+final_num1);

	}

}
