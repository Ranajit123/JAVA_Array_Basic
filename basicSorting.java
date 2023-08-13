public class basicSorting {
  // bubble sort
  public static void bubbleSort(int nums[]){
    for(int i =0; i<nums.length-1; i++){
      for(int j=0; j<nums.length-1-i; j++){
        if(nums[j]>nums[j+1]){
          int temp = nums[j];
          nums[j] = nums[j+1];
          nums[j+1] = temp;
        }
      }
    }
  }

  // check a array is sorted or not
  public static void checkSortArray(int nums[]){
    int swap=0;
    for(int i=0; i<nums.length-1;i++){     
      if(nums[i]>nums[i+1]){
        int temp = nums[i];
        nums[i]= nums[i+1];
        nums[i+1]= temp;
        swap++;
      }     
    }
    if(swap==0){
      System.out.println("sorted array");
    }else{
      System.out.println("unsorted array");
    }
  }

  // selection Sort
  public static void selectionSort(int nums[]){
    for(int i=0; i<nums.length; i++){
      int minpos=i;
      for(int j=i+1; j<nums.length; j++){
        if(nums[minpos]>nums[j]){
          minpos=j;
        }
      }
      // swap
      int temp = nums[minpos];
      nums[minpos]=nums[i];
      nums[i]= temp;
    }
  }

  // insertion Sorting
  public static void insertionSorting(int nums[]){
    for(int i=1; i<=nums.length-1; i++){
      int curr=nums[i]; 
      int prev = i-1;
      // finding the currect pos
      while(prev >=0 && nums[prev]>curr) {
        nums[prev+1]=nums[prev];
        prev--;
      }
      // insertion
      nums[prev+1]=curr;
    }
  }

  // print a array
  public static void printArr(int nums[]){
    for(int i =0; i<nums.length; i++){
      System.out.print(nums[i]+ " ");
    }
  }
  public static void main (String args[]){
    int nums[] = {5, 4, 1};
    // selectionSort(nums);
    // printArr(nums);
    insertionSorting(nums);
    printArr(nums);
    

  }
  
}
