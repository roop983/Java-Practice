class InstanceVariable{  
 
	int count=0;//will get memory each time when the instance is created  
 
	static int ID_count=0; // //will get memory only once and retain its value  
  
		
	InstanceVariable(){  
			count++;//incrementing value  
			ID_count++;

			System.out.println("Instance Variable value is: "+count);  

			System.out.println("Static Variable value is: "+ID_count);  

}  


	public static void main(String[] args) {
		
		//Creating objects  
		InstanceVariable c1=new InstanceVariable();  
		InstanceVariable c2=new InstanceVariable();  
		InstanceVariable c3=new InstanceVariable();  
		

	}

}
