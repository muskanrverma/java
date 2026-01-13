// widening is type of primitive typecasting 
//for Short

public class Widening2 {

    public static void main(String[]args)
    {
        {
            short s1 = 2250;
            int i1 = s1;        //widening typecasting
            System.out.println("short " +s1);
            System.out.println("to int " + i1);
        }
        {
            short s1 = 562;
            long l1 = s1;
            System.out.println( "short " + s1);
            System.out.println("to long " + l1);
        }
        {
            short s1 = 4514;
            float f1 = s1;
            System.out.println( "short " + s1);
            System.out.println("to float " + f1);
        }
        
        {
            short s1 = 8546;
            double d1 = s1;
            System.out.println( "short " + s1);
            System.out.println("to double " + d1);
        }
         /*{
            short s1 = 97;
            char c1 = s1;
            System.out.println( "short " + s1);     //error: incompatible types: possible lossy conversion from short to char
            System.out.println("to Char " + c1);
        }*/
        }
    }
    

