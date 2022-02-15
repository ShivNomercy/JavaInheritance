package MethodOverriding;
class A{
	public void show(int x, int y)
	{
		int z = x+y;
		System.out.println("the sum is :"+z);
	}
}
class B extends A{
	public void show(int x, int y)
	{
		int z = x-y;
		System.out.println("the sub is :"+z);
	}
}
class C extends A{
	public void show(int x, int y)
	{
		int z = x*y;
		System.out.println("the multi is :"+z);
	}
}
class D extends A{
	public void show(int x, int y)
	{
		int z = x/y;
		System.out.println("the Div is :"+z);
	}
	
}
public class Main {
   public static void main(String[] args) {
	     A ao = new A();
	       ao.show(100, 50);
	     B bo = new B();
	       bo.show(500, 100);
	     C co = new C();
	       co.show(1000, 500);
	     D da = new D();
	       da.show(500, 100);
}
   
}
