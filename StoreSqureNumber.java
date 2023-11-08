/* Given an integer N, generate & print an array containing squares of all number from 1 to N */
public class StoreSqureNumber {

  public static void main(String[] args) {
    int n =5; 
    int arr[] = new int[n];
    for(int i=0; i<n; i++){
      arr[i] = (i+1)*(i+1);
    }

    for(int i=0; i<n; i++){
      System.out.print(arr[i]+" ");
    }
  }
}