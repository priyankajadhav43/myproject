package innerclassimplementation;

public class Test {

	public static void main(String[] args) 
	{
		Person p=new Person()
		{

			@Override
			void eat() 
			{
				System.out.println("nice fruit");
				
			}
			
		};
				
		p.eat();
	}

}
