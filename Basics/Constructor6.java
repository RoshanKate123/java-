class Constructor6
{

 Constructor6()
 {
  System.out.println("Inside 0 Arg Constructor");
 }
 public static void main(String args[])
 {
  System.out.println(" @ start " );
  
   // Named objeect creation 
   Constructor6 cons = new Constructor6();
   
   // Nameless object creation 
   
   new Constructor6();
  System.out.println(" @ stop ");
 }
}