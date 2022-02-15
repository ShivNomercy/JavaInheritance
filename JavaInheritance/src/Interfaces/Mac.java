package Interfaces;
interface X{
	public void get();
}
interface Y extends X{
	public void get1();
}
class Z implements Y{
	public void get()
	{
		System.out.println("interface X");
	}
	public void get1()
	{
		System.out.println("interface Y");
	}
	
}
public class Mac {
   public static void main(String[] args) {
	      Z zo = new Z ();
	        zo.get();
	        zo.get1();
	        
	 
}
}
