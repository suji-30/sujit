import java.util.Scanner;
public class ss {
    public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
           int result=0;
           int sum=0;
      int temp=n;
while(n>0){
  int digit=n%10;
  sum+=(digit*digit*digit);
  n/=10;
}
if(sum==temp){
  System.out.println("Armstrong number");
  result=0;
}
else{
  System.out.println("Not an Armstrong number");
  result=1;
    
}
System.out.println(result);

    
   
} 
}
