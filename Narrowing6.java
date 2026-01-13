// Narrowing for short

public class Narrowing6 {
    public static void main(String[] args)
    {
        {
            char c = (char)85;
            System.out.println("short to char " + c);
        }
        {
            byte b = (byte)111;
            System.out.println("short to byte " + b);
        }
    }
    
}
