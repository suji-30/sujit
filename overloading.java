import java.util.*;
class overloading{
overloading(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the element:");
int n=sc.nextInt();
int t,m=1;
t=n;
while(n>0){
m*=10;
n/=10;
}
if((t*t)%m==t){
System.out.println("Automorphic number");
}
else{
System.out.println("Not a Automorphic number");
}
}
overloading(int a,int sum){
int r,i,p;
int num=a;
while(num!=0){
i=1;
p=1;
r=num/10;
while(i<=r){
p*=i;
i++;
}
sum+=p;
num/=10;
}
if(a==sum)
System.out.println("This is a strong number");
else
System.out.println("This is not a strong number");
}
public static void main(String args[]){
overloading ob1=new overloading();
Scanner o=new Scanner(System.in);
System.out.println("Enter the number:");
int a=o.nextInt();
int sum=0;
overloading ob2=new overloading(a,sum);
}}



