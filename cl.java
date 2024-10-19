import java.util.*;
class Outer{
void input(){
inner in=new inner();
in.display();
}
class inner{
void display(){
int f=0,n,i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
n=sc.nextInt();
for(i=2;i<n;i++){
if(n%i==0)
 f++;
}
if(f==0)
System.out.println("Prime");
else
System.out.println("Not Prime");
}
}
}
class cl{
public static void main(String args[]){
Outer obj=new Outer();
obj.input();
}
}