import java.io.*;
import java.util.*;
abstract class demo
{
public abstract void swap();
}
class swapping extends demo
{
int a,b;
Scanner sc=new Scanner(System.in);
public void swap()
{
System.out.print("Enter num1:");
a=sc.nextInt();
System.out.print("Enter num2:");
b=sc.nextInt();
int c=a;
a=b;
b=c;
System.out.println("The value of a now:" +a+"The value of b now:" +b);
}
}
class abstractswap
{
public static void main(String arg[])
{
swapping d=new swapping();
d.swap();
}
}
