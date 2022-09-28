package middleLinkedList;

public class Middle {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, null);
        addNode(head, 2);
        addNode(head, 3);
        addNode(head, 4);
        addNode(head, 5);
        addNode(head, 6);
        printList(head);
        System.out.println("Глубина списка: " + sizeOfListNode(head));
    }

    private static void addNode(ListNode head, int intToAdd) {
        if (head.next == null) {
            head.next = new ListNode(intToAdd, null);
        } else {
            addNode(head.next, intToAdd);
        }
    }

    public static int sizeOfListNode(ListNode head) {
        if (head.next == null) {
            return 1;
        } else {
            return 1 + sizeOfListNode(head.next);
        }
    }
    public static void printList(ListNode head) {
        System.out.println(head.val);
        head = head.next;
        if (head == null) {
            return;
        }
        printList(head);
    }
}
