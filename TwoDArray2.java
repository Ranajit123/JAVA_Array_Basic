// TRANSPOSE MATRIX OF A GIVEN MATRIX

import java.util.*;
public class TwoDArray2 {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enetr numbers of Rows: ");
      int n = sc.nextInt();
      System.out.print("Enter the numbers of Coloums: ");
      int m= sc.nextInt();
      int[][] numbers = new int[n][m];
      for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
          numbers[i][j] = sc.nextInt();
        }
      }

      int rowStart = 0;
      int rowEnd = n-1;
      int coloumStart = 0;
      int coloumEnd = m-1;

      System.out.println("Transpose of the given matrix: ");

      // for(int row=0; row<m; row++){
      //   for(int col=0; col<n; col++){
      //     System.out.print(numbers[col][row] + " ");
      //   }
      //   System.out.println();
      // }
      while(rowStart <= rowEnd && coloumStart <= coloumEnd){
        for(int row=rowStart; row<=coloumEnd; row++ ){
        System.out.print(numbers[row][coloumStart] + " ");
        
      }
      System.out.println();
      coloumStart++;
      }
      sc.close();

   }
}   