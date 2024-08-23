class Constructor7
{
   int a ;
   
   Constructor7()
   { 
    System.out.println("Inside 0 Arg Constructor  " + a);
	 a = 100;
   }
   
    void m1()
	{
	 System.out.println( " Inside method m1 " + a);
	}
public static void main(String args[])
{
	System.out.println("@ start ");
	 Constructor7 ref1 = new Constructor7();
	 ref1.m1();
	 System.out.println("@ stop ");
}
}