import java.util.Scanner;
import java.lang.System;
//      user defined exception
//        example of throw
class Ae extends  RuntimeException
{
  Ae()  {
        super("divide by zero not allowed");
}
}
class Result
{
    void divisibility()
    {
        try
        {
            int number;
            Scanner obj=new Scanner(System.in);
            number=obj.nextInt();
            if (number<1)
            {
                throw new Ae();
            }
        }
        catch (Ae e)
        {
            e.printStackTrace();
        }
    }
}
public class Coupling {
    public static void main(String[] args) {

        Result obj=new Result();
        obj.divisibility();

    }
}
