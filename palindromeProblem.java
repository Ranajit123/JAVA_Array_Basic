public class palindromeProblem {
  public static boolean checkPalindromeString(String str){
    for(int i=0; i<str.length()/2; i++){
      if(str.charAt(i) != str.charAt(str.length()-1-i)){
        return false;
      }
    }
    return true;
  }
  public static void main(String args[]){
    String str=",; W;:GlG:;l ;,";
    System.out.println(checkPalindromeString(str));
    
  }
}
