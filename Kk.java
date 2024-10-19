import java.util.*;			                                                                                 
 class base
 { 														
int n;
 base() 
{
 Scanner sc=new Scanner(System.in);
 System.out.print("Enter a number :");
 n=sc.nextInt(); 
}
 }
 class derived extends base 
{ 
int s=0,a;
 derived()
{ 
super();
 int sq=super.n*super.n; 
int n=sq;
 while(n>0) 
{ 
a=n%10; 
s=s+a; 
n=n/10; 
}
 if(s==super.n)
 System.out.print("neon");
 else System.out.print("not neon");
 } } 
class Kk
 { 
public static void main(String args[])
 {
 derived d=new derived(); 
} 
}