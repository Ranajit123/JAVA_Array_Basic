public class bitManipulation {
  public static int getIthBit(int n, int i){
    int bitMask = 1<<i;
    if((n&bitMask)==0){
      return 0;
    }else{
      return 1;
    }
  }
  public static int setIthBit(int n, int i){
    int bitMask= 1<<i;
    return n|bitMask;
  }
  public static int clearIthBit(int n, int i){
    int bitMask= ~(1<<i);
    return n&bitMask;
  }
  public static int clearIthList(int n, int i){
    int bitMask=~0<<i;
    return n&bitMask;
  }

  public static int clearRangeBit(int n, int i, int j){
    int bitMask=(~0<<(j+1))|(1<<i)-1;
    return n&bitMask;
  }

  public static boolean checkPowerOf2(int n){   
    return (n&(n-1))==0;
  }

  // calculate fast exponentiation
  public static int fastExpo(int a, int n){
    int ans = 1; 
    while(n>0){
      if((n&1) !=0){
        ans = ans*a;
      }
      a= a*a;
      n= n>>1;
    }
    return ans;
  }

  // swapping of numbers without using 3rd variable
  public static void swapNumber(int num1, int num2){
    num1 = num1^num2;
    num2 = num1^num2;
    num1 = num1^num2;
    System.out.print("num1 is "+num1+"\nnum2 is "+num2);
  }

  // add 1 to any number using bitmanipulation
  public static void add1(int num){
    System.out.println("The number agfter adding 1 is "+-~num);
  }

  // convert upper case to lower case 
  public static void convertLatter(){
    for( char ch = 'A'; ch<='Z';ch++){
      System.out.print((char)(ch | ' ')+" ");
    }
  }
  public static void main(String[] args) {
    // System.out.println(getIthBit(10, 3));
    // System.out.println(setIthBit(10, 2));
    // System.out.println(clearIthBit(10, 1));
    // System.out.println(clearIthList(10, 2));
    // System.out.println(clearRangeBit(35, 2, 5));
    // System.out.println(checkPowerOf2(16));
    // System.out.println(fastExpo(2, 3));
    // int x=5;
    // System.out.println(x^x);
    // swapNumber(5, 2);
    // add1(10);
    convertLatter();
    
  }
}
