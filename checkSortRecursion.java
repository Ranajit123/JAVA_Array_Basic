public class checkSortRecursion {
  public static boolean checkSortArray(int arr[], int i){
    if(i==arr.length-1){
      return true;
    }
    if(arr[i]>arr[i+1]){
      return false;
    }
    return checkSortArray(arr, i+1);
    
  }
  public static void main(String[] args) {
    int arr[]={1};
    System.out.println(checkSortArray(arr, 0));
  }
}
