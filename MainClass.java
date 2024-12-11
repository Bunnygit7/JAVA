package pak1;

public class MainClass 
{
	public static void main(String[] args) {
		System.out.println("hello");
		System.out.println(args[0]);
		System.out.println(args[1]);


		
	}
	
	/*
	 
	 public-->Access modifier : It should be available to all other classes in the project
	 -----
	 static: Initially we don't any object to call the main method and main method is the first method to be executed so it should be static so jvm doesn't need object to call the main method
	 -------
	  void:	   we all know that in a java program the first and last method to be executed is main method
	  -----	   if we declare main method as other than void, 100% it should return some respective value 
		       but main method is the first and last method to be executed if we have return stmt in  main method 
		       where it will return? (i.e., it didn't have any calling method) so we will get exception.
	       
	  main:	it is just a pre-defined method name 
	  -----
	  
	  String[] args: 	It is used for accepting arguments from commandline
	  --------------    (ex: javac MainClass.java
			                 java MainClass hi namasthe ) here hi and namasthe are command line args.
			                 
			            in eclipse we cannot give args directly steps are below,
			            
			            To pass command line arguments in Eclipse for a Java program:
			            
						Open Run Configurations:
						
						Right-click on your Java class containing the main method.
						Select Run As -> Run Configurations.
						
						Navigate to Arguments Tab:
						In the Run Configurations window, select the Arguments tab.
						
						Enter Arguments:
						In the Program arguments text box, enter your arguments separated by spaces.
						For example: arg1 arg2 10 "Hello World"
						
						Apply and Run:
						Click Apply to save the configuration.
						Click Run to execute your program with the specified arguments  
	 */
}
