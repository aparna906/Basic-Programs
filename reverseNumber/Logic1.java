import java.util.Scanner;
class Logic1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();

        // Using Algorithm
        int Reverse = 0;
        while(Number!=0){
         Reverse = Reverse*10 + Number%10;
         Number = Number/10;
        }

        System.out.println(Reverse);
        sc.close();
    }
}
