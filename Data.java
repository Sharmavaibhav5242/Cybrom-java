import java.util.Scanner;
public class Data
{
public static void main (String arg[])
{
  Scanner obj=new Scanner(System.in);
int a;
a=Integer.parseInt(obj.nextLine());
int b;
b=Integer.parseInt(obj.nextLine());
int c;
c=a+b;
System.out.println("The sum of two number is="+c);
}
}