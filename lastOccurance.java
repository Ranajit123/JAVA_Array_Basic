public class lastOccurance {
  public static int lastOccur(int arr[], int key, int i){
    if(i<0){
      return -1;
    }
    if(arr[i]==key){
      return i;
    }
    return lastOccur(arr, key, i-1);
  }
  public static void main(String[] args) {
    int arr[]={1, 2, 3, 4, 5};
    System.out.println(lastOccur(arr, 2, arr.length-1));
  }
}
