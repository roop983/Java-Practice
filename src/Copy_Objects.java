
public class Copy_Objects {

	int id;
	String name;
	
	Copy_Objects(int ID1, String name1)
	{
		id=ID1;
		name=name1;
	}
	Copy_Objects()
	{
		
	}
	
	void display ()
	{
		System.out.println(id+" , "+name);
	}
	
	public static void main(String[] args) {
		
		Copy_Objects C1=new Copy_Objects(10,"Name1");
		Copy_Objects C2=new Copy_Objects();
		
		C2.id=C1.id;
		C2.name=C1.name;
		C1.display();
		C2.display();
		
		
		

	}

}
