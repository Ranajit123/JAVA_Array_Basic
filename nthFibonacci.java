public class nthFibonacci {
  public static int fibNum(int n){
    if(n==0|n==1){
      return n;
    }
    return fibNum(n-1) + fibNum(n-2);

    // int current=0, prev1=0, prev2=1;
    // for(int i=2; i<=n;i++){
    //   current = prev1 + prev2;
    //   prev1=prev2;
    //   prev2=current;
    // }
    // return current;
  }
  public static void main(String[] args) {
    System.out.print(fibNum(10));
  }
}
