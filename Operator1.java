// Arithematic Operators ,addition:
//

class Operator1{
    public static void main(String[] args){
        {   // byte + byte = int
            byte a = 5;
            byte b = 10;
            int sum = a + b; 
            System.out.println(sum);

        }

        {
            //short + short = int 
            short a = 300;        // we can reuse the same variable name as it is not global :)
            short b = 500;
            int sum = a + b;
            System.out.println(sum);

        }

        {
            //int + int = int 
            int  a = 1000;        // we can reuse the same variable name as it is not global :)
            int b = 2000;
            int sum = a + b;
            System.out.println(sum);

        }

        {
            //char + char = int 
            char a = 'a';        // we can reuse the same variable name as it is not global :)
            char b = 'b';
            int sum = a + b;  // adds the ASCII value of a and b and prints its sum respectively
            System.out.println(sum);

        }

        {
            //long + long = long ( greatest + greatest = greatest )
            long a = 50l;        // we can reuse the same variable name as it is not global :)
            long b = 30l;
            long sum = a + b;  
            System.out.println(sum);

        }

        {
            //float + float = float 
            float a = 1.1f;        // we can reuse the same variable name as it is not global :)
            float b = 2.2f;
            float sum = a + b;    // mostly used when precision is not the concern eg - CGPA   
            System.out.println(sum);

        }
        {
            //double + double = double    ( greatest + greatest = greatest )
            double a = 1.1;        // we can reuse the same variable name as it is not global :)
            double b = 2.2;
            double sum = a + b;   // mostly used when precision is THE  concern eg - value of Pi 
            System.out.println(sum);

        }

        {
            //string + string = String
            String a = "Qspiders";        // we can reuse the same variable name as it is not global :)
            String b = " Deccan";
            String sum = a + b;         // this is called cancatenation i.e addition or joining of two string data type oof data.
            System.out.println(sum);

        }

       // {
            // boolean + bollean = Compile time error 
            // boolean a = true;        
            //boolean b = false;
            //boolean sum = a + b;  
            //System.out.println(sum);
            // error: bad operand types for binary operator '+'. 
       

       // }

        

       
    }
}