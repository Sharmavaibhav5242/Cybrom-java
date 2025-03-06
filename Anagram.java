import java.util.Scanner;
public class Anagram {
    static boolean sub(String str,String str1)
    {
        char ch=0;
        char ch1=0;
        int num=0;
        for (int i=0;i<str.length();++i)
        {
            ch=str.charAt(i);
            for (int j=0;j<str1.length();++j)
            {
                ch1=str1.charAt(j);
                if (ch==ch1){
                    num++;
                }
            }
        }

        if (num!=str1.length())
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public static void main(String[] args) {
        String str="ABCDE";
        String str1="ABC";
        if (sub(str,str1))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}