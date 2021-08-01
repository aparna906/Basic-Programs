import java.util.HashSet;

class Logic2 {
  public static void main(String[] args) {
      String arr[] = {"abc","bca","cab"};

      HashSet<String>value = new HashSet<>();
      boolean flag = false;
      
      for(String res:arr){
          if(value.add(res)==false){
              System.out.println("Duplicate String : " +res);
              flag = true;
          }
      }

      if(flag==false){
          System.out.println("Not Found Duplicate");
      }
  }    
}
