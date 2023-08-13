public class searchInSortedArray {
  public static boolean searchInArray(int matrix[][], int key){
    int row =matrix.length-1,  col = 0;
    while(row >= 0 && col < matrix[0].length){
      if(matrix[row][col]==key){
        System.out.println("Kay found at "+row+" "+col);
        return true;
      }
      else if(key < matrix[row][col]){
        row--;
      }
      else{
        col++;
      }
      
    }
    return false;
  }
  public static void main(String args[]){
    int matrix[][]={{1, 2, 3},{4, 5, 6},{7, 8, 9}};
    int key = 2;
    searchInArray(matrix, key);
  }
}
