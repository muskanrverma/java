public class Operator2 {

    public static void main(String[] args)
    {
        {
            // byte - byte = int
            byte a = 10;
            byte b = 1;
            int sub = a - b; 
            System.out.println(sub);
        }

        {
            //short - short = int 
            short a = 300;        // we can reuse the same variable name as it is not global :)
            short b = 500;
            int sub = a - b;
            System.out.println(sub);

        }

        {
            //int - int = int 
            int  a = 10000;        // we can reuse the same variable name as it is not global :)
            int b = 2000;
            int sub = a - b;
            System.out.println(sub);
        }
              {
            //char - char = int 
            char a = 'b';        // we can reuse the same variable name as it is not global :)
            char b = 'a';
            int sub = a - b;  //subtracts the ASCII value of a and b and prints its sum respectively
            System.out.println(sub);

        }

        {
            //long - long = long 
            long a = 50l;        // we can reuse the same variable name as it is not global :)
            long b = 30l;
            long sub = a - b;  
            System.out.println(sub);

        }

        {
            //float - float = float 
            float a = 5.5f;        // we can reuse the same variable name as it is not global :)
            float b = 1.1f;
            float sub = a - b;    
            System.out.println(sub);

        }
        {
            //double - double = double    
            double a = 8.5;        // we can reuse the same variable name as it is not global :)
            double b = 5.5;
            double sub = a - b;   
            System.out.println(sub);

        }

      //  {
            //string - string = String
          //  String a = "Qspiders";        // we can reuse the same variable name as it is not global :)
          //  String b = " Deccan";
          //  String sub = a - b;        
          //  System.out.println(sub);

          //error: bad operand types for binary operator '-'

       // }

       // {
            // boolean + bollean = Compile time error 
            // boolean a = true;        
            //boolean b = false;
            //boolean sum = a + b;  
            //System.out.println(sum);
            // error: bad operand types for binary operator '-'. 
       

       // }
    
}
}