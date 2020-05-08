package easy.list.linkedlist;

/**
 * 83. 删除排序链表中的重复元素
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 *
 * @author Pace2Car
 * @date 2019/10/18 15:51
 */
public class DeleteDuplicates {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(1);
        listNode1.next.next = new ListNode(2);

        System.out.println(deleteDuplicates(listNode1));

        System.out.println(System.currentTimeMillis() - start + "ms");
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while (temp.next != null) {
            if (temp.val == temp.next.val) {
                temp = temp.next;
            } else {
                temp.next = temp.next.next;
            }
        }
        return head;
    }
}

