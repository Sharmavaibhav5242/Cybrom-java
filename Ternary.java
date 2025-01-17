import java.util.Scanner;
public class Ternary
{
public static void main(String []args)
{
Scanner obj=new Scanner(System.in);
int a;
int b;
int c;
System.out.println("Enter 3 numbers");
a=obj.nextInt();
b=obj.nextInt();
c=obj.nextInt();
String result;
result=(a>b)?(a>c)?a:"no";
System.out.println(result);
}
}
