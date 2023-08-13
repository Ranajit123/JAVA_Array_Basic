public class countingSort {
  public static void cSorting(int arr[]){
    // finding the new arr size value
    int largest = Integer.MIN_VALUE;
    for(int i=0; i<arr.length; i++){
      largest = Math.max(largest, arr[i]);
    }

    // Createing new arr
    int count[] = new int[largest+1]; // +1 becuase 0 also consider
    for(int i=0; i<arr.length; i++){
      count[arr[i]]++;
    }

    // sorting
    int j=0; 
    for(int i=0; i<count.length; i++){
      while(count[i]>0){
        arr[j]=i;
        j++;
        count[i]--;
      }
    }
  }

  public static void printArray(int arr[]){
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i]+" ");
    }
  }
  public static void main(String args[]){
    int arr[]= {1, 3, 1, 4, 2, 4, 3, 7};
    cSorting(arr);
    printArray(arr);
  }
}
