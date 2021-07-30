class Logic1 {
  public static void main(String[] args) {
      int Arr[] = {1,2,3,4,5,6,7};
      System.out.println("Even no : ");
      for(int i=0;i<Arr.length;i++){
          if(Arr[i]%2==0)
              System.out.println(Arr[i]);
      }
        System.out.println("Odd no : ");
          for(int i=0;i<Arr.length;i++){
          if(Arr[i]%2!=0)
              System.out.println(Arr[i]);
          }
  }    
}
