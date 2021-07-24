import java.util.Scanner;
class Logic1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int temp = A;
        System.out.println("After Swapping : " +A +"  " +B);
          A = B;
          B = temp;
          temp = A; 
          System.out.println("Before Swapping : " +A + "  " +B); 
    }
}
