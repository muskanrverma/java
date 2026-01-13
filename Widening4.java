// widening is type of primitive typecasting 
//for long

class Widening4 {
    public static void main(String[] args){
        {
            long l = 5021l;
            float f = l;
            System.out.println("long " + l);
            System.out.println("to float " + f);

        }

        {
            long l = 54216l;
            double d = l;
            System.out.println("long " + l);
            System.out.println("to float " + d);
        }
    }
    
}
