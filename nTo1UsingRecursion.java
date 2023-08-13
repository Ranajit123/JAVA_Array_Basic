public class nTo1UsingRecursion {
  public static int printNumberDecreasing(int n){
    if(n==1){
      System.out.print("1");
      return 1;
    }
    
    System.out.print(n+" "); 
    return printNumberDecreasing(n-1);
  }
  public static void main(String args[]) {
    printNumberDecreasing(5);
  }
}
