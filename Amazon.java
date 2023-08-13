public class Amazon {
  /* Tiling Pronblem
   * 
   * Given "2*n" board or floor and tiles of size "2*1", count the number of ways to tile the given board using the 2*1 tiles.
   * (A tile can either be placed horizontally or vertically.)
   */

   public static int tilingProblem(int n){
    if(n==0||n==1){
      return 1;
    }
    
    // for vertically ways --> tilingProblem(n-1)
    // for horizontally ways --> tilingProblem(n-2)

    return tilingProblem(n-1)+tilingProblem(n-2);
   }
   public static void main(String[] args) {
    System.out.println(tilingProblem(4));
   }
}
