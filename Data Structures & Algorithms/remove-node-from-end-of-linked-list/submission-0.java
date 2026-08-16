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
    public ListNode removeNthFromEnd(ListNode head, int n) {
      //  Creating an Array List to store the LinkedList 
      List<ListNode> nodes = new ArrayList<>();
      ListNode curr = head;
      while(curr != null){
        nodes.add(curr);
        curr = curr.next;
      }
      int removeIndex = nodes.size() - n;
      if(removeIndex <= 0){ // removes first element from list and returns the rest of list
        return head.next;
      }

    nodes.get(removeIndex - 1).next = nodes.get(removeIndex).next; // set the element before removeIndex.next to the one after removeIndex, skipping the remove element
    return head;



    }
}
