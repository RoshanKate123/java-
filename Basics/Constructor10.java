class Constructor10
{
   String empName ; 
   int empId ;
   int empSal;
   
   Constructor10(String empName , int empId , int empSal)
   {
    this.empName = empName;
	this.empId  = empId;
	this.empSal = empSal;
   }
   
   void getInfo()
   {
	    System.out.println(" Emp Id " + empId + " Emp Name " + empName + " Emp Sal " + empSal ) ;
   }
  public static void main(String args[])
  {
    System.out.println(" @ start " );
	
	 Constructor10 cons = new Constructor10("Sharad" , 3243,  30000);
	 cons.getInfo();
	  
	 Constructor10 cons1 = new Constructor10("shakil" , 3838, 40000);
	 cons1.getInfo();
	 
	 Constructor10 cons2  = new Constructor10("Roshan" , 8383, 98088);
	 cons2.getInfo();
	 
	System.out.println(" @ stop ");
  }
}