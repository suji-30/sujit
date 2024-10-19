import java.util.*;
import java.lang.*;
class NoMatchExpression extends Exception{
public String toString(){
return "String  is not equal to India";
}
}
public class Main{
public static void main(String args[]){
String str;
Scanner s=new Scanner(System.in);
System.out.println("Enter a String:");
str=s.nextLine();
String in="India";
NoMatchExpression nme=new NoMatchExpression();
try{
if(!str.equals(in)){
System.out.println("Error");
throw nme;
}
else{
System.out.println("String equals");
}
}
catch(NoMatchExpression e)
{
System.out.println(e);
}
}
}
