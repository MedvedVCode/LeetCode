package palindromLinkedList;
// TODO: 26.09.2022 На входе односвязный список [1,2,2,1].
//  Проверить, что списко является полиндромом.

public class Palindrom {
    public static void main(String[] args) {
        ListNode head =
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(2,
                                        new ListNode(1)
                                )
                        )
                );
        System.out.println(isPalindrome(head));
        printList(head);
    }

    public static void printList(ListNode head) {
        System.out.println(head.val);
        head = head.next;
        if (head == null) {
            return;
        }
        printList(head);
    }

    public static ListNode tryHead;

    public static boolean isPalindrome(ListNode head) {
        tryHead = head;
        return palindromCheck(head);
    }

    private static boolean palindromCheck(ListNode reverseHead) {
        if (reverseHead == null) {
            return true;
        }
        if (!palindromCheck(reverseHead.next)) {
            return false;
        } else if (tryHead.val != reverseHead.val) {
            return false;
        } else {
            tryHead = tryHead.next;
            return true;
        }
    }
}
