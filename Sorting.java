public class Sorting {
  public static void printArry(int arr[]){
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
  public static void main(String args[]){
    int arr[]={8,7,3,1,2};

    // 1.bubble sort 
    // for(int i = 0; i<arr.length-1; i++){
    //   for(int j = 0; j<arr.length-1-i; j++){
    //     if(arr[j]>arr[j+1]){
    //       //swap
    //       int temp = arr[j];
    //       arr[j]=arr[j+1];
    //       arr[j+1]=temp;
    //     }
    //   }
    // }

    //2.Selection sort
    // for(int i=0; i<arr.length-1; i++){
    //   int smallest = i;
    //   for(int j= i+1; j<arr.length; j++){
    //     if(arr[smallest]>arr[j]){
    //       smallest=j;
    //     }
    //   }
    //   //swap
    //   int temp = arr[smallest];
    //   arr[smallest]=arr[i];
    //   arr[i]= temp;
    // }

    //3.insertion sort
    for(int i=0; i<arr.length-1; i++){
      int current = arr[i];
      int j = i-1;
      while(j>=0 && current<arr[j]){
        arr[j+1]=arr[j];
        j--;
      }
      arr[j+1]=current;
    }
    printArry(arr);
  }
}
