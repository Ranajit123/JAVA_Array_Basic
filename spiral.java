public class spiral {
  public static void spiralMatrix(int matrix[][]){
    int startRow =0;
    int startColom= 0;
    int endColom = matrix[0].length-1;
    int endRow = matrix.length-1;
    while(startRow<=endRow && startColom<=endColom){
      // top
      for(int j=startColom;j<=endColom;j++){
        System.out.print(matrix[startRow][j]+" ");
      }
      startRow++;
      // Right
      for(int i=startRow;i<=endRow;i++){
        System.out.print(matrix[i][endColom]+" ");
      }
      endColom--;
      // bottom
      for(int j=endColom;j>=startColom;j--){
        System.out.print(matrix[endRow][j]+" ");
      }
      endRow--;
      // left
      for(int i=endRow;i>=startRow;i--){
        System.out.print(matrix[i][startColom]+ " ");
      }
      startColom++;
    }
  }
  public static void main (String args[]){
    int matrix[][]={{1, 2, 3, 10},
                    {4, 5, 6, 11},
                    {7, 8, 9, 12},
                    {13, 14, 15, 16}};
    spiralMatrix(matrix);
  }
  
}
