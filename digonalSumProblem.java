public class digonalSumProblem{
  public static int digonalSum(int matrix[][]){
    int sum=0;
    for(int i=0; i<matrix.length; i++){
      // Primary Digonal
      sum += matrix[i][i];
      if(i!= matrix.length-1-i)
      // Secondary Digonal
        sum += matrix[i][matrix.length-1-i];
    }
    return sum;
  }
  public static void main(String args[]){
    int matrix[][]={{1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}};
    System.out.println(digonalSum(matrix));
    
  }
} 