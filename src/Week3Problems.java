class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Week3Problems {
    public static ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode previous = null;

        while (current != null) {
            ListNode temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        return previous;
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list2.val < list1.val) {
            list2.next = mergeTwoLists(list2.next, list1);
            return list2;
        }
        else {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }
    }
    public static boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode next = head.next;
        ListNode current = head;
        while (next != null && next.next != null && current != null) {
            if (next == current) {
                return true;
            }
            next = next.next.next;
            current = current.next;
        }
        return false;
    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            if (a == null) {
                a = headB;
            }
            else {
                a = a.next;
            }
            if (b == null) {
                b = headA;
            }
            else {
                b = b.next;
            }
        }
        return a;
    }
    public static void main (String[] args) {
        System.out.println("Problem 1: \n");
        System.out.println("Problem 2: \n");
        ListNode reverseListHead1 = new ListNode();
        int[] reverseListHead2 = {1, 2};
        int[] reverseListHead3 = {};
        //System.out.println(reverseList(reverseListHead1));
        System.out.println("Problem 3: \n");
        System.out.println("Problem 4: \n");
        System.out.println("Problem 5: \n");
        System.out.println("Problem 6: \n");
        System.out.println("Problem 7: \n");
    }
}
//        Week 2: Linked Lists
//
//        16. Reverse Linked List - Easy - Problem #206
//        17. Merge Two Sorted Lists - Easy - Problem #21
//        18. Linked List Cycle - Easy - Problem #141
//        19. Remove Nth Node From End of List - Medium - Problem #19
//        20. Reorder List - Medium - Problem #143
//        21. Intersection of Two Linked Lists - Easy - Problem #16