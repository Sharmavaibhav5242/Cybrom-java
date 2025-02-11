public class Rat {
    public static void main(String[] args) {
        for (int r = 1; r <= 5; ++r) {
            for (int c = 1; c <= 5; ++c) {      //*****
                if (c >= r) {                   // ****
                    System.out.print("*");      //  ***
                } else {                         //  **
                    System.out.print(" ");       //   *
                }
            }
            System.out.println();
        }
        for (int r = 1; r <= 5; ++r) {         //*
            for (int c = 1; c <= 5; ++c) {     //**
                if (c <= r) {                  //***
                    System.out.print("*");     //****
                } else {                       //*****
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int r = 1; r <= 5; ++r) {
            for (int c = 1; c <= 5; ++c) {    //******
                if (c <= 6 - r) {             //*****
                    System.out.print("*");    //****
                } else {                      //***
                    System.out.print(" ");    //**
                }                             //*
            }
            System.out.println();
        }
        for (int r = 1; r <= 5; ++r) {
            for (int c = 1; c <= 5; ++c) {         //*
                if (c >= 6 - r) {                 //**
                    System.out.print("*");       //***
                } else {                        //****
                    System.out.print(" ");     //*****
                }
            }
            System.out.println();
        }
        for(int r=1;r<=5;r++)
     {
         for(int c=1;c<=9;c++)              //*
         {                                 //***
             if(c>=6-r &&  c<=4+r)        //*****
             {                           //*******
                 System.out.print("*"); //*********

             }
             else
             {
                 System.out.print(" ");
             }
         }
         System.out.println();
     }
        int a=0;
        for (int r=1;r<10;++r)
        {
            int i=(r<=5)?a++:a--;
            for (int c=1;c<10;++c)
            {
               if(c>=6-a && c<=4+a)
               {
                   System.out.print("*");
               }
               else
               {
                   System.out.print(" ");
               }
            }
            System.out.println();
        }
        for (int r=1;r<=5;++r)
        {
            for (int c=1;c<=5;++c)
            {
                if (c<=r)
                {
                    System.out.print(r);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int r=1;r<=5;++r)
        {
            for (int c=1;c<=5;++c)
            {
                if (c<=r)
                {
                    System.out.print(c);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
