public class Shortpath {
  public static float findShortestPath(String str){
    int x=0, y=0;
    for(int i=0; i<str.length(); i++){
      char dir = str.charAt(i);
      // South
      if(dir=='S'){
        y++;
      }
      // East
      else if(dir=='E'){
        x++;
      }
      // North
      else if(dir=='N'){
        y--;
      }
      // West
      else{
        x--;
      }

    }
    int X2 = x*x;
    int Y2 = y*y;
    return (float)Math.sqrt(X2+Y2);
  }
  public static void main(String[] args) {
    String str="WE";
    System.out.println(findShortestPath(str));
  }
  
}
