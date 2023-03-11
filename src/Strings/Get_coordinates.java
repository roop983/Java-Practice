package Strings;

public class Get_coordinates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "https://www.google.com/maps/dir//99+Ranch+Market,+34444+Fremont+Blvd,+Fremont,+CA+94555/@37.5753502,-122.0413917,17z/data=!4m8!4m7!1m0!1m5!1m1!1s0x808fbe2cdf5d8085:0x252ee7d71ed7bc79!2m2!1d-122.039203!2d37.575346";
		
		int a = s.indexOf('@');
		
		int b = s.lastIndexOf('/');
		
		//String st  = s.substring(a+1, b);
		
		String latitude = s.substring(s.indexOf('@')+1, s.lastIndexOf('/')).split(",")[0];
		
		String longitude = s.substring(s.indexOf('@')+1, s.lastIndexOf('/')).split(",")[1];
		
//		String latitude = st.split(",")[0];
//		
//		String longitude = st.split(",")[1];
		
		
		
		System.out.println(latitude+" "+ longitude);

	}

}
