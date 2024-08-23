 class Constructor8 
 {
   int a ; 
   
   Constructor8(int a )
   {
    System.out.println(" Insiide 1 arg constructor " + this.a );
	this.a = a ;
   }
   void m1()
   {
    System.out.println(" Inside m1 method  " + a);
   }
  public static void main(String args[])
  {
    System.out.println(" @ start " );
	
	Constructor8 ref = new Constructor8(10	);
	ref.m1();
	
	System.out.println(" @ stop ");
  }
 }