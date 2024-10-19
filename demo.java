import java.util.*;
class demo{
void test(){
int n=121,rev=0;
int  temp=n;
while(n>0){
int digit=n%10;
rev=(rev*10)+digit;
n/=10;
}
if(temp==rev)
System.out.println("Palindrome number");
else
System.out.println("Not a palindrome");
}
void test(int num){

int sum=0;
int s=num*num;
while(s>0){
int digit=s%10;
sum+=digit;
s/=10;
}
if(num==sum)
System.out.println("Neon number");
else
System.out.println("Not a neon number");
}
void test(int n,int f){
int i;
for(i=1;i<=n;i++){
f*=i;
}
System.out.println("Factorial of "+n+"is"+f);
}
public static void main(String args[]){
demo obj=new demo();
obj.test();
int num=9;
obj.test(num);
int n=5,f=1;
obj.test(n,f);
}
}




