import java.util.*;
class A{
public static void main(String args[]){
int n=5;
for(int i=1;i<=n;i++)
{
for(int j=n-1;j>=i;j--)
{
	System.out.print(" ");
}
for(int s=1;s<=i;s++){
System.out.print((i*s));
}
System.out.println();
}
}
}