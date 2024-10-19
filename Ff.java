import java.io.*;
 abstract  class Sample {
 abstract void swapno(int x,int y,int z);
}
 class Swapping extends Sample{
	 void swapno(int x,int y,int z) {
		 z=x;
		 x=y;
		 y=z;
		 System.out.println("x="+x);
		 System.out.println("y="+y);	 
	 }
 }
  public class Ff{ 
	 public static void main(String args[]) {
		 Swapping o=new Swapping();
		 o.swapno(5, 2, 0);
	 }
 }
 
