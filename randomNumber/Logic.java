import java.util.Random;

class Logic {
   public static void main(String[] args) {
     Random Ra = new Random();
     int R1 = Ra.nextInt(100);
     //Double R1 = Ra.nextDouble(10); (If you Want Decimal Value)
     System.out.println(R1);

       //OR
        // System.out.println(Math.random());  (Only Decimal Value Given)
   }    
}
