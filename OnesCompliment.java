import java.util.Scanner;
public class OnesCompliment
{
public static void main(String []args)
{
int password=5242;
int Confirm;
Scanner obj=new Scanner(System.in);
System.out.println("Confirm Password");
Confirm=obj.nextInt();

String result;
String result2;
result=(password==Confirm)?"Open":"Wrong password";
System.out.println(result);
result2=(password!=Confirm)?"Enter correct password":"open";
System.out.println(result2);
int confirm;
confirm=obj.nextInt();

String finall;
finall=(password==confirm)?"Open":"Wrong password";
System.out.println(finall);

}
}