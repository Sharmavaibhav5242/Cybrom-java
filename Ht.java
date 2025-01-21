import java.util.Scanner;
public class Ht
{
public static void main(String []args)
{
Scanner obj=new Scanner(System.in);
int num1;
int num2;
int num4;
int num3;
System.out.println("Enter output");
num1=obj.nextInt();
num2=obj.nextInt();
num4=obj.nextInt();
num3=num1+num2+num4;
String result;
result=(num3==2)?"Exactly 2 head":"Not";
System.out.println(result);
}
}