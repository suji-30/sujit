//1.Swapping of two numbers using Abstract class
import java.util.*; 
abstract class swap { 
int x,y;
 swap(int x,int y)
 {
 this.x=x;
 this.y=y;
 } 
public abstract void swapno(); 
} 
class swapnum extends swap
 { 
swapnum(int x,int y) 
{ 
super(x,y); 
} 
public void swapno()
 { int c=x; x=y; y=c; 
} }
 class funzone
 { 
public static void main(String ar[]) 
{ int a,b; Scanner sc=new Scanner(System.in); 
System.out.print("Enter a:"); 
a=sc.nextInt(); 
System.out.print("Enter b:"); 
b=sc.nextInt(); 
System.out.println("Before Swap a:"+ a + ",b:" +b);
 swapnum ob = new swapnum(a,b);
 ob.swapno(); 
System.out.println("After Swapping a:"+ ob.x + ",b:" + ob.y);
 }
 }

