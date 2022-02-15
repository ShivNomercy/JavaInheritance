package Interfaces;
interface A{
	public void show();
	
}
interface B{
	public void show1();
	
}
class C implements A,B
{
	public void show()
	{
		System.out.println("interface A");
	}
	public void show1()
	{
		System.out.println("interface B");
	}
	
}
public class Main {
	public static void main(String[] args) {
		  C co = new C ();
		    co.show();
		    co.show1();
	}

}
