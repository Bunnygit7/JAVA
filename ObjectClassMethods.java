package pak1;

public class ObjectClassMethods
{
	void demo()
	{
		System.out.println("In demo method");
	}
	protected void finalize()
	{
		System.out.println("Garbage has been collected");
	}
	public static void main(String[] args) 
	{
		ObjectClassMethods obj1=new ObjectClassMethods();
		ObjectClassMethods obj2=new ObjectClassMethods();
		
		
		System.gc();//here objects are not destroyed(referenced)
		
		

		
		System.out.println("obj1 hash code---->"+obj1.hashCode());
		System.out.println("obj2 hash code---->"+obj2.hashCode());
		
		System.out.println("-----------------------------------------------------------------");

		System.out.println("obj1<===>obj1---->"+obj1.equals(obj1));
		System.out.println("obj1<===>obj2---->"+obj1.equals(obj2));
		System.out.println("obj2<===>obj1---->"+obj2.equals(obj1));
		System.out.println("obj2<===>obj2---->"+obj2.equals(obj2));
		
		System.out.println("-----------------------------------------------------------------");

		System.out.println("getClass() obj1---->"+obj1.getClass());
		System.out.println("getClass() obj2---->"+obj2.getClass());
		
		System.out.println("-----------------------------------------------------------------");

		System.out.println("obj1--->"+obj1);
		System.out.println("obj1--->"+obj1.toString());
		
		System.out.println("obj2--->"+obj2);
		System.out.println("obj2--->"+obj2.toString());
		
		System.out.println("-----------------------------------------------------------------");
		
		new ObjectClassMethods().demo();
		
		System.gc();//here object destroyed (usage completed)
		
		new ObjectClassMethods();
		
		System.gc();//here also above object destroyed(unused)
		
		obj1=null;
		
		System.gc();//here also above object destroyed(reference has been removed)
		
		/*
		hashCode():
		----------
		hashCode() will provide a unique identification number of
		class object which is used to distinguish our class object from other objects.
		it will not provide the address location of the object.
		
		
		equals():
		--------
		It returns true if both the objects address locations are same.
		It returns false if both the objects address locations are different.
		equals() checks the address locations.
		the return type of equals() is boolean.
		
		getClass():
		-----------
		it will return fully qualified name of our class.
		
		toString():
		-----------
		It is used to convert an object into String represented format(HexaInteger Code)
		It returns the hexadecimal format of object's hashCode.
		
		
		finalize():
		-----------
		It is internally called by the Garbage Collector.
		It will execute only when there are any objects eligible for destruction(i.e., unused or unreferenced),
		If there are no objects to destroy it will not execute finalize(). That's the reason initially when we called gc(), finalize()is not executed. 
		Garbage collector is used to remove or destroy all the unused or unreferenced objects from the heap memory.
		Garbage Collector will be acting on our program if there is any object eligible for destruction.
		*/
		
		
	}

}
