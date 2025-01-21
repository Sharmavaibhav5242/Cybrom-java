import java.util.Scanner;
public class Triangle
{
public static void main(String []args)
{
Scanner obj=new Scanner(System.in);
int side1;
int side2;
int side3;
System.out.println("Enter the length of the sides of triangle");
side1=obj.nextInt();
side2=obj.nextInt();
side3=obj.nextInt();
String result;
result=(side1==side2 && side2==side3 && side3==side1)?"Equilateral":"Non-Equilateral";
System.out.println(result);
}
}