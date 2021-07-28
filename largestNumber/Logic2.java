class Logic2 {
public static void main(String[] args) {
    int a = 1010;
    int b = 900;
    int c = 100;
   // int large = a>b?a:b;
   // int large2 = c>large?c:large;
 
    //OR

    int large = c>(a>b?a:b)?c:(a>b?a:b);

    System.out.println("Largest Number is : " +large);
}    
}
