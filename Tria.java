import java.util.Scanner;
public class Tria
{
public static void main(String []args)
{
Scanner obj=new Scanner(System.in);
int side1;
int side2;
int side3;
System.out.println("Enter sides");
side1=obj.nextInt();
side2=obj.nextInt();
side3=obj.nextInt();
if(side1==side2 && side2==side3)
{
System.out.println("Euilateral");
}
else
{
System.out.println("Not");
}
}
}