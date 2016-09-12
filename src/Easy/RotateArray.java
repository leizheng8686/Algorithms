package Easy;


public class RotateArray {
	
	public static void rotate(int[] nums, int k) {
		if(nums == null || k<0)
			throw new IllegalArgumentException("Illegal argument!");
		int len = nums.length;
		if(k >= len)
			k = k%len;
        int temp[] = new int[len];
        System.arraycopy(nums, len-k, temp, 0, k);
        System.arraycopy(nums, 0, temp, k, len-k);
        System.arraycopy(temp, 0, nums, 0, len);
    }
	
	public static void main(String arg[]){
		int a[] = new int[]{1,2,3,4,5,6,7,8,9};
//		a[] = {1,2,3,4,5,6,7};
		System.out.println(a.length);
		for(int i =0; i<a.length ;i++)
			System.out.print(a[i]);
		System.out.println();
		rotate(a,1);
		for(int i =0; i<a.length ;i++)
			System.out.print(a[i]);
	}
}
