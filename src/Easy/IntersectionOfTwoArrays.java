package Easy;

import java.util.ArrayList;

public class IntersectionOfTwoArrays {
	public static int[] intersection(int[] nums1, int[] nums2){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i<nums1.length; i++){
			for(int j = 0; j<nums2.length; j++){
				if(nums1[i] == nums2[j])
					if(!list.contains(nums1[i]))
						list.add(nums1[i]);
			}
		}
		int[] result = new int[list.size()];
		for(int i = 0; i<result.length; i++)
			result[i] = list.get(i);
		return result;
	}
	
	public static void main(String args[]){
		int[] nums1 = {1,2,3,4,5,6,7,8,9,8,7,6,5,4,3,2,1,0};
		int[] nums2 = {2,2,5,5,8,8,2,2};
		int[] nums = intersection(nums1, nums2);
		for(int i = 0; i<nums.length; i++)
			System.out.print(nums[i] + " ");
	}
}
