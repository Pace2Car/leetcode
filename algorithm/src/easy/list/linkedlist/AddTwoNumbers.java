package easy.list.linkedlist;

/**
 * 2. 两数相加
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * @author Pace2Car
 * @date 2019/8/27 11:10
 */
public class AddTwoNumbers {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        ListNode listNode1 = new ListNode(1);
        System.out.println(listNode1);

        ListNode listNode2 = new ListNode(9);
        listNode2.next = new ListNode(9);
        System.out.println(listNode2);

        System.out.println(addTwoNumbers(listNode1, listNode2));

        System.out.println(System.currentTimeMillis() - start + "ms");
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ansPre = new ListNode(0);
        int sum = 0;
        int carry = 0;
        ListNode ans = ansPre;
        while(l1 != null || l2 != null) {
            if(l1 != null && l2 != null) {
                sum = l1.val + l2.val + carry;
                carry = sum / 10;
                if (carry != 0) {
                    ansPre.next = new ListNode(sum % 10);
                    ansPre.next.next = new ListNode(carry);
                } else {
                    ansPre.next = new ListNode(sum);
                }
                l1 = l1.next;
                l2 = l2.next;
            } else if(l1 != null && l2 == null) {
                sum = carry + l1.val;
                carry = sum / 10;
                if (carry != 0) {
                    ansPre.next = new ListNode(sum % 10);
                    ansPre.next.next = new ListNode(carry);
                } else {
                    ansPre.next = new ListNode(sum);
                }
                l1 = l1.next;
            } else if(l1 == null && l2 != null) {
                sum = carry + l2.val;
                carry = sum / 10;
                if (carry != 0) {
                    ansPre.next = new ListNode(sum % 10);
                    ansPre.next.next = new ListNode(carry);
                } else {
                    ansPre.next = new ListNode(sum);
                }
                l2 = l2.next;
            }
            ansPre = ansPre.next;
        }
        return ans.next;
    }
}
