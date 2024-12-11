package pak1;

public class StaticBlock   
{  
	static int x=10;
	//static variable is created only once when class loaded and it's value is common for whole class and can be accessed directly,
	//if we change it's value once in the program then after the value will continue with new value 
	
	int y=10;
	//instance variable is created everytime an object is created ,
	//i.e., when we declare 10 objects(instance) then this instance variable will be created for every different object(10 variables)
	  public void meth1()
	  {
		  System.out.println("Before Increment value in meth1():"+x);
	  }
	  public void meth2() 
	  {
		  x++;
		  System.out.println("after increment value in meth2():"+x);
	  }
// print method of the StaticBlock class  
	public static void print()   
	{  
	//to execute static method we can directly call using it's name or ClassNmae.methName() 
	//or using respective object also but to save memory not recommended 
	System.out.println("Inside the static print method.");  
	
	}  
	 
	public StaticBlock() {
		System.out.println("Constructor");
	}
	
	//normal block
	{
		System.out.println("hello");
	}

	static  
	{  
	//Static block is executed as soon as the class is loaded,
	//i.e to execute a static block we just need to compile and run then program.
	System.out.println("Inside the static block."); 
	
	}  
  
	

public static void main(String[] args)   
{  
	StaticBlock obj=new StaticBlock();
	obj.meth1();
	obj.meth2();
	
   System.out.println("value of x in main()"+x);
   System.out.println("value of y in main()"+new StaticBlock().y);
  
} 

//order of execution firstly static block then normal block and then constructor
}  
