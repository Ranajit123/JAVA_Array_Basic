public class checkPowerof3 {
  public static void main(String[] args) {
    int n=117;
    while(n>=3){
      if(n%3==0){
        n=n/3;
      }
      System.out.println(n);
      if(n%3!=0){
        break;
      }
    }
    if(n==1){
      System.out.println("power of three");
    }else{
      System.out.println("not power of three");
    }
  }
  
}
