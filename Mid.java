import java.util.Scanner;
public class Mid
{
public static void main(String []args)
{
Scanner obj=new Scanner(System.in);
int num1;
int num2;
int num3;
int num4;
System.out.println("Enter the number of series");
num1=obj.nextInt();
num2=obj.nextInt();
num3=obj.nextInt();
num4=obj.nextInt();
int result;
result=(num2!=0 && num3!=0)?(num2+num3)/2:0;
System.out.println("The midpoint of the series is"+" "+result);
}
}