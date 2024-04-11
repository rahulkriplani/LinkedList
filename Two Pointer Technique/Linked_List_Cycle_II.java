public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null)
            return null;
        
        ListNode fast = head;
        ListNode slow = head;
        int found = 0;
        
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                slow = head;
                
                while(slow!=fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        
        return null;
    }
}
