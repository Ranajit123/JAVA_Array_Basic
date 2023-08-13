public class factorialRecursion {
  public static int facNum(int n){
    if(n==1||n==0){
      return 1;
    }
    return n*facNum(n-1);
  }
  public static void main(String[] args) {
    System.out.print(facNum(5));
  }
}
