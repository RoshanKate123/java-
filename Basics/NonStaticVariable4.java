class NonStaticVariable4
{
	public static void main(String args[])
	{
		
		System.out.println("Start @ cyber success");
		NonStaticVariable4 ref = new NonStaticVariable4();
		ref.m1();
		System.out.println("Stop @ Cyber successs");
	}
	
	void mi()
	{
		System.out.println("Inside nont static method");
		
		return;
	}
}