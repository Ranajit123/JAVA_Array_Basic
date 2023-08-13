public class powOfNumRecursion {

  // time complexity O(n)
  public static int power(int num, int exponent){
    if(exponent==0){
      return  1;
    }
    return num*power(num, exponent-1);
  }

  // time complexity O(logn)
  public static int optimizePower(int num, int exponent){
    if(exponent==0){
      return  1;
    }
    int halfPower = optimizePower(num, exponent/2);
    int halfPowerSquare= halfPower*halfPower;
    if(exponent %2 !=0){
      return num*halfPowerSquare;
    }
    return halfPowerSquare;
  }

  public static void main(String[] args) {
    // System.out.println(power(2, 0));
    System.out.println(optimizePower(2, 5));
  }
}
