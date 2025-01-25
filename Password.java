import java.util.Scanner;
public class Password
{
public static void main(String []args)
{
Scanner obj=new Scanner(System.in);
int password=5242;
int confirm;
int confirm2;
System.out.println("Enter password");
confirm=obj.nextInt();
if(password==confirm)
{
 System.out.println("Correct password");

}
else
{
System.out.println("Wrong password");
System.out.println("Enter again");
}
confirm2=obj.nextInt();
if(password==confirm2)
{
  System.out.println("Correct password");
}
else
{
System.out.println("Blocked");
}
}
}
