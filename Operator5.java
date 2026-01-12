// ARITHEMATIC OPERATORS 5) Modulus %

public class Operator5 {
    
    public static void main(String[] args){
        {
            // byte % byte = int
            byte a = 127;
            byte b = 2;
            int mod = a % b; 
            System.out.println(mod);
        }

        {
            //short % short = int 
            short a = 3333;        // we can reuse the same variable name as it is not global :)
            short b = 36;
            int mod = a % b;
            System.out.println(mod);
        }
        {
            //int %  int = int 
            int  a = 2574989;        // we can reuse the same variable name as it is not global :)
            int b = 3562;
            int mod = a % b;
            System.out.println(mod);
        }
        {
            //char % char = int 
            char a = 'd';        // ASCII value 100 ;
            char b = '1';        // ASCII value 49
            int mod = a % b;  //divides the ASCII value of a and b and prints its remainder respectively
            System.out.println(mod);
        }
        {
            //long % long = long 
            long a = 6597l;        // we can reuse the same variable name as it is not global :)
            long b = 22l;
            long mod = a % b; 
            System.out.println(mod);
        }
        {
            //float % float = float 
            float a = 8.0f;        // we can reuse the same variable name as it is not global :)
            float b = 1.5f;
            float mod = a % b;    
            System.out.println(mod);
        }
        {
             //double % double = double    
            double a = 8.5;        // we can reuse the same variable name as it is not global :)
            double b = 1.8;
            double mod = a % b; 
            System.out.println(mod);
        }
      /*   {
            //string % string = CTE
            String a = "Qspiders";        // we can reuse the same variable name as it is not global :)
            String b = " Deccan";
            String mod = a % b;        
            System.out.println(mod);

            //error: bad operand types for binary operator '%'

        }*/

          /*  
          {
            //boolean % boolean = Compile time error 
            boolean a = true;        
            boolean b = false;
            boolean mod = a % b;  
            System.out.println(mod);

            // error: bad operand types for binary operator '%'
       
            }*/ 
    }
}
