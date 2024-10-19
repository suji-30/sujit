import java.util.*;
class bisearch{
int result;
bisearch(int array[],int element,int low,int high){
while(low<=high){
int mid=(low+high)/2;
if(array[mid]==element){
result=mid;
}
if(array[mid]<element){
result=mid+1;
}
if(array[mid]>element){
result=mid-1;}
else{
result=-1;
}
}
public static void main(String args[]){
Scanner o=new Scanner(System.in);
System.out.println("Enter the size");
int n=o.nextInt();
System.out.println("Enter the elements of the array:");
int i;
int a[]=new int[n];
for(i=0;i<n;i++){
 a[i]=o.nextInt();
}
System.out.println("Enter the search element:");
int se=o.nextInt();
bisearch obj=new bisearch();
int r=obj.bisearch(array,element,0,n-1);
if(r==-1){
System.out.println("Element not found");
}
else{
System.out.println("Element  found");
}
}}



