package innerclassimplementation;

public class LocalOuterClass 
{

	private int a=10,b=10;
	
	public void add()
	{
		int c=a+b;
		
		class LocalInnerClass
		{
			void display()
			{
			System.out.println("addition is ="+c);
			}
		}
		
		LocalInnerClass a=new LocalInnerClass();
				a.display();
				
	}
	
	
	public static void main(String[] args) 
	{
		LocalOuterClass b=new LocalOuterClass();
		b.add();
	}

}
