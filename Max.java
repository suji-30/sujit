import java.util.*;
class Max{
public static void main(String args[]){
int max=Integer.MIN_VALUE;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size:");
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<arr.length;i++)
{
 arr[i]=sc.nextInt();
}
for(int i=0;i<n;i++){
if(arr[i]>max)
{
  max=arr[i];
}
}
System.out.println(max);
}
}