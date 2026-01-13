// narrowing for long 
class Narrowing3 {
    public static void main(String[] args)
    {
        {
            int i = (int)8564l;
            System.out.println("long to int " +i);
        }
        {
            short s = (short)5426l;
            System.out.println("long to short " + s);
        }
        {
            byte b = (byte)54l;
            System.out.println("long to byte " + b);
        }
        {
            char c = (char)99l;
            System.out.println("long to char "+ c);
        }
    }
    
}
