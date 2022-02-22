package basicJavaProgram;

public class SuperClass
{ 
	int a = 10;
	int b = 20;
	 
    public void method1()
    {
    	System.out.println("Method1-Non static-SuperClass");
    }
  public static void method2()
  {
	  System.out.println("Method2-Static-SuperClass");
  }

	public static void main(String[] args) 
	{    
		
		//Non Static method call
		 SuperClass x = new  SuperClass();
				 x.method1();
		
				 
//		Static method call
				 
		 SuperClass. method2();
			
	}

}
