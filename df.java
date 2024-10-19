import java.util.*;
class Overloading{
Overloading()
{
  Scanner sc=new Scanner(System.in);
   System.out.println("Enter the number to check Automorphic or not");
 	int x=sc.nextInt();
      int sq,f=1;
	sq=x*x;
 	while(x>0)
	{
	  if(x%10!=sq%10)
	{
          f=0;
	  System.out.println("Not Automorphic");
	break;
	}
	x/=10;
	sq/=10;
	}
	if(f==1)
	System.out.println("Automorphic");
	}
	Overloading(int z)
	{
		int temp,r,sum=0,i;
	temp=z;
          while(z>0){
  		r=z%10;
		int fact=1;
	for(i=1;i<=r;i++){
		fact*=i;
    }
	z/=10;
        sum+=fact;
	}
if(temp==sum)
System.out.println("Strong number");
else
System.out.println("Not a Strong number");
}
}
class df
{
public static void main(String args[]){
	Overloading ob=new Overloading();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value to check num is strong or not");
 	int z=sc.nextInt();
	Overloading ob1=new Overloading(z);
}}
	
	