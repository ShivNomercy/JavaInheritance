package MultiLevelInheritance;


import MultiLevelInheritance.BBB.CCC;

class AAA{
	 int x;
	 public void showx()
	 {
		 System.out.println("the X is :"+x);
	 }
	 
}
class BBB extends AAA{
	  int y;
	  public void showy()
	  {
		  System.out.println("the Y is :"+y);
	  }
class CCC extends BBB{
	  int z;
	  public void showz()
	  {   
		    z = x+y;
		  System.out.println( "the Z is :"+z);
	  }	  
}
}
public class Main {
	  public static void main(String[] args) {}

}
