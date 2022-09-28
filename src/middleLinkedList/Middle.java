package middleLinkedList;

public class Middle {
    public static void main(String[] args) {
        ListNode head =
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(2,
                                        new ListNode(1)
                                )
                        )
                );
    }
    public static ListNode middle;
    public static ListNode middleNode(ListNode head) {
        int depth = calcMiddle(head,0);
        return middle;
    }

    private static int calcMiddle(ListNode head, int depth) {
        depth++;
        if(head == null){
            return 1;
        }
    }
}
