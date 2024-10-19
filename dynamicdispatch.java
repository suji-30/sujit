import java.util.*;
class base
{
Scanner sc=new Scanner(System.in);
void example()
{
int a=0,b=1,c;
System.out.println("Enter number:");
int n=sc.nextInt();
if(n==1)
System.out.println("Fibo of 1 is 0");
else if(n==2)
System.out.println("Fibo of 2 is 1");
else
{
System.out.println(a);
System.out.println(b);
for(int i=2;i<n;i++)
{
c=a+b;
System.out.println(c);
a=b;
b=c;
}
}
}
}
class derived extends base
{
void example()
{
System.out.println("Enter number:");
int n=sc.nextInt();
if(n%2==0)
System.out.println("Even");
else
System.out.println("odd");
}
}
class child extends derived
{
void example()
{
System.out.println("Enter principal amount:");
int p=sc.nextInt();
System.out.println("Enter no of yrs:");
int n=sc.nextInt();
System.out.println("Enter rate of interest:");
int r=sc.nextInt();
System.out.println(p*n*r/100);
}
}
class dynamicdispatch
{
public static void main(String ar[])
{
base a=new base();
derived b=new derived();
child c=new child();
base r;
r=a;
r.example();
r=b;
r.example();
r=c;
r.example();
}
}