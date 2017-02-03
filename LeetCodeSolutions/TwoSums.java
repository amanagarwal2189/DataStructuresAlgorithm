import java.util.HashMap;
import java.util.Map;


/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.*/

public class TwoSums {
	public static void main (String[] arr){
		Solution s= new Solution();
		int[] j = s.twoSum(new int[]{5,4,9,2,6,10}, 13);
		if(null!=j)
			System.out.println(j[0] +" "+ j[1]);
		else
			System.out.println("Nothing found");
	}
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n= nums.length;
      //not a good solution O(n^2)  
        /*for (int i=0;i<n-1; i++){
            int temp=target-nums[i];
            for(int j=i+1;j<n; j++)
                if(nums[j]==temp)
                    return new int[]{i,j};
        }*/
      //better solution
        Map<Integer, Integer> maps = new HashMap<Integer, Integer>();
        for(int i=0; i<n; i++){
        	int temp = target - nums[i];
        	if(maps.containsKey(temp)){
        		return new int[]{maps.get(temp), i};
        	}
        	maps.put(nums[i], i);
        }
        return null;
    }
}
