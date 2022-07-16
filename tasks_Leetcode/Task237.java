package tasks_Leetcode;

public class Task237 {
    public class ListNode {
        int val=5;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
        public void deleteNode(ListNode node) {
            ListNode temp = node.next;
            node.val = temp.val;
            node.next = temp.next;
            temp = null;
            System.out.println(temp);
        }
    
public static void main(String[] args) {
    
    Task237 res = new Task237();
    res.deleteNode(null);
}

}
