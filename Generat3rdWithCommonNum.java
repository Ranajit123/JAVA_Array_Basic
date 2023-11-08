/* Read two arrays from the user and generate third array containing all the common elements from the first two */

import java.util.*;
public class Generat3rdWithCommonNum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr1[] = new int[n];
    for(int i=0; i<n; i++){
      arr1[i]=sc.nextInt();
    }

    int m = sc.nextInt();
    int arr2[] = new int[m];
    for(int i=0; i<m; i++){
      arr2[i] = sc.nextInt();
    }
    sc.close();

    int genArr[] = new int[Math.min(n, m)];
    int idx_Arr2 = 0;
    int idx_genArr = 0;

    while(idx_Arr2<m){
      for(int num:arr1){
        if(num == arr2[idx_Arr2]){
          genArr[idx_genArr] = num;
          idx_genArr++;
          break;
        }
      }
      idx_Arr2++;
    }

    for(int i=0; i<genArr.length; i++){
      if(genArr[0] == 0){
        System.out.println("common value is not found");
        break;
      }
      if(genArr[i] != 0)
        System.out.print(genArr[i]+" ");
      
    }
  }
}
