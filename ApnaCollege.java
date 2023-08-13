public class ApnaCollege {
  // Recursion 

  /*Problem-1
   * For a given integer array of size N.You have to find all the occurrences(indices) of a given element (Key) and print them. Use are cursive function to solve this problem.
   */

   public static void occurKey(int arr[], int i, int key){
    if(i==arr.length){
      return ;
    }
    if(arr[i]==key){
      System.out.println(i+" ");;
    }
    occurKey(arr, i+1, key);
   }
   public static void main(String[] args) {
    int arr[]={2};
    occurKey(arr, 0, 2);
   }
}
