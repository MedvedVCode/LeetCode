package middleLinkedList;

// TODO: 28.09.2022 Вывести список от среднего элемента, если средних два элемента, то от 2-го.
public class Middle {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, null);
        addNode(head, 2);

        printList(head);
        System.out.println("Глубина списка: " + sizeOfListNode(head));
        System.out.println("Середина списка: " + calcMiddlePosition(head, 1));
        printList(middle);
    }

    public static int depth = 0;
    public static int middleDepth = 0;
    public static ListNode middle;

    private static int calcMiddlePosition(ListNode head, int i) {
        if (head == null) {
            depth = i-1;
            if (depth == 1) {
                middle = head;
            }
            return depth / 2 + 1;

        } else {
            middleDepth = calcMiddlePosition(head.next, i + 1);
            if (i == middleDepth) {
                middle = head;
            }
            return middleDepth;
        }
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
