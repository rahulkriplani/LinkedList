class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}
class MyLinkedList {
    ListNode head;
    int size;

    public MyLinkedList() {
        this.head = new ListNode(0, null);
        this.size = 0;
    
    }
    
    public int get(int index) {
        if((index<0) || (index>=this.size))
            return -1;
        
        ListNode curr = this.head;
        while(index>=0){
            curr = curr.next;
            index--;
        }
        return curr.val;
        
    }
    
    public void addAtHead(int val) {
        this.head.next = new ListNode(val, this.head.next);
        this.size+=1;
    }
    
    public void addAtTail(int val) {
        ListNode curr = this.head;
        while(curr.next != null)
            curr = curr.next;
        
        curr.next = new ListNode(val, null);
        this.size+=1;
    }
    
    public void addAtIndex(int index, int val) {
        if((index<0) || (index>this.size))
            return;
        
        ListNode curr = this.head;
        while(index>0){
            curr = curr.next;
            index--;
        }
        curr.next = new ListNode(val, curr.next);
        this.size+=1;
        
    }
    
    public void deleteAtIndex(int index) {
        if((index<0) || (index>=this.size))
            return;
        
        ListNode curr = this.head;
        while(index>0){
            curr = curr.next;
            index--;
        }
        
        curr.next = curr.next.next;
        this.size--;
        
    }
}
