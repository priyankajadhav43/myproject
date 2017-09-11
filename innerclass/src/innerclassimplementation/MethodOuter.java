package innerclassimplementation;

public class MethodOuter 
{
	public void method()
	{
		class MethodInner
		{
			
			public void add(int x,int y)
			{
				int c=x + y;
				System.out.println("resulyt is:"+c);
			}
		}
		MethodInner a=new MethodInner();
		a.add(4,5);
		a.add(9,10);
	}

	public static void main(String[] args) 
	{
		new MethodOuter().method();
		// TODO Auto-generated method stub

	}

}
