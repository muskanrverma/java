// widening is type of primitive typecasting 
//for byte  

class Widening1{
    public static void main(String[]args){
        {
            byte b1 = 100;
            short s1 = b1;        //widening typecasting
            System.out.println("byte: "+b1);
            System.out.println("to short: "+ s1);
        }

        {
            byte b1 = 120;
            int i1 = b1;
            System.out.println("byte: "+b1);
            System.out.println("to int "+ i1);
            
        }
      /*  {
            byte b1 = 100;
            char c1 = b1;               //error: incompatible types: possible lossy conversion from byte to charr
            System.out.println(b1);
            
        }*/ 
       
        {
            byte b1 = 126;
            long l1 = b1;
            System.out.println("byte: "+b1);
            System.out.println("to long: "+ l1);
        }

        {
            byte b1 = 127;
            float f1 = b1;
            System.out.println("byte: "+ b1);
            System.out.println("to float: "+ f1);
            
        }  

        {
            byte b1 = 122;
            double d1 = b1;
            System.out.println("byte: "+ b1);
            System.out.println("to double: "+ d1);
            
        }


            }
}