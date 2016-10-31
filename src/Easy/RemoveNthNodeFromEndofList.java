package Easy;

public class RemoveNthNodeFromEndofList {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p = head;
        ListNode befDel = new ListNode(0); befDel.next = head;
        for(int i = 0; i < n-1; i++){
        	if(p == null)
        		return head;
        	p = p.next;
        }
        if(p.next == null){
        	head = head.next;
        	return head;
        }
        while(p.next != null){
        	p = p.next;
        	befDel = befDel.next;
        }
        befDel.next = befDel.next.next;
        return head;
    }
}
