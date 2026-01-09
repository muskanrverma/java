//  ARITHEMATIC OPERATOR -- 3) multiplication operator

public class Operator3 {
    
    public static void main(String[] args)
    {
        {
            // byte * byte = int
            byte a = 10;
            byte b = 1;
            int mul = a * b; 
            System.out.println(mul);
        }

        {
            //short * short = int 
            short a = 300;        // we can reuse the same variable name as it is not global :)
            short b = 500;
            int mul = a * b;
            System.out.println(mul);

        }

        {
            //int *  int = int 
            int  a = 1000;        // we can reuse the same variable name as it is not global :)
            int b = 5000;
            int mul = a * b;
            System.out.println(mul);
        }
              {
            //char * char = int 
            char a = '1';        // we can reuse the same variable name as it is not global :)
            char b = 'a';
            int mul = a * b;  //multiplies the ASCII value of a and b and prints its product respectively
            System.out.println(mul);

        }

        {
            //long * long = long 
            long a = 50l;        // we can reuse the same variable name as it is not global :)
            long b = 30l;
            long mul = a * b;  
            System.out.println(mul);

        }

        {
            //float * float = float 
            float a = 5.5f;        // we can reuse the same variable name as it is not global :)
            float b = 1.0f;
            float mul = a * b;    
            System.out.println(mul);

        }
        {
            //double * double = double    
            double a = 8.5;        // we can reuse the same variable name as it is not global :)
            double b = 8.5;
            double mul = a * b;   
            System.out.println(mul);

        }
/* 
        {
            //string - string = String
            String a = "Qspiders";        // we can reuse the same variable name as it is not global :)
            String b = " Deccan";
            String mul = a * b;        
            System.out.println(mul);

            //error: bad operand types for binary operator '*'

        }
            */

      /*   {
            //boolean + bollean = Compile time error 
            boolean a = true;        
            boolean b = false;
            boolean mul = a * b;  
            System.out.println(mul);
            // error: bad operand types for binary operator '*'
       

       }*/
    
}
}
    
