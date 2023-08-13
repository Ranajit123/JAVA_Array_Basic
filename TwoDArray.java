import java.util.*;
public class TwoDArray{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the row no. : ");
    int row= sc.nextInt();
    System.out.print("Enter the coloums no. :");
    int coloums = sc.nextInt();
    int numbers[][] = new int[row][coloums];
    for(int i=0; i<row; i++){
      for(int j=0; j<coloums; j++){
        numbers[i][j] = sc.nextInt();
      }
    }
    
    for(int i =0; i<row; i++){
      for(int j=0; j<coloums; j++){
        System.out.print(numbers[i][j] + " ");
      }
      System.out.println();
    }
    // System.out.print("Enter the target: ");
    // int target = sc.nextInt();
    // for(int i=0; i<row; i++){
    //   for(int j=0; j<coloums; j++){
    //     if(numbers[i][j]==target){
    //       System.out.print("Target value found in index: " + "["+ i + "," + j + "]");
    //     }
    //   }
    // }
    sc.close();
  }
}