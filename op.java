import java.util.*;
abstract class swap{
abstract void swap(int x,int y,int z);
}
class sample extends swap{
void swap(int x,int y,int z){
z=x;
x=y;
y=z;
System.out.print("After swapping.....");
System.out.println("The value of x is:"+x);
System.out.print("The value of y is:"+y);
}
public static void main(String args[]){
Scanner o=new Scanner(System.in);
swap sc=new sample();
System.out.println("Enter the x:");
int m=o.nextInt();
System.out.println("Enter the y:");
int n=o.nextInt();
int b=0;
sc.swap(m,n,b);
}}

