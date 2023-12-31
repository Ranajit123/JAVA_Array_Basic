public class stair_case_sorting {
  public static boolean findKeySortedArray(int matrix[][], int key){
    int row = 0, col = matrix[0].length-1;
    while(row < matrix.length && col>=0) {
      if(matrix[row][col] == key){
        System.out.print("Key found at "+"("+row+","+col+")");
        return true; 
      }else if(matrix[row][col]>key){
        col--;
      }else{
        row++;
      }
    }

    return false;
  }
  public static void main(String args[]){
    int matrix[][] = {{1, 2, 3, 4},
                      {5, 6, 7, 8},
                      {9, 10, 11, 12},
                      {13, 14, 15, 16}};
    findKeySortedArray(matrix,2);
  }
}
