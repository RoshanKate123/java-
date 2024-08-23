class Constructor3
{

 Constructor3()
 {
  System.out.println("Inside 0 Arg Constructor");
 }
 Constructor3(int a )
 {
  System.out.println("Inside 1 Arg Constructor");
 }
 public static void main(String args[])
 {
  System.out.println("@Start");
  
  Constructor3 ref = new Constructor3();
  Constructor3 ref1 = new Constructor3(10);
  System.out.println("@ Stop");
 }
}