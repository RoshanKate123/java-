class Constructor5 
{
   
   Constructor5(int a)
   {
    System.out.println("Inside 1 Arg Constructor" + a); 
   }


 public static void main(String args[])
 {
  System.out.println("@ start");
  Constructor5 ref = new Constructor5(20);
  Constructor5 ref1 = new Constructor5();
  System.out.println("@ stop");
 }
}