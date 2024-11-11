/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode result = head;
        while(head != null && head.next != null){
            // check if the current head is equal to the next head 
            if (head.val == head.next.val){
                // if values are equla, it means there is duplicate
                // the next pointer of the current node is updated to skip the next and move to next next.
                head.next = head.next.next;
            }
            else{
                head = head.next;
            }
        }
        return result;
    }
}
