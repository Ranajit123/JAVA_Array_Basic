public class searchNumInArray {
  public static int searchNum(int matrix[][], int key){
    int count =0;
    for(int i=0; i<matrix.length; i++){
      for(int j=0; j<matrix[0].length; j++){
        if(key==matrix[i][j]){
          count++;
        }
      }
    }
    return count;
  }

  public static int sumArray(int matrix[][]){
    int sum =0;
    int row=1;
    for(int i=0; i<matrix[0].length; i++){
      sum +=matrix[row][i];
    }
    return sum;
  }

  public static void printMatrix(int matrix[][]){
    for(int i=0; i<matrix.length; i++){
      for(int j=0; j<matrix[0].length; j++){
        System.out.print(matrix[i][j]+" ");
      }
      System.out.println();
    }
  }

  public static void transposeMatrix(int matrix[][]){
    int row=matrix.length, col=matrix[0].length;
    int transpose[][]= new int[col][row];
    for(int i=0; i<row;i++){
      for(int j=0; j<col; j++){
        transpose[j][i]=matrix[i][j];
      }
    }
    printMatrix(transpose);
    
  }
  public static void main(String args[]){
    int matrix[][]={{1, 2, 3},{4, 5, 6},{7, 8, 9}};
    printMatrix(matrix);
    System.out.println();
    transposeMatrix(matrix);
  }
}

  

