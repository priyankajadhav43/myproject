package innerclassimplementation;

public class StaticTest 
{
	static class Inner
	{
		public void method()
		{
			System.out.println("inside static class");
		}
	}

	public static void main(String[] args)
	{
		StaticTest.Inner a=new StaticTest.Inner();
		a.method();
	}

}
