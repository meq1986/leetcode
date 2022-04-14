package com.maeq.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

//    class InnerClass{
//        public int value;
//        public int index;
//    }

    public int[] twoSum2(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int remain = target - nums[i];
            if(map.containsKey(remain))
                return new int[]{i,map.get(remain)};
            else
                map.put(nums[i],i);
        }
        return null;
    }

    /*
    Runtime: 84 ms
    Memory Usage: 42.3 MB
     */
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
