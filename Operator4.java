
// ARITHEMATIC OPERATORS 4) division

public class Operator4 {

    public static void main(String[] args)
    {
        {
            // byte / byte = int
            byte a = 10;
            byte b = 2;
            int div = a / b; 
            System.out.println(div);
        }

        {
            //short / short = int 
            short a = 1000;        // we can reuse the same variable name as it is not global :)
            short b = 500;
            int div = a / b;
            System.out.println(div);

        }

        {
            //int /  int = int 
            int  a = 25999;        // we can reuse the same variable name as it is not global :)
            int b = 2;
            int div = a / b;
            System.out.println(div);
           
        }
              {
            //char / char = int 
            char a = 'd';        // ASCII value 100
            char b = '1';        // ASCII value 49
            int div = a / b;  //divides the ASCII value of a and b and prints its quotient respectively
            System.out.println(div);
          

        }

        {
            //long / long = long 
            long a = 6597l;        // we can reuse the same variable name as it is not global :)
            long b = 22l;
            long div = a /b; 
            System.out.println(div);
           
        }

        {
            //float / float = float 
            float a = 8.5f;        // we can reuse the same variable name as it is not global :)
            float b = 1.8f;
            float div = a / b;    
            System.out.println(div);

        }
        {
            //double / double = double    
            double a = 8.5;        // we can reuse the same variable name as it is not global :)
            double b = 1.8;
            double div = a / b; 
            System.out.println(div);
            
        }
 /* 
        {
            //string / string = CTE
            String a = "Qspiders";        // we can reuse the same variable name as it is not global :)
            String b = " Deccan";
            String div = a / b;        
            System.out.println(div);

            //error: bad operand types for binary operator '/'

        }
            

       {
            //boolean + boolean = Compile time error 
            boolean a = true;        
            boolean b = false;
            boolean div = a / b;  
            System.out.println(div);
            // error: bad operand types for binary operator '/'
       

       }*/
    
}
}

