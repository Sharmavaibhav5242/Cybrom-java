public class Seq {

    public static boolean subseq(String str1,String str2)
    {
        int i=0;
        int j=0;

        while(i<str1.length()&& j<str2.length())
        {

            if(str1.charAt(i)==str2.charAt(j))
            {
                i++;
            }
            j++;


        }

        return i==str1.length();

    }


    public static void main(String[] args) {

        String str1="abcdef";
        String str2="bcdef";

        if(subseq(str1,str2))
        {
            System.out.print("subseq");
        }
        else
        {
            System.out.print("not subseq");
        }

    }



}