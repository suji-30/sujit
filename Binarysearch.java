import java.util.*;
class Binarysearch{
int []a;
int n;
 public Binarysearch(int[] arr,int size){
 a=arr;
 n=size;
}
int binarySearch(int x){
int low=0;
int high=n-1;
while(low<=high){
int mid=(low+high)/2;
if(a[mid]==x){
return mid;
}
if(x<a[mid]){
high=mid-1;
}
else if(x>a[mid]){
low=mid+1;
}
}
return -1;
}
public static void main(String args[]){
Scanner o=new Scanner(System.in);
System.out.println("\t\t\tBinary search");
System.out.println("\t\t\tEnter the limit:");
int n=o.nextInt();
int a[]=new int[n];
System.out.println("\t\tEnter the elements of the array:");
for(int i=0;i<n;i++){
a[i]=o.nextInt();
}
System.out.println("\t\t\tEnter the element to search");
int se=o.nextInt();
Binarysearch obj=new Binarysearch(a,n);
int res;
res=obj.binarySearch(se);
if(res==-1){
System.out.println("Element not found");
}
else{
System.out.println("Element found");
}
}}




