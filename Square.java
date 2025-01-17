import java.util.Scanner;
public class Square
{
public static void main(String []args)
{
Scanner obj=new Scanner(System.in);
int number;
System.out.println("Enter number whose cube is to be found out");
number=obj.nextInt();
System.out.println(number*number*number);
}
}