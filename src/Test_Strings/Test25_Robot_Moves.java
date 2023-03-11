package Test_Strings;

public class Test25_Robot_Moves {

	public static void main(String[] args) {
		
		
	/*	You are given a string moves that represents the move sequence of the robot where moves[i] represents its ith move. Valid moves are 'R' (right), 'L' (left), 'U' (up), and 'D' (down).

		Return true if the robot returns to the origin after it finishes all of its moves, or false otherwise.
	
	 * Approach: if robot has went to right side, it must come to left to come in initial position. Similarly if robot has gone
		up then it should come down again and vice-versa.
		Hence just get count of left and right, up and down as well and match if count of left & right and up & down are same or not.*/
		
		//String moves="LRRLRUULR"; returns false
		String moves="LRLLRRUD";
		
		int L_count=0;
		int R_count=0;
		int U_count=0;
		int D_count=0;
		
	
		//for (char c: moves.toCharArray())
		//OR
		for (int i=0;i<moves.length();i++) {
			
			if (moves.charAt(i)== 'L') {
				L_count++;
			}
			else if (moves.charAt(i)== 'R') {
				R_count++;
			}
			else if (moves.charAt(i)== 'U') {
				U_count++;
			}
			else if (moves.charAt(i)== 'D') {
				D_count++;
			}
				
		}
		
		if (L_count==R_count && U_count==D_count) 
			
			System.out.println("true");
			
			else
			
			System.out.println("false");
			
		}
	
	//OR return (L_count==R_count && U_count==D_count);
		

	}


