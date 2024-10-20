public class Week4Problems {
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
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode current = null;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            ListNode newNode = new ListNode(sum % 10);

            if (head == null) {
                head = newNode;
                current = head;
            }
            else {
                current.next = newNode;
                current = current.next;
            }
            carry = sum / 10;
        }
        return head;

    }
    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        ListNode mergedList = lists[0];

        for (int i = 1; i < lists.length; i++) {
            mergedList = mergeTwoLists(mergedList, lists[i]);
        }

        return mergedList;
    }
    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            }
            else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        if (l1 != null) {
            current.next = l1;
        }
        else if (l2 != null) {
            current.next = l2;
        }

        return dummyHead.next;
    }
    public static void main (String[] args) {
        System.out.println("Problem 1: ");
        System.out.println("Problem 2: ");
        System.out.println("Problem 3: ");
        System.out.println("Problem 4: ");
        System.out.println("Problem 5: ");
        System.out.println("Problem 6: ");
        System.out.println("Problem 7: ");
    }
}
