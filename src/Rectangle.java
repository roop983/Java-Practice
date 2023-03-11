
   class Multiple_Class { //Here the public type cannot be prefixed as this can be defined only in its own file
	
	int length;
	int breadth;
	
	void insert(int l, int b)
	{
		length=l;
		breadth=b;
	}
	
	void calculate()
	{
		System.out.println("Value is:"+length*breadth);
	}
	}

	 public class Rectangle
	{
		 public static void main(String[] args)
		{
			Multiple_Class R=new Multiple_Class();
			
			R.insert(6, 7);
			R.calculate();
			
		}
	}

