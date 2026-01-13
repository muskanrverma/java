
// widening is type of primitive typecasting 
//for int 

public class Widening3 {
    public static void main(String[]args)
    {

        {
            int i = 456;
            long l1 = i;
            System.out.println("int "+i);
            System.out.println("to long " +l1);
        }

        {
            int i = 422;
            float f1 = i;
            System.out.println("int " + i);
            System.out.println("to float " +f1);
            
        }
        {
            int i = 888;
            double d1 = i;
            System.out.println("int " +i);
            System.out.println("to float " + d1);

        }
    }
}
