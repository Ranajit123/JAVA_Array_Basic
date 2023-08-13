public class recursion3 {
  // print n to 1 numbers 
    public static void printDecreasing(int num){
      if(num ==1){
        System.out.print(num+" ");
        return;
      }
      System.out.print(num+ " ");
      printDecreasing(num-1);
    }

    // print numbers 1 to n
    public static void printIncreasing(int num){
      // process 1
      // if(num == 10){
      //   System.out.println(num+" ");
      //   return;
      // }
      // System.out.print(num+" ");
      // printIncreasing(num+1);

      // process 2
      if(num ==1){
        System.out.print(num+" ");
        return;
      }
      printIncreasing(num-1);
      System.out.print(num+ " ");      
    }

    // Sum of n numbers
    public static int calculateSum(int num){
      if(num ==1){
        return 1;
      }
      return num + calculateSum(num-1);
    }

    // print nth fibonacci number
    public static int fib(int n){
      if(n==0)
        return 0;
      if(n==1)
        return 1;
      return fib(n-1)+fib(n-2);
    }

    // print fibonacci number series
    static int prev = 0;
    static int prevM1 = 1;
    public static void fibSeries(int n){
      int curr;
      // System.out.print(prev+" "+prevM1+" ");
      if(n>=0){
        curr = prev+ prevM1;
        System.out.print(curr +" ");
        prev = prevM1;
        prevM1 = curr;
        fibSeries(n-1);
      } 
    }

    // check a array is sorted or not
    public static boolean isSorted(int arr[], int i){
      if(i==arr.length-1)
        return true;
      if(arr[i] > arr[i+1]){
        return false;
      }
      return isSorted(arr, i+1);
    }

    // first occurence of a element in the array
    public static int firstoccur(int arr[],int i, int key){
      if(i==arr.length){
        return -1;
      }
      if(arr[i] == key){
        return i;
      }      
      return firstoccur(arr, i+1, key);
    }
    // last occurence of a element in the array
    public static int lastoccur(int arr[], int i, int key){
      // approch-->1

      // if(i<0){
      //   return -1;
      // }
      // if(arr[i] == key){
      //   return i;
      // }
      // return lastoccur(arr, i-1, key);
      

      // approch-->2
      if(i == arr.length){
        return -1;
      }
      int isfound = lastoccur(arr, i+1, key);
      if(isfound == -1 && arr[i] == key){
        return i;
      }

      return isfound;

    }

    // calculate the power of any number
    public static int pow(int a, int n){
      // approch-->1 time complexity-->O(n)

      // if(n==0){
      //   return 1;
      // }
      // return a*pow(a, n-1);

      // approch-->2 time complexity-->O(logn)

      if(n==0){
        return 1;
      }
      int halfpower = pow(a, n/2); 
      int halfSqure = halfpower*halfpower ;
      if(n%2 != 0){
        return a*halfSqure;
      }
      return halfSqure;
    }

    // Tilling problem ****Amazon****
    public static int tillingProblem(int n){
      if(n==0|n==1){
        return 1;
      }
      /*
       * for 2*1 size tile and 2*n size floor
       * if vertically placed total way of placed is 2*f(n-1) 
       * if horizantally placed total way of placed is 2*f(n-2)
       * therefore total ways of placed is f(n-1)+f(n-2)
       */
      return tillingProblem(n-1)+tillingProblem(n-2);
    }

    // remove duplicate from the string ***Goggle, Microsoft***
    public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[]){
      if(idx == str.length()){
        System.out.println(newStr);
        return;
      }
      char currchar = str.charAt(idx);
      if(map[currchar-'a'] == true){
        removeDuplicate(str, idx+1, newStr, map);
      }else{
        map[currchar-'a']=true;
        removeDuplicate(str, idx+1, newStr.append(str.charAt(currchar)), map);
      }
    }

    // friend painng problem ***Goldman sachs***
    public static int friendPair(int n){
      if(n==1|n==2){
        return n;
      }
      return friendPair(n-1)+(n-1)*friendPair(n-2);
      // friendPair(n-1)--> single
      // (n-1)*friendPair(n-2)--> pair
    }

    // Print Binary String withOut Consecutive ones  ***Paytm
    public static void printBinaryString(int n, int lastplace, String str){
      if(n ==0 ){
        System.out.println(str);
        return;
      }
      printBinaryString(n-1, 0, str+"0");
      if(lastplace == 0){
        printBinaryString(n-1, 1, str+"1");
      }
    }
    
    /*search target value in the rotated sorted array */
    public static int search(int arr[], int target, int si, int ei){
      if(si>ei){
        return -1;
      }
      int mid = si -(si-ei)/2;
      if(arr[mid] == target){
        return mid;
      }
      // mid in the line 1
      if(arr[si] <= arr[mid]){
        if(arr[si]<=target && target<=arr[mid]){
          return search(arr, target, si, mid -1);
        }else{
          return search(arr, target, mid+1, ei);
        }
      } 
      // mid in line 2
      else{
        if(arr[ei] >=target && arr[mid] >= target){
          return search(arr, target, mid+1, ei);
        }else{
          return search(arr, target, si, mid-1);
        }
      }

      
    }

    public static void main(String[] args) {
      // printDecreasing(10);
      // printIncreasing(10);
      // System.out.println(calculateSum(5));
      // System.out.println(fib(2));
      // System.out.print(prev+" "+prevM1+" ");
      // fibSeries(5-2); // 5-2 because the 1st 2 number is printed using upper statement
      // int arr[]= {1, 20, 3, 4, 5};
      // System.out.println(isSorted(arr, 0));
      // System.out.println(firstoccur(arr, 0, 5));
      // System.out.println(lastoccur(arr, 0, 20));
      // System.out.print(pow(5, 5));
      // System.out.println(tillingProblem(5));
      // String str = "ranajit";
      // removeDuplicate(str, 0, new StringBuilder(""), new boolean[32]);
      // System.out.println(friendPair(3));
      // printBinaryString(3, 0, "");

      int arr[] = {4, 5,6, 7, 0, 1, 2};
      System.out.println(search(arr, 0,0, arr.length-1));
    }
  
}
