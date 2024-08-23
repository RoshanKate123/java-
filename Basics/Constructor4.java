class Constructor4
{
 Constructor4()
 {
	 System.out.println(" Inside 0 Arg constructor top ");
 }
 Constructor4()
 {
	 System.out.println("Inside 0 Arg Constructor Bottom");
 }
 
 public static void main(String args[])
 {
   System.out.println("@ start ");
    
	Constructor4 cons = new Constructor4();
	Constructor4 cons1 = new Constructor4();
   System.out.prinltn("@ stop");
 }
}