// it is type of primitive typecasting 
//from bigger memory container  to smallest memory container
// need to use typecast operator i.e  we need to explicitly perform the typecasting 

class Narrowing1 {
    public static void main(String[] args)
    {
        {
            float f = (float)845.665982314;
            System.out.println("double to float " +f);
        }

        {
            long l = (long)845.665982314;
            System.out.println("double to long " +l);

        }

        {
            int i = (int)8561.22564;
            System.out.println("double to int " +i);
        }

        {
            short s = (short)452.22;
            System.out.println("long to short "+ s);

        }
        {
            byte b = (byte)120.560;
            System.out.println("long to byte " + b);
        }
    }
    
}
