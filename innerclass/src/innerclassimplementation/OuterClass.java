package innerclassimplementation;

import innerclassimplementation.OuterClass.InnerClass;

public class OuterClass 
{
 
	private int a=25,b=10,c;
	int x=2;
	private void add()
	{
		c=a+b;
		System.out.println("addition is="+c);
	}
	public class InnerClass
	{
		public void display()
		{
			System.out.println("in inner class");
			System.out.println("a and b respectively="+a+" "+b);
			System.out.println(x);
		}
		
	}
	
	public static void main(String[] args)
	{
		OuterClass a=new OuterClass();
		OuterClass.InnerClass b=a.new InnerClass();
		b.display();
		a.add();

	}
	
}
