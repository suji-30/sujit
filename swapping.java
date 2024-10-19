import java.util.*;
abstract  class swap
{
  abstract void swap(int x, int y, int z);
}

 public class swapping extends swap
{
    void swap(int x, int y,int z)
    {
         
     z=x;
     x=y;
     y=z;
System.out.println("\nAfter Swapping");
     System.out.println("\nThe First value is "+ x );
     System.out.println("\nThe Second value is "+ y);

    }
    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);
       
        swap s = new swapping();
        System.out.print("Enter  first value ");
        int m=sc.nextInt();
       
         System.out.print("\nEnter  second value ");
        int n=sc.nextInt();
        int b=0;
        s.swap(m,n,b);
    }
}

