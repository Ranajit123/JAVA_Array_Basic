// import java.util.Map;

public class Google {
  public static void removeDulplicate(String str, StringBuilder newstr, int idx, boolean map[]){
    if(idx == str.length()){
      System.out.println(newstr);
      return;
    }

    char currchar = str.charAt(idx);
    if(map[currchar-'a'] == true){
      // diplicate
      removeDulplicate(str, newstr, idx+1, map);
    }else{
      map[currchar-'a']=true;
      removeDulplicate(str, newstr.append(currchar), idx+1, map);
    }
  }

  // count the number of set bit in a binary string
  public static int countSetBit(int num){
    int count =0;
    while (num > 0){
      int bitMask =1;
      if((num & bitMask)==1){
        count ++;
      }
      num = num >> 1;
    }
    return count;
  }
  public static void main(String[] args) {
    String str="ranajit";
    removeDulplicate(str, new StringBuilder(""), 0, new boolean[32] );
    // System.out.println(countSetBit(15));
  }
}
