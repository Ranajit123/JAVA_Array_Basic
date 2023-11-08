public class ReverseArr {
  public static void main(String[] args) {
    // With extra space
    int arr[] = {1, 2, 3, 4, 5};
    int revArr[] = new int[arr.length];
    for(int i=0; i<revArr.length; i++){
      revArr[i] = arr[arr.length-1-i];
    }

    System.out.println("With extra space Reverse Array");
    for(int i=0; i<revArr.length; i++){
      System.out.print(revArr[i]+" ");
    }

    System.out.println("\nWithout extra space Reverse Array");
    // with out extra space
    for(int i=0; i<arr.length/2; i++){
      int temp = arr[i];
      arr[i] = arr[arr.length-1-i];
      arr[arr.length-1-i] = temp;
    }

    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i]+" ");
    }
  }
}
