public class Laxography
{
public static void main(String []args)
{
String word1="car";
String word2="Asus";
String word3="apple";

if(word1.compareTo(word2)>0)
{ 
String temp=word1;
word1=word2;
word2=temp;
}
if(word1.compareTo(word3)>0)
{
String temp=word1;
word1=word3;
word3=temp;
}


if(word2.compareTo(word3)>0)
{
String temp=word2;
word2=word3;
word3=temp;
}

System.out.println(word1);
System.out.println(word2);
System.out.println(word3);
}
}
