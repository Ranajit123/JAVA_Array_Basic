public class Recursion1 {
  //**** print 1 to n number ****
  // public static void printNumber(int n){
  //   if(n==6){
  //     return;
  //   }
  //   System.out.println(n);
  //   printNumber(n+1);;
  // }
  // public static void main(String args[]){
  //   int n=1;
  //   printNumber(n);

  // }

  //**** print n to 1 number ****
  // public static void printNumber(int n){
  //   if(n==0){
  //     return;
  //   }
  //   System.out.println(n);
  //   printNumber(n-1);
  // }
  // public static void main(String ags[]){
  //   int n=5;
  //   printNumber(n);
  // }

  //**** sum of n number ****
  // public static void printSum(int n , int i, int sum){
  //   if(i==n){
  //     sum+=i;
  //     System.out.println(sum);
  //     return;
  //   }
  //   sum+=i;
  //   printSum(n, i+1, sum);
  // }
  // public static void main(String args[]){
  //   printSum(5, 0, 0);
  // }

  //**** factorial of n number(approch -->1 ) ****
  // public static void printfac(int i, int n, int product){
  //   if(i==0){
  //     System.out.println(product);
  //     return;
  //   }
  //   product*=i;
  //   printfac(i-1, 3, product);    
  // }
  // public static void main(String args[]){
  //   printfac(3, 3, 1);
  // }

  //**** factorial of n number(approch -->2 ) ****
  // public static int calfactorial(int n){
  //   if(n==1|| n==0){
  //     return 1;
  //   }
  //   int fact_nm1=calfactorial(n-1);
  //   int fact_n= n*fact_nm1;
  //   return fact_n;
  // }
  // public static void main (String args[]){
  //   System.out.println(calfactorial(3));
  // }

    //**** Factorial of a number approch-->3 ****
  // public static int calfactorial(int n){
  //   if(n==0||n==1){
  //     return 1;
  //   }
  //   return n*calfactorial(n-1);    
  // }
  // public static void main(String args[]){
  //   System.out.println(calfactorial(5));
  // }

  //**** print fibonacci series ****
  // public static void printFib(int a, int b, int n){
  //   if(n==0){
  //     return;
  //   }
  //   int c= a+b;
  //   System.out.println(c);
  //   printFib(a=b, b=c, n-1);   
  // }
  // public static void main (String args[]){
  //   int a=0,b=1,n=7;
  //   System.out.println(a);
  //   System.out.println(b);
  //   printFib(a, b, n-2);

  // }

  //**** power of x^n(stackHigth is n) ****/
  // public static int calPower(int x, int n){
  //   if(n==0) return 1;
  //   if(x==0) return 0;
  //   int xPow_nm1=calPower(x, n-1);
  //   int xPow=x*xPow_nm1;
  //   return xPow;
  // }
  // public static void main(String args[]){
  //   System.out.println(calPower(2, 5));
  // }

  //**** power of x^n(stackHigth is logn) ****/
  public static int calPower(int x, int n){
    if(n==0) return 1;
    if(x==0) return 0;
    if(n%2==0)// for n is even
    {
      return calPower(x, n/2)*calPower(x, n/2);
    }
    else// for n is odd
    {
      return calPower(x, n/2)*calPower(x, n/2)*x;
    }
  }
  public static void main(String args[]){
    System.out.println(calPower(2, 5));
  }


}
