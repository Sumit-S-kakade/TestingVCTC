package pack9;

public class ImpClass implements inter 
{
     public void method5()
     {
    	 System.out.println("method 5 in imp class");
     }
//	@Override
//	public void method1() 
//	{
//		System.out.println("Hii - Method1");
//		
//	}
//
//	@Override
//	public void method2() 
//	{
//		System.out.println("Hii-method2");
//		
//	}
//	
	public static void main(String[] args) 
	{
		
		ImpClass x  = new ImpClass();
		x.method5();
//		x.method1();
//		x.method2();
//		
////		Calling static method
//		
//		inter .method3();
//		
//		ImpClass.method3();    not possible
		
		
		
	}
	
	
	

}
