//compile time polymorphism  same name method within same class(method overloading)
//run time polymorphism       same name method different class (method overriding)

class twoooo
{
    void show()
    {
        System.out.print("Class two");
    }
}
public class Polymorphism extends twoooo {
    void show()
    {
        System.out.println("Class one");
    }
    public static void main(String[] args) {
     twoooo obj=new Polymorphism();
      obj.show();

      twoooo obj1=new twoooo();
      obj1.show();
    }
}
