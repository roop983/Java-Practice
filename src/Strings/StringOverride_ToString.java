package Strings;

public class StringOverride_ToString {
	
	int roll;
	String name;
	String city;
	
	StringOverride_ToString(int roll, String name, String city) {
		
		this.roll=roll;
		this.name=name;
		this.city=city;
		
		
	}
	
	public String toString() {
		return roll +","+ name+","+city ;
		
	}
	
	

	public static void main(String[] args) {
		
		StringOverride_ToString s1=new StringOverride_ToString(24, "Ajay", "Bls");
		StringOverride_ToString s2=new StringOverride_ToString(25, "Vijay", "BBSR");
		
		System.out.println(s1); //compiler writes here s1.toString()  
		System.out.println(s2); //compiler writes here s2.toString()  

	}

}
