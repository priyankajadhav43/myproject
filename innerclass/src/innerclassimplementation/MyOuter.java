package innerclassimplementation;

public class MyOuter 
{

	public void add()
	{
		int c=10+20;
		System.out.println("addition of outer class is="+c);
	}
	
public static void main(String[] args) 
{
		MyOuter a=new MyOuter()
		{
			public void add()
			{
				int z=3+20;
				System.out.println("addition of main class is="+z);
			}
			
			
		};
		a.add();
		MyOuter b=new MyOuter();
		b.add();
	

	
}

}
