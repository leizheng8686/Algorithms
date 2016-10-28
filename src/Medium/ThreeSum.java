package Medium;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> rs = new ArrayList<List<Integer>>();
        int len = nums.length;
        for(int i = 0; i < len - 2; i++){
        	if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {
	        	int l = i + 1, h = len - 1;
	        	while(l < h){
		        	if(nums[l] + nums[h] + nums[i] == 0){
		        		rs.add(Arrays.asList(nums[i],nums[l],nums[h]));
		        		while(l<h && nums[l] == nums[l+1]) l++;
		        		while(l<h && nums[h] == nums[h-1]) h--;
		        		l++;h--;
		        	}else if(nums[l] + nums[h] + nums[i] > 0)
		        		h--;
		        	else
		        		l++;
	        	}
        	}
        }
        return rs;
    }
}
