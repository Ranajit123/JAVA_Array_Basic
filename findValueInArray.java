import java.util.*;
public class findValueInArray{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    int nums[] =new int[size];
    System.out.println("Enter the value of nums: ");
    for(int i=0; i<size; i++){
      nums[i]=sc.nextInt();
    }
    System.out.print("Enter the target value: ");
    int x=sc.nextInt();
    System.out.print("The taget value find in Index No. ");
    for(int i=0; i<nums.length; i++){
      if(nums[i]==x){
        System.out.print(i + " ");
      }
    }
    sc.close();
  }
}