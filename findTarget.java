import java.util.*;
public class findTarget{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    int size= sc.nextInt();
    System.out.println("Enter the value of array: ");
    int nums[]= new int[size];
    for(int i=0 ; i<nums.length; i++){
      nums[i]= sc.nextInt();
    }
    int target= 9;
    for(int i=0; i<nums.length; i++){
      for(int j=1; j<nums.length; j++){
        int sum = nums[i]+ nums[j];
        //System.out.println(sum);
        if(sum == target){
          System.out.print("["+i+","+j+"]");
        }
      }
    }
    sc.close();
  }
}