class Example11
{
	
	int a;
	
	{
		System.out.println("Inside non-static block -- 1  "+ a);
		a = 10;
	}
	{
		System.out.println("Inside non-static block --  2  " + a);
	}
	
	Example11()
	{
		this. a= 20;
		System.out.println("Inside The constructor -1   " +a);
		
	}
	
	Example11( int b)
	{
		this();
		System.out.println("Inside The constructor -2   " + b);
	                                                                                                                                                                                              
}
	
 public static void main(String args[])
 {
  System.out.println("Start @cyber sucesss");
  Example11 exp = new Example11(30);
   
  System.out.println("Stop @ cyber success");
 }
}