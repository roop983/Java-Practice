package Test_Strings;

public class Test14_IP_Address_Replace {

	public static void main(String[] args) {
		
		/*Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".
*/
		
		String ip= "255.100.50.0";
		
		String ip_modified=ip.replace(".", "[.]");
		
		System.out.println(ip_modified);
		
		
		String goal="(al)G(al)()()G";
		
		//String goal_modified=goal.replace("()", "o");
		
		//String goal_modified1=goal_modified.replace("(al)", "al");
		
		String goal_modified=goal.replace("()", "o").replace("(al)", "al");
		
		System.out.println(goal_modified);

	}

}
