package easy.list.linkedlist;

/**
 * 141. 环形链表
 * 给定一个链表，判断链表中是否有环。
 *
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 *
 * @author Pace2Car
 * @date 2020/5/10 17:34
 */
public class LinkedListCycle {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        ListNode listNode1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        listNode1.next = l2;
        listNode1.next.next = new ListNode(3);
        listNode1.next.next.next = l2;

        System.out.println(hasCycle(listNode1));

        System.out.println(System.currentTimeMillis() - start + "ms");
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode l1 = head;
        ListNode l2 = head.next;
        while (l1 != null && l2 != null && l2.next != null) {
            if (l1 == l2) {
                return true;
            }
            l1 = l1.next;
            l2 = l2.next.next;
        }
        return false;
    }

}
