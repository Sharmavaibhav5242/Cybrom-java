import java.util.Scanner;
public class Ternary
{
public static void main(String []args)
{
Scanner obj=new Scanner(System.in);
int fn;
int sn;
int tn;
System.out.println("Enter numbers");
fn=obj.nextInt();
sn=obj.nextInt();
tn=obj.nextInt();
String result;
result=(fn>=sn && fn>=tn)?String.valueOf(fn):(sn>=tn && sn>=fn)?String.valueOf(sn):String.valueOf(tn);
System.out.println("Greatest number among these ="+" "+result);
}
}
