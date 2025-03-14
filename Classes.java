class Two
{
    int a;
    int c;
    String b;
    Two(int a)
    {
        this.a=a;
        System.out.println(a+" "+b+" "+c);
    }
}
public class Classes {
    public static void main(String[] args) {
       Two obj=new Two(10);
    }
}
