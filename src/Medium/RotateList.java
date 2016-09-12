package Medium;

public class RotateList {
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	public static ListNode rotateRight(ListNode head, int k) {
		if(head == null)
			return null;
        int n = 0;
        for(ListNode ln = head; ln != null; ln = ln.next)
        	n++;
        k = k%n;
        if(n==k || n==1 || k==0)
        	return head;
        ListNode tempt = head;
        ListNode temph = head;
        for(int i=1;i<n-k;i++)
        	tempt = tempt.next;
        temph = tempt.next;
        tempt.next = null;
        ListNode temp = head;
        head = temph;
        while(temph.next != null){
        	temph = temph.next;
        }
        temph.next = temp;
        return head;
    }
	
	public static void main(String arg[]){
		int N = 5;
		ListNode tail = new ListNode(N);
		tail.next = null;
		ListNode temp = tail;
		for(int i=N-1; i>0;i--){
			ListNode p = new ListNode(i);
			p.next = temp;
			temp = p;
		}
		temp = rotateRight(temp,99);
		while(temp != null){
			System.out.println(temp.val);
			temp = temp.next;
		}
	}
}
