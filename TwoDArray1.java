//SPIRAL MATRIX

import java.util.*;
public class TwoDArray1 {
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

      while(rowStart <= rowEnd && coloumStart <= coloumEnd){
        for(int col=coloumStart; col <= coloumEnd; col++){
          System.out.print(numbers[rowStart][col] + " ");
        }
        rowStart++;
        for(int row=rowStart; row <= rowEnd; row++){
          System.out.print(numbers[row][coloumEnd] + " ");
        }
        coloumEnd--;
        if(rowStart <= rowEnd){
          for(int col=coloumEnd; col >= coloumStart; col--){
            System.out.print(numbers[rowEnd][col] + " ");
          }
        }                
        rowEnd--;
        if(coloumStart <= coloumEnd){
          for(int row=rowEnd; row >= rowStart; row--){
            System.out.print(numbers[row][coloumStart] + " ");
          }
        }        
        System.out.println();
        coloumStart++;
      }
      sc.close();

   }
}
