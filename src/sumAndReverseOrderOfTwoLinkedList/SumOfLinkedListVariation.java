package sumAndReverseOrderOfTwoLinkedList;

// TODO: 30.09.2022 Даны два списка. Составить число из цифр в списке, цифры идут в обратном порядке. Суммировать.
//  Цифры из суммы перевернуть и создать новый список.

import java.util.ArrayList;
import java.util.List;

public class SumOfLinkedListVariation {
    public static void main(String[] args) {
        ListNode first = new ListNode(9);
        ListNode second = new ListNode(9);
//        addNode(second, 9);
//        addNode(second, 9);
//        addNode(second, 9);
//        addNode(second, 9);
//        addNode(second, 9);
//        addNode(second, 9);
//        addNode(second, 9);
//        addNode(second, 9);
//        addNode(second, 9);

        printList(addTwoNumbers(first, second));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int sumResult = 0;
        int sumRest = 0;
        ListNode result = null;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                sumResult += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sumResult += l2.val;
                l2 = l2.next;
            }
            if (sumRest > 0) {
                sumResult += sumRest;
                sumRest = 0;
            }
            if (sumResult > 9) {
                sumRest = 1;
                sumResult %= 10;
            }
            if (result != null) {
                addNode(result, sumResult);
            } else {
                result = new ListNode(sumResult);
            }
            sumResult = 0;
        }
        if (sumRest > 0) {
            addNode(result, sumRest);
        }
        return result;
    }

    private static void addNode(ListNode head, int intToAdd) {
        if (head.next == null) {
            head.next = new ListNode(intToAdd);
        } else {
            addNode(head.next, intToAdd);
        }
    }

    public static void printList(ListNode head) {
        System.out.print(head.val + ", ");
        head = head.next;
        if (head == null) {
            return;
        }
        printList(head);
    }
}
