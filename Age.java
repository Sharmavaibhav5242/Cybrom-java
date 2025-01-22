import java.util.Scanner;
public class Age
{
public static void main(String []args)
{
Scanner obj=new Scanner(System.in);
int age;
System.out.println("Enter age");
age=obj.nextInt();
if(age>=18)
{
System.out.println("Eligible for voting");
}
else
{
System.out.println("Non-eligible");
}
}
}