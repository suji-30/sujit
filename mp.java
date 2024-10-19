
import java.util.*;
import java.io.*;
class A{
int n=3;
int a[][]=new int[n][n];
int b[][]=new int[n][n];
Scanner  o=new Scanner(System.in);
void multi(){
System.out.println("Enter the elements of 1st matrix:");
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
a[i][j]=o.nextInt();
}}
System.out.println("1st element matrix are.....");
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
System.out.print(a[i][j]+" ");
}
System.out.println();
}
System.out.println("Enter the elements of 2nd matrix:");
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
b[i][j]=o.nextInt();
}}
System.out.println("2nd element matrix are.....");
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
System.out.print(b[i][j]+" ");
}
System.out.println();
}
}
}
class B extends A{
void display(){
int c[][]=new int[n][n];
System.out.println("Multiplying the matrix.....");
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
c[i][j]=0;
for(int k=0;k<n;k++){
c[i][j]+=(a[i][k] * b[k][j]);
}}}
System.out.println("\t\tOutput matrix");
for(int i=0;i<n;i++){
System.out.print("\n\n\t\t");
for(int j=0;j<n;j++){
System.out.print(c[i][j]+" ");
}}
}}
class mp{
public static void main(String args[]){
B ob=new B();
ob.multi();
ob.display();
}
}






	