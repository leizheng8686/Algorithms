package Medium;

import java.util.Arrays;

public class ThreeSumClosest {
	public static int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
        int rs = nums[0] + nums[1] + nums[2], len = nums.length;
        for(int i = 0; i < len - 2; i++){
        	int l = i + 1, h = len - 1;
        	while(l < h){
	        	int sum = nums[i] + nums[l] + nums[h] - target;
	        	if(Math.abs(sum) < Math.abs(rs - target))
	        		rs = sum + target;
	        	if(sum == 0)
	        		return target;
	        	else if(sum < 0)
	        		l++;
	        	else
	        		h--;
        	}
        }
        return rs;
    }
	
	public static void main(String args[]){
		int x = Integer.MAX_VALUE + 1;
		System.out.println(x);
		int nums[] = {-3,-2,-5,3,-4};
		System.out.println(threeSumClosest(nums,-1));
	}
}
