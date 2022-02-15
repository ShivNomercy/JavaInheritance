package SingleInheritance;
// Single inheritance , object will create for child class only. sufficiant
class P{
	  int i,j; // public & protected
	public void showij()
	{
		System.out.println("the value of i: "+i);
		System.out.println("the value of j: "+j);
	}
}
class C extends P{
	  int k;
	public void showk()
	{
		System.out.println("the value of k: "+k);
	}
	public void sum()
	{
		int sum = i+j+k;
		System.out.println("sum is: "+sum);
	}
}
public class Main {
	   public static void main(String[]args)
	   {
		     C co = new C (); // no need to create object for parent.
		       co.i= 10;
		       co.j= 10;
		       co.k= 10;
		       co.showij();
		       co.showk();
		       co.sum();
	   }

}
