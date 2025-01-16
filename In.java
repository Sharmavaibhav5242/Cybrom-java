import java.util.Scanner;
public class In
{
public static void main(String arg[])
{
int a=10;
int b=11;
System.out.println(a+" "+b);

Scanner obj=new Scanner(System.in);

String name;
int age;


System.out.println("Enter age,name");

age=obj.nextInt();
obj.nextLine();
name=obj.nextLine();



System.out.println(name+" "+age);



}
}