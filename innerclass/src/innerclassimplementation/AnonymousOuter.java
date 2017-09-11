package innerclassimplementation;


public class AnonymousOuter
{

	public static void main(String args[])
	{
			Runnable r=new Runnable()
			{

				@Override
				public void run()
				{
					System.out.println("ready to use in run");
					
				}
			
			};
			Thread t=new Thread(r);
			t.start();
			for(int i=0;i<10;i++)
			{
				System.out.println("Main thread");
			}

	}
}
