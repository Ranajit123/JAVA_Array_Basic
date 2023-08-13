public class digonalSum {
  public static int digonalMatrisSum(int matrix[][]){
    int sum =0;
    int n= matrix.length-1;
    for(int i=0; i<matrix.length; i++){
      sum += matrix[i][i];
      if(i != (n-i))
        sum += matrix[i][n-i];

    }
    return sum;
  }
  public static void main(String[] args) {
    // int matrix[][] = {{1, 2, 3},
    //                   {4, 5, 6},
    //                   {7, 8, 9}};
    int matrix[][] = {{1, 2, 3, 4},
                     {5, 6, 7, 8},
                     {9, 10, 11, 12},
                     {13, 14, 15, 16}};
    System.out.println(digonalMatrisSum(matrix));
  }
}
