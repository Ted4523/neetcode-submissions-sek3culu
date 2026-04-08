class ListNode {
    int val;
    ListNode next;

    public ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }

}

class LinkedList {
    ListNode head;
    ListNode tail;

    public LinkedList() {
        head = new ListNode(-1, null);
        tail = head;
    }

    public int get(int index) {
        ListNode curr = head.next;
        while(index>=0){
            if(curr==null) return -1;
            if(index==0) return curr.val;
            index--;
            curr = curr.next;
        }
        return -1;
    }

    public void insertHead(int val) {
        ListNode curr = new ListNode(val, null);
        curr.next = head.next;
        head.next = curr;
        if(curr.next==null) tail = curr;
    }

    public void insertTail(int val) {
        ListNode curr = new ListNode(val, null);
        tail.next = curr;
        tail = curr;
    }

    public boolean remove(int index) {
        ListNode prev = head;
        ListNode curr = head.next;
        while(index>=0){
            if(curr==null) return false;
            if(index==0) {
                if(curr==tail){
                    prev.next = null;
                    tail = prev;
                    return true;
                }
                prev.next = curr.next;
                return true;
            }
            prev = curr;
            curr = curr.next;
            index--;
        }
        return false;
    }

    public ArrayList<Integer> getValues() {
        ListNode curr = head.next;
        ArrayList<Integer> res = new ArrayList<>();
        while(curr!=null){
            res.add(curr.val);
            curr = curr.next;
        }
        return res;
    }
}
