class Constructor11 
{
  Constructor11() 
  {
    this( 10);
    System.out.println( " Inside 0 arg Constructor "  );
 	
  }
  Constructor11( int a )
  { 
   System.out.println( " Inside 1 arg Constructor ");
  }
 public static void main(String args[])
 {
	  System.out.println(" @ start ");
	  
	  Constructor11 cons = new Constructor11();
	  System.out.println("@ stop ");
 }
}