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
    public ListNode reverseList(ListNode head) {
        int count =0;
        ListNode temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        int[] arr = new int[count];
        int p=count-1;
        temp = head;
        while(temp!=null){
            arr[p]=temp.val;
            temp=temp.next;
            p--;
        }
        temp=head;
        p=0;
        while(temp!=null){
            temp.val=arr[p];
            p++;
            temp = temp.next;
        }
        return head;
    }
}