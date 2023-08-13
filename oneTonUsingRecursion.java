public class oneTonUsingRecursion {
  public static void increasingOrderNumPrint(int n){
    if(n==1){
      System.out.print("1 ");
      return;
    }
    increasingOrderNumPrint(n-1);
    System.out.print(n +" ");

  }
  public static void main(String[] args) {
    
    increasingOrderNumPrint(5);
  }
}
