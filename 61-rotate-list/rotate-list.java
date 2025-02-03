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
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Compute the length of the list
        ListNode temp = head;
        int length = 1;
        while (temp.next != null) {
            temp = temp.next;
            length++;
        }
        
        // Connect last node to the head to form a circular list
        temp.next = head;
        
        // Find the new tail position (length - k % length - 1) and new head position
        k = k % length;
        int stepsToNewHead = length - k;
        temp = head;
        for (int i = 1; i < stepsToNewHead; i++) {
            temp = temp.next;
        }
        
        // Break the circular connection
        head = temp.next;
        temp.next = null;
        
        return head;
    }

    // Helper method to print the list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        System.out.println("Original List:");
        printList(head);
        
        int k = 2;
        head = rotateRight(head, k);
        
        System.out.println("Rotated List:");
        printList(head);
    }
}
