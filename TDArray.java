import java.util.*;
public class TDArray {
  public static void maxInMatrix(int matrix[][]){
    int largest = Integer.MIN_VALUE;
    for(int i=0;i<matrix.length;i++){
      for(int j=0; j<matrix[0].length;j++){
        if(matrix[i][j]>largest){
          largest=matrix[i][j];
        }
      }
    }
    System.out.println("largest number is "+largest);
  }

  public static void minInMatrix(int matrix[][]){
    int smallest = Integer.MAX_VALUE;
    for(int i=0;i<matrix.length;i++){
      for(int j=0; j<matrix[0].length;j++){
        if(matrix[i][j]<smallest){
          smallest=matrix[i][j];
        }
      }
    }
    System.out.println("smallest number is "+smallest);
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int matrix[][]=new int[3][3];
    for(int i=0;i<matrix.length;i++){
      for(int j=0; j<matrix[0].length;j++){
        matrix[i][j]=sc.nextInt();
      }
    }
    System.out.println();

    for(int i=0;i<matrix.length;i++){
      for(int j=0; j<matrix[0].length;j++){
        System.out.print(matrix[i][j]+" ");
      }
      System.out.println();
    }
    maxInMatrix(matrix);
    minInMatrix(matrix);
    sc.close();
  }
  
}
