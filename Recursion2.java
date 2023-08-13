public class Recursion2 {
  // Tower of Hanoi

  // public static void towerOfHanoi(int n, String Srs, String helper, String destination){
  //   if(n==1){
  //     System.out.println("Transfer Disk "+n+" from "+Srs +" To "+destination);
  //     return;
  //   }
  //   towerOfHanoi(n-1, Srs, destination, helper);
  //   System.out.println("Transfer Disk "+n+" from "+Srs+" To "+destination);
  //   towerOfHanoi(n-1, helper, Srs, destination); 
  // }

  // public static void main (String args[]){
  //   int n = 3;
  //   towerOfHanoi(n, "s", "h", "d");
  // }

  // Reverse a String 
  // public static void printRev(String str, int idx){
  //   if(idx == 0){
  //     System.out.println(str.charAt(idx));
  //     System.out.println((str.length())-(str.length()-1));
  //     return;
  //   }
  //   System.out.println(str.charAt(idx));
  //   printRev(str, idx-1);
    
    
  // }
  // public static void main(String args[]){
  //   String str = "abcd";
  //   printRev(str, str.length()-1);
  // }

  //****Occurance of a element in String */

    // public static int first = -1;
    // public static int last = -1;
    // public static void findOccurance(String str, int index, char element){
    //   if(index == str.length()-1){
    //     System.out.println(first);
    //     System.out.println(last);
    //     return;
    //   }
    //   char current= str.charAt(index);
    //   if(current == element){
    //     if(first == -1){
    //       first = index;
    //     }else{
    //       last = index;
    //     }
    //   }
    //   findOccurance(str, index+1, element);
    // }
    // public static void main (String args[]){
    //   String str = "abaacdaefaah";
    //   findOccurance(str, 0, 'a');
    // }  
}


