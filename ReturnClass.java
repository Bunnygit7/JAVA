package pak1;

public class ReturnClass {
	void meth0()
	{
		System.out.println("void meth()");
	}
	
	void meth4(int a)
	{
		System.out.println("namaste");
		if(a>10)
		{								//we can use return stmt in void return type method also but we should not return any thing
			System.out.println("if block");//return is used to terminate the method 
			return;//here if condition is true then it executes if block and returns nothing to calling method(main())
			       //so after this(if) block else block will not be executed since return statement is used
		}
		else
		{
			System.out.println("else block");
			return;
		}
	}
	int meth1()
	{
		System.out.println("hello");
		return 10;
	}
	String meth2()
	{
		System.out.println("hi");
		return "java";
	}
	int meth3(int a)
	{
		System.out.println("namaste");
		if(a>10)
		{
			return a;
		}
		else
		{
			return a*2;
		}
		//return stmt will not be the last statement of the method but only in control statements
	}
	public static void main(String[] args) 
	{
		new ReturnClass().meth0();
		System.out.println(new ReturnClass().meth1());
		System.out.println(new ReturnClass().meth2());
		System.out.println(new ReturnClass().meth3(5));
		new ReturnClass().meth4(11);
		
	}

}
