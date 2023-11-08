/* Given a array find the maximum and minimum element in it */
public class MaxAndMinWithOutShorting {
  public static void main(String[] args) {
    int arr[] = {1, 23, 2, 31, 34, 54, 6};
    int minNum = Integer.MAX_VALUE;
    int maxNum = Integer.MIN_VALUE;
    for(int i =0; i<arr.length; i++){
      int currValue = arr[i];
      // maxNum = Math.max(maxNum, currValue);
      // minNum = Math.min(minNum, currValue);
      if(currValue > maxNum){
        maxNum = currValue;
      }
      if(currValue<minNum){
        minNum = currValue;
      }
    }
    System.out.println("Maximum element "+ maxNum);
    System.out.println("Minimum element "+ minNum);
  }
}
