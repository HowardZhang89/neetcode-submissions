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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // find the list with the smaller head, becomes head
        // look at next value in each list 
        // take the bigger onew
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode head, curr;
        // set up the first node
        if(list1.val <= list2.val){
            head = list1;
            curr = list1;
            list1 = list1.next;
        }else{
            head = list2;
            curr = list2;
            list2 = list2.next;
        }

        // iteratively merge 
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                curr.next = list1;
                list1 = list1.next;
            }else{
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        if(list1 != null){curr.next = list1;}
        if(list2 != null){curr.next = list2;}

        return head;
    }
}