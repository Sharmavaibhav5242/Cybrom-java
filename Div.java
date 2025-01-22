public class Div
{
public static void main(String []args)
{
int num=45;
if((num%3==0 && num%5==0 && num%9==0) && (num%10!=0))
{
System.out.println("Divisible");
}
else
{
System.out.println("Not");
}
}
}