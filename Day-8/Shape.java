package java8and9;

public interface Shape {
	
  public default void square(int a)
  {
	  System.out.println("perimeter of square: " +(4*a));
	  cube(a);
	  sqroot(a);
  }
  
  private void cube(int a)
  {
	  System.out.println("perimeter of cube: " +(12*a));
  }
  
  private static void sqroot(int a)
  {
	  System.out.println("square root  is : " +(a*a));
  }
  
}
