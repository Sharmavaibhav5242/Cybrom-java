import java.util.Scanner;
public class Balanced {
    static boolean bp(String str) {
        int circle = 0;
        int square = 0;
        int curly = 0;
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch == '[') {
                square++;
            } else if (ch == '{') {
                curly++;
            } else if (ch == '(') {
                circle++;
            }
            if (ch == ')') {
                circle--;
            } else if (ch == '}') {
                curly--;
            } else if (ch == ']') {
                square--;
            }
        }
        if (square == 0 && circle == 0 && curly == 0) {
            return true;
        } else {
            return false;
        }
    }

        public static void main (String[]args){
            Scanner obj = new Scanner(System.in);
            String str = "[{()}]";
            if (bp(str)) {
                System.out.println("Balanced");
            } else {
                System.out.println("Unbalanced");
            }
//        String one="[{()}]";
//        char ch;
//        int square=0;
//        int curly=0;
//        int circle=0;
//        for (int i=0;i<one.length();i++)
//        {
//          ch=one.charAt(i);
//          if (ch=='[')
//          {
//              square++;
//          } else if (ch=='{') {
//              curly++;
//          } else if (ch=='(') {
//              circle++;
//          }
//          if (ch==')')
//          {
//              circle--;
//          } else if (ch=='}') {
//              curly--;
//          } else if (ch==']') {
//              square--;
//          }
//        }
//        if (square==0 && circle==0 && curly==0)
//        {
//            System.out.println("Balanced");
//        }
//        else
//        {
//            System.out.println("Unbalanced");
//        }
        }
    }


