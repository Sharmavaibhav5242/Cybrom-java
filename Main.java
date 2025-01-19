import java.util.Scanner;
public class Main
{
public static void main(String []args)
{
Scanner obj=new Scanner(System.in);
int age;
System.out.println("Enter age");
age=obj.nextInt();
String result;
result=(age>=1 && age<=100)?"Valid age":"Invalid age";
System.out.println(result);
}
}