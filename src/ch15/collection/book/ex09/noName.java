package ch15.collection.book.ex09;

import java.util.HashMap;
import java.util.Map;

public class noName {
    public int countKDifference(int[] nums, int k) {
        Map<Integer, Integer> map= new HashMap<>();
        int res=0;

        for(int i =0; i<nums.length;i++){
            if (map.containsKey(nums[i] - k)) {

                res+=map.get(nums[i]-k);
            }
            if (map.containsKey(nums[i] + k)) {

                res+=map.get(nums[i]+k);
            }
            map.put(nums[i],map.getOrDefault(nums[1],0)+1);
        }
    return res;
    }
}
