package innerclassimplementation;

public class TestOutsideOuter {

	public static void main(String[] args) 
	{
		//1st Way
		//new OutsideOuter().new Inner().s1();
		
		//2nd way
		//OutsideOuter.Inner a=new OutsideOuter().new Inner();
		//a.s1();
		
		//3rd
		
	OutsideOuter a=new OutsideOuter();
	OutsideOuter.Inner b=a.new Inner();
	b.s1();
	}

}
