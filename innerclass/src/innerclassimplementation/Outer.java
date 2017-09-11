package innerclassimplementation;

public class Outer 
{

	public class Inner
	{
		public void methodOne()
		{
			System.out.println("inner class method");
		}
		
	}	
	public void methodTwo()
	{
		System.out.println("outer class method");
		Inner a=new Inner();
		a.methodOne();
	}
	public static void main(String[] args) 
	{
		Outer o=new Outer();
		o.methodTwo();

	}

}
