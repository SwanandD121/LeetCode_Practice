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
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        LinkedList<Integer> res = new LinkedList<>();
        while(temp1 != null && temp2 != null){
            if(temp1.val == temp2.val){
                res.add(temp1.val);
                res.add(temp2.val);
                temp1 = temp1.next;
                temp2 = temp2.next;
            } else if(temp1.val > temp2.val){
                res.add(temp2.val);
                temp2 = temp2.next;
            } else {
                res.add(temp1.val);
                temp1 = temp1.next;
            }
        }
        while(temp1 != null){
            res.add(temp1.val);
            temp1 = temp1.next;
        }
        while(temp2 != null){
            res.add(temp2.val);
            temp2 = temp2.next;
        }
        ListNode dh = new ListNode(0);
        ListNode curr = dh;
        for (int val : res) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }
        
        return dh.next;

    }
}