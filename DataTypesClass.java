package pak1;

public class DataTypesClass 
{
	byte a;
	short b;
	int c;
	long d;
	float e;
	double f;
	char g;
	boolean h;
	
	void meth() 
	{
		
		System.out.println("Default values");
		System.out.println("--------------");
		System.out.println("Default value of byte"+a);
		System.out.println("Default value of short"+b);
		System.out.println("Default value of int"+c);
		System.out.println("Default value long"+d);
		System.out.println("Default value float"+e);
		System.out.println("Default value double"+f);
		System.out.println("Default value char"+g);//non printable character
		System.out.println("Default value boolean"+h);

	}
	void meth2()
	{
		System.out.println("--------------");

		byte b1=10;
		byte b2=20;
		byte b3=(byte)(b1+b2);//here we are type casting the operation because the compiler by default consider every numeric number as type int, so we cannot store an int type value in byte variable. 
		System.out.println("value of b3:"+b3);
		
		//in java every number is by default considered as int by the compiler
		System.out.println("--------------");

		//in java every decimal value is by default considered as double by the compiler
		float x=10.53f;
		System.out.println(x);
		
		System.out.println("--------------");
		
		
	}
	public static void main(String[] args) 
	{
		new DataTypesClass().meth();
		new DataTypesClass().meth2();
	}

}
