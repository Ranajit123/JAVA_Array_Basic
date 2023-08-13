public class GoldmanSachs {
  /*Friends Pairing Problem
   * Given n friends, each one can remain single or can be paired up with some other friends. Each friend can be paired only one once. Find out the total number of ways in which friends can remain single or can be paired up.
   */
  public static int friendsPairingProblem(int n){
    if(n==1|| n==2){
      return n;
    } 
    // For single --> f(n-1) ways.
    // For pair --> (n-1)*f(n-2) ways.
    // Because if we take a pair there are remain (n-2) friends and we can take a pair in (n-1) ways because there have n numbers of friend.
    return friendsPairingProblem(n-1) + ((n-1)*friendsPairingProblem(n-2));
  }
  public static void main(String[] args) {
    System.out.println(friendsPairingProblem(3));
  }
}
