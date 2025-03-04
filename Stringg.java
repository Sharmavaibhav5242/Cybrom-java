public class Stringg {
    public static void main(String[] args) {
//        String obj="Vaibhav";
//        String objj=new String("vaibhav");
//        char ch[]={'v','a','i','b','h','a','v'};
//        System.out.println(obj);
//        System.out.println(objj);
//        System.out.print(ch);
//        char chh[]={'v','a','i','b','h','a','v'};
//        String objjj=new String(chh);
//        System.out.println(objjj);
//        String obj1="orange";
//        System.out.println(obj1.replace("orange","apple"));
//        System.out.println(obj1);
//        obj1=obj1.replace("orange","apple");
//        System.out.println(obj1);

        String obj = "nitin";
        String org=obj;
        char[] ch=obj.toCharArray();
        int i=0;
        int j=4;
        while(i<j)
        {
            char temp;
            temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        System.out.println(ch);
        obj=ch.toString();

        if (org==obj){
            System.out.println("Pallindrom");
        }
        else
        {
            System.out.println("not");
        }

    }
}
