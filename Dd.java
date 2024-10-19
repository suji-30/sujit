import java.util.*;
class Base{
	int n;
	Base(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
	}
}
class Derived extends Base{
int s=0,a;
	Derived()
{

		super();
		int sq=super.n*super.n;
		int n=sq;
		while(n>0) 
{
			 a=n%10;
			s=n+a;
			n=n/10;
			
		}
		if(s==super.n)
			System.out.println("Neon");
		else
			System.out.println("Not a Neon");
		
	}
}
public class Dd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived d=new Derived();
	}

}
