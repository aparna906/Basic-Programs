import java.util.Scanner;
class Logic4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        System.out.println("After Swapping : " +A +"  " +B);
        B = (A-B)-(A=B); 
        System.out.println("Before Swapping : " +A +"  " +B);
}
}

