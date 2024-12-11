package pak1;

public class IdentifierClass 
{
	void meth_1()
	{
		System.out.println("i'm in meth()");
	}
	
	public static void main(String[] args) {
		int A123=10;
//		int 1a=20;//invalid variable name(never start name with any number)
//		int a@=30;//invalid variable name(other than $ and _ we cannot use any symbol
//		int _b=40;//invalid variable name(never start name with any symbol)
		IdentifierClass obj$=new IdentifierClass();
		
		obj$.meth_1();
		
	}
	/*
	 Identifier is nothing but names given to the classes, objects, variables, and methods.
	 
	 */

}
