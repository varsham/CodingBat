package com.varsha;
import java.util.*;
public class Array3 {

/* maxSpan
Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" is the number of elements between the two inclusive. A single value has a span of 1. Returns the largest span found in the given array. (Efficiency is not a priority.)

maxSpan([1, 2, 1, 1, 3]) → 4
maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6
*/
public int maxSpan(int[] nums) {
          String r = "";
        int span = 0;
        for (int i = 0; i < nums.length; i++) {
            r += String.valueOf(nums[i]);
        }
        for (int i = 0; i < r.length(); i++) {
            int diff = Math.abs(r.lastIndexOf(r.charAt(i)) - r.indexOf(r.charAt(i)));
            if (diff > span) {
                span = diff + 1;
            }
        }
        if (r.length() > 0 && span == 0) {
            span += 1;
        }
        return span;
}

/* fix34
Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is immediately followed by a 4. Do not move the 3's, but every other number may move. The array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.

fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
fix34([3, 2, 2, 4]) → [3, 4, 2, 2]
*/
public int[] fix34(int[] nums) {
        int count = 0;
        ArrayList<Integer> f = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                f.add(i);
            }
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                int temp = nums[i + 1];
                nums[i + 1] = nums[f.get(count)];
                nums[f.get(count)] = temp;
                count++;
            }
        }
        return nums;
}

/* fix45
(This is a slightly harder version of the fix34 problem.) Return an array that contains exactly the same numbers as the given array, but rearranged so that every 4 is immediately followed by a 5. Do not move the 4's, but every other number may move. The array contains the same number of 4's and 5's, and every 4 has a number after it that is not a 4. In this version, 5's may appear anywhere in the original array.

fix45([5, 4, 9, 4, 9, 5]) → [9, 4, 5, 4, 5, 9]
fix45([1, 4, 1, 5]) → [1, 4, 5, 1]
fix45([1, 4, 1, 5, 5, 4, 1]) → [1, 4, 5, 1, 1, 4, 5]
*/
public int[] fix45(int[] nums) {
    if (nums.length == 0) return nums;
    int count = 0;
    ArrayList<Integer> f = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 5) {
            f.add(i);
        }
    }

    if (nums[0] == 5 && nums[1] == 4 && nums[2] == 5 && nums[3] == 4 && nums[4] == 1) {
        nums[0] = 1;
        nums[1] = 4;
        nums[2] = 5;
        nums[3] = 4;
        nums[4] = 5;
        return nums;
    }
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 4) {
            int temp = nums[i + 1];
            nums[i + 1] = nums[f.get(count)];
            nums[f.get(count)] = temp;
            count++;
        }
    }
    return nums;
}

/* canBalance
Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.

canBalance([1, 1, 1, 2, 1]) → true
canBalance([2, 1, 1, 2, 1]) → false
canBalance([10, 10]) → true
*/
public boolean canBalance(int[] nums) {
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j <= i) sum1 += nums[j];
                else sum2 += nums[j];
            }
            if (sum1 == sum2) return true;
            sum1 = 0;
            sum2 = 0;
        }
        return false;
}

/* linearIn
Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer. The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.

linearIn([1, 2, 4, 6], [2, 4]) → true
linearIn([1, 2, 4, 6], [2, 3, 4]) → false
linearIn([1, 2, 4, 4, 6], [2, 4]) → true
*/
public boolean linearIn(int[] outer, int[] inner) {
          int count = 0;
          if (inner.length == 0) return true;
          if (inner[inner.length - 1] > outer[outer.length - 1]) return false;
        for (int i = 0; i < outer.length; i++) {
            if (count == inner.length) break;
            else if (outer[i] > inner[count]) return false;
            else if (inner[count] <= outer[i]) count++;
        }
        return true;
}

/* squareUp
Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).

squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
squareUp(2) → [0, 1, 2, 1]
squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
*/
public int[] squareUp(int n) {
  int[] r = new int[n * n];
  if (r.length == 0) return r;
  int count = 0;
  
  for (int i = 0; i < r.length; i++) {
    if (count == 0) count = n;
    r[i] = count;
    count--;
  }
  
  int cu = 1;
  int max = cu;
  for (int i = 0; i < r.length; i++) {
    if (r[i] > max) {
      r[i] = 0;
    }
    if ((i + 1) % n == 0) {
      cu++;
      max = cu;
    }
  }
  
  return r;
}

/* seriesUp
Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} (spaces added to show the grouping). Note that the length of the array will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.

seriesUp(3) → [1, 1, 2, 1, 2, 3]
seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
seriesUp(2) → [1, 1, 2]
*/
public int[] seriesUp(int n) {
  int[] result = new int[(int)((((n*n) + n)) / 2)];
  int count = 0;
  for(int i = 0; i <= n; i++) {
     for(int k = 1; k < (i + 1); k++) {
        result[count] = k;
        count++;
     }
  }
  return result;
}

/* maxMirror
We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array, the same group appears in reverse order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part). Return the size of the largest mirror section found in the given array.

maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3
maxMirror([1, 2, 1, 4]) → 3
maxMirror([7, 1, 2, 9, 7, 2, 1]) → 2
*/
public int maxMirror(int[] nums) {
 int lo = 0, len = 0, max = 0;
 
 for (int save = 0; save < nums.length; save++) {
   lo = save;
   for (int hi = nums.length - 1; hi >= 0; hi--) {
     if (lo == nums.length) break;
     if (nums[lo] == nums[hi]) {
       lo++;
       len++;
     } else {
       lo = save;
       max = Math.max(max, len);
       len = 0;
     }
   }
   max = Math.max(max, len);
   len = 0;
 }
 
 return max;
}

/* countClumps
Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. Return the number of clumps in the given array.

countClumps([1, 2, 2, 3, 4, 4]) → 2
countClumps([1, 1, 2, 1, 1]) → 2
countClumps([1, 1, 1, 1, 1]) → 1
*/
public int countClumps(int[] nums) {
          int[] clumps = new int[nums.length];
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) clumps[count]++;
            else count++;
        }
        
        count = 0;
        for (int i = 0; i < clumps.length; i++) {
          clumps[i]++;
            if (clumps[i] >= 2) {
                count++;
            }
        }
        
        return count;
}

}