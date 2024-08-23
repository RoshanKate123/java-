class Constructor9
{
 
   int accountBal ;
   
    Constructor9( String custName, int amountDeposit)
	{
	 if( amountDeposit > 10000)
	 {
	 System.out.println(" Account Create Successfully " );
	 
	 this.accountBal = this.accountBal + amountDeposit;
	 }
	 else
	 {
	 System.out.println(" Invalic amount , please retry" );
	 }
	 
	}
 public static void main(String args[])
 {
   System.out.println(" @ start ");
   Constructor9 cons = new Constructor9("Shraddha" , 10001);
   System.out.println(" @ stop ");
   
 }
}