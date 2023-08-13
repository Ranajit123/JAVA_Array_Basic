public class binaryToDecimal {
  public static int binToDeci(int binNum){
    int pow=0;
    int deci=0;
    while(binNum>0){
      int lastDigit = binNum%10;
      deci = deci +(lastDigit * (int)Math. pow(2,pow));
      pow ++;
      binNum = (binNum/10);
    }
    return deci;
  }
  public static void main(String args[]){
    System.out.println(binToDeci(101));
  }
  
}
