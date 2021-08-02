class Logic {
  public static void main(String[] args) {
      int Arr[] = {1,2,3,4,5,6};
      int Search = 30;
      boolean flag = false;
      for(int i=0;i<Arr.length;i++){
          if(Arr[i]==Search){
              System.out.println("Array Element Found " +i);  //  give index number
              flag = true;
              break;
          }
          
      }
      if(flag==false){
          System.out.println("Array Element Not Found");
      }
  }    
}
