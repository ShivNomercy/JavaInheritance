package SingleInheritance;
// single inheritance
class X{
	 private int x,y;
	public void getxy(int x, int y)
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
		return x;
		
	}
}
class Y extends X{
	  protected int z;
	public void getz()
	{
		 System.out.println("the z is :"+z);
	}
	
}
public class Private1 {
	public static void main(String[] args) {
		  Y yo = new Y ();
		    
		    yo.z = 100;
		    
		    yo.getz();
		    yo.z=100;
		    yo.getx();
		    yo.getxy(100, 100);
		    yo.gety();
		    yo.getz();
		    
	}

}
