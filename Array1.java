// import java.util.*;

public class Array1{
  // Print array
  public static void printArray(int numbers[]){
    for(int i=0; i<numbers.length;i++){
      System.out.print(numbers[i]+" ");
    }
  }
  // Linear Search problem
  public static int linearSearch(int numbers[], int key){
    for(int i =0; i<numbers.length; i++){
      if(numbers[i] == key){
        return i;
      }
    }
    return -1;
  }

  // Largest value
  public static int getLargestValue(int numbers[]){
    int largest = Integer.MIN_VALUE;
    for(int i = 0; i<numbers.length; i++){
      if(numbers[i]>largest){
        largest = numbers[i];
      }
    }
    return largest;
  }

  // Binary Search Operation
  public static int binarySearch(int numbers[], int key){
    int start = 0, end = numbers.length -1;
    while(start<= end){
      int mid = (start + end)/2;
      if(numbers[mid] == key){
        return mid;
      }
      if(numbers[mid]>key){
        end = mid -1;
      }
      if(numbers[mid]<key){
        start = mid +1;
      }
    }
    return -1;
  }

  // Reverse an Array
  public static void reverse(int numbers[]){
    int start = 0 , end = numbers.length-1;
    while(start<end){
      // swap
      int temp = numbers[start];
      numbers[start]= numbers[end];
      numbers[end]= temp;

      start++;
      end--;      
    }
  }

  // Pairs in Array
  public static void pairsArray(int numbers[]){
    int totalPair = 0;
    for(int i=0; i<numbers.length; i++){
      int current = numbers[i];
      for(int j=i+1; j<numbers.length; j++){
        System.out.print("("+current+","+j+")"+" ");
        totalPair ++;
      }
      System.out.println();
    }
    System.out.println(totalPair);
  }

  // subArrays
  public static int printSubarrays(int numbers[]){
    int totalSubarray= 0;
    for(int i =0; i<numbers.length; i++){
      for(int j= i; j<numbers.length; j++){
        for(int k=i; k<=j;k++){
          System.out.print(numbers[k]+" ");
        }
        System.out.println();
        totalSubarray++;
      }
      System.out.println();
    }
    return totalSubarray;
  }

  // Max Subarray Sum using Brute force
  public static int maxSubarraySum(int numbers[]){
    int currentSum= 0;
    int maxSum= Integer.MIN_VALUE;
    for(int i=0; i<numbers.length; i++){
      for(int j=i; j<numbers.length; j++){
        currentSum=0;
        for(int k=i; k<=j; k++){
          currentSum += numbers[k];
        }
        // System.out.println(currentSum);
        if(currentSum>maxSum){
          maxSum=currentSum;
        }
      }
    }
    return maxSum;
  }

  // Max Subarray Sum using Prefix Array
  public static int prefixSubarraySum(int numbers[]){
    int currentSum= 0;
    int maxSum = Integer.MIN_VALUE;
    int prefixArray[] = new int[numbers.length];
    prefixArray[0]= numbers[0];
    for(int i =1; i<numbers.length; i++){
      prefixArray[i] =prefixArray[i-1] + numbers[i];
    }
    for(int i=0; i<numbers.length; i++){
      for(int j=i; j<numbers.length; j++){
        currentSum = i == 0? prefixArray[j]: prefixArray[j]- prefixArray[i-1];
        if(currentSum>maxSum){
          maxSum=currentSum;
        }
      }
    }
    return maxSum;
  }

  // Max Subarray Sum using KADANES algorithm
  public static void kadanesSubarray(int numbers[]){
    int cs= 0; //cs= current sum
    int ms = Integer.MIN_VALUE; //ms = max sum
    for(int i=0; i<numbers.length; i++){
      if(numbers[i]<0){
        cs+=numbers[i];
      }else{
        cs+=numbers[i];
        if(cs<0){
          cs=0;
        }
      }      
      ms= Math.max(cs, ms);
      
    }
    System.out.println("max sum is "+ms);
  }

  // Trapping water problem
  public static int trappingWater(int height[]){
    // calculate maxLeft boundary
    int n = height.length;
    int maxLeft[]= new int[n];
    maxLeft[0]=height[0];
    for(int i=1; i<n; i++ ){
      maxLeft[i]=Math.max(height[i], maxLeft[i-1]);
    }
    // calculate maxRight boundary
    int maxRight[]= new int[n];
    maxRight[n-1]=height[n-1];
    for(int i=n-2; i>=0; i--){
      maxRight[i]=Math.max(height[i], maxRight[i+1]);
    }
    int trappedWater = 0;
    for(int i=0; i<n; i++){
      // calculate waterlevel
      int waterLevel = Math.min(maxLeft[i], maxRight[i]);

      // calculate trapped water
      trappedWater += waterLevel - height[i];
    }
    return trappedWater;
    
  }

  // BUy & Sell Stock problem
  public static int buyAndSellStock(int prices[]){
    int maxprofit = 0;
    int buyPrice = Integer.MAX_VALUE;
    for(int i=0; i<prices.length; i++){
      if(prices[i]>buyPrice){
        int profit = prices[i]-buyPrice;
        maxprofit= Math.max(maxprofit, profit);
      }else{
        buyPrice=prices[i];
      }
    }
    return maxprofit;
  }

  // check any twice value present in array or not
  public static boolean checkTwice(int nums[]){
    for(int i=0; i<nums.length; i++){
      for(int j=i+1; j<nums.length; j++){
        if(nums[i]==nums[j]){
          return true; 
        }
      }
    }
    return false;
  }

  // find a target value in a array
  public static int findTarget(int nums[], int target){
    for(int i=0; i<nums.length; i++){
      // System.out.println(nums[i]);
      if(nums[i]==target){
        return i;
      }
    }
    return -1;
  }


  public static void main(String args[]){
    // int numbers[]= {-1, -2, -3, -4};
    // reverse(numbers);
    // printArray(numbers);
    // pairsArray(numbers);
    
    // System.out.println("max sum is  "+maxSubarraySum(numbers));
    // kadanesSubarray(numbers);
    // int height[]= {4, 2, 0, 6, 3, 2, 5};
    // System.out.println("Trapped water = "+trappingWater(height));
    int prices[]={7, 1, 5, 3, 6, 4};
    System.out.println("profit is "+ buyAndSellStock(prices));

    // int nums[]={1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
    // System.out.println(checkTwice(nums));

    // int nums[]={1};
    // int target=0;
    // System.out.println(findTarget(nums,target));

    
  }
}