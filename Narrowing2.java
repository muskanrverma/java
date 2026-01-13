// program for narrowing from float to all other smaller containers than float 

class Narrowing2 {
    public static void main(String[] args)
    {
        {
            long l = (long)452.22f;
            System.out.println("float to long " +l);
        }
        {
            int i = (int)52.63f;
            System.out.println("float to int " + i);

        }
        {
            short s = (short) 652.55f;
            System.out.println("float to short " + s);

        }
        {
            char c = (char)55.84f;
            System.out.println("float to char " + c);

        }
        {
            byte b = (byte)122.8956f;
            System.out.println("float to byte" + b);
        }
    }
    
}
