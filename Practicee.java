import java.util.Scanner;
public class Practicee
{
public static void main(String []args)
{
Scanner obj=new Scanner(System.in);
int num;
System.out.println("Enter number");
num=obj.nextInt();
String result;
result=((num%2==0 && num%4==0 && num%6==0) && (num%8!=0))?"Divisible":"Non-Divisible";
System.out.println(result);
}
}