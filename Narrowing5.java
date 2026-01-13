
// narrowing for char
public class Narrowing5 {
    public static void main(String[] args){
        {
            short s = (short)'d';
            System.out.println("char to short " +s);
        }
        {
            byte b = (byte)'g';
            System.out.println("char to byte " +b);
        }
    }
    
}
