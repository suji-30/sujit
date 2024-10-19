import java.util.*;
class Matrix{
int i,j;
int a[][]=new int[3][3];
int b[][]=new int[3][3];
void input(){
System.out.println("\t\t\tMatrix Multiplication");
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value for Matrix A");
for(i=0;i<3;i++){
for(j=0;j<3;j++){
a[i][j]=sc.nextInt();
}
}
System.out.println("Enter the value for Matrix B");
for(i=0;i<3;i++){
for(j=0;j<3;j++){
b[i][j]=sc.nextInt();
}
}
}
}
class Multiply
{
int i,j;
void mul(Matrix ob){
int c[][]=new int[3][3];
for( i=0;i<3;i++){
for( j=0;j<3;j++){
c[i][j]=0;
for(int k=0;k<3;k++)
{
c[i][j]+=(ob.a[i][k]*ob.b[k][j]);
}
}
}
System.out.println("Resultant matrix");
for(i=0;i<3;i++){
for(j=0;j<3;j++){
System.out.print(c[i][j]+" ");
}
System.out.println();
}
}
}
class ll{
public static void main(String args[])
{
Matrix ob=new Matrix();
ob.input();
Multiply o=new Multiply();
o.mul(ob);
}
}



