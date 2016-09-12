package Easy;

/*
Given a singly linked list, determine if it is a palindrome.

Follow up:
Could you do it in O(n) time and O(1) space?
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class PalindromeLinkedList {
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	public static boolean isPalindrome(ListNode head) {
        int len = 0;
        for(ListNode p = head; p != null; p = p.next)
        	len++;
        if(len < 2)
        	return true;
        int mid = (len+1)/2;
        ListNode p = null;
        ListNode q = head;
        for(int i = 0; i < mid;p = q, q = q.next, i++){}
        p.next = null;
        p = null;
        ListNode Q = q.next;
        q.next = null;
        while(Q != null)
        {	
        	ListNode temp = q;
        	q = Q;
        	Q = Q.next;
        	q.next = temp;
        };
        for(ListNode z = head; z != null; z = z.next)
        	System.out.print(z.val+ " ");
        System.out.println();
        for(ListNode z = q; z != null; z = z.next)
        	System.out.print(z.val+ " ");
        System.out.println();
    	ListNode left = head, right = q;
        for(int i = 0; i<len/2; i++){
        	if(left.val != right.val)
        		return false;
        	left = left.next;
        	right = right.next;
        }
        return true;
    }
	
	public static void main(String args[]){
		ListNode head = new ListNode(0);
		ListNode temp = head;
    	for(int i = 1; i<2; i++){
    		temp.next = new ListNode(i);
    		temp = temp.next;
    	}
    	temp.next = new ListNode(2);
    	temp = temp.next;
    	temp.next = new ListNode(1);
    	temp = temp.next;
    	temp.next = new ListNode(0);
    	temp = temp.next;
    	temp.next = null;
    	System.out.println(isPalindrome(head));
    }
}
