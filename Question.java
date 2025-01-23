import java.util.Scanner;
public class Question
{
public static void main(String []args)
{
Scanner obj=new Scanner(System.in);
String word;
char letter;
System.out.println("Enter the word");
word=obj.nextLine();
System.out.println("Enter the letter to be found");
letter=obj.nextLine().charAt(0);

if(word.charAt(0)==letter)
{
System.out.println("Letter found"+" "+letter);
}
else if(word.charAt(1)==letter)
{
System.out.println("Letter found"+" "+letter);
}
else if(word.charAt(2)==letter)
{
System.out.println("Letter found"+" "+letter);
}
else if(word.charAt(3)==letter)
{
System.out.println("Letter found"+" "+letter);
}
else if(word.charAt(4)==letter)
{
System.out.println("Letter found"+" "+letter);
}
else if(word.charAt(5)==letter)
{
System.out.println("Letter found"+" "+letter);
}
else if(word.charAt(6)==letter)
{
System.out.println("Letter found"+" "+letter);
}
}
}