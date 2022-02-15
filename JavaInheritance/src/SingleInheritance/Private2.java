package SingleInheritance;
class PP{
	private int x,y;
	public void setxy(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	public int getx()
	{
		return x;
		
	}
	public int gety()
	{
		return y;
		
	}
}
class CC extends PP{
	 int k;
	public void showxy()
	{
		System.out.println("the value of k: "+k);
	}
	public void sum()
	{
		int sum = getx()+gety()+k;
		System.out.println("the sum is : "+sum);
	}
}
public class Private2 {
	  public static void main(String[] args) {
		  
		     CC co = new CC();
		        co.setxy(100, 100);
		        co.k=100;
		        co.getx();
		        co.gety();
		        co.showxy();
		        co.sum();
		
		     
		     
 }

}
