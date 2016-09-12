package Medium;
/*
 Follow up for H-Index: What if the citations array is sorted in ascending order? Could you optimize your algorithm?
 */
//it is not necessary to figure out the situation when it is the head or tail. the more numbers the less chance
public class H_IndexII {
	public static int hIndex(int[] citations){
		int len = citations.length;	  
        int low=0, high=len-1;  
        while(low<=high) {  
            int mid  = low + (high-low)/2;  
            if(citations[mid] == len-mid) return len-mid;  
            else if(citations[mid] < len-mid) low = mid+1;  
            else high = mid-1;  
        }  
        return len-low;  
	}
	
	public static void main(String args[]){
		int c[] = {0,1,2,3,4,5,7,7,7,8,8,8};
		System.out.println(hIndex(c));
	}
}

