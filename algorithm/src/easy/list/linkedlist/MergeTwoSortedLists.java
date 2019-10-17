package easy.list.linkedlist;

import java.util.ArrayList;
import java.util.List;

/**
 * 21. 合并两个有序链表  --解题失败
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 * @author chenjiahao
 * @date 2019/8/26 14:40
 */
public class MergeTwoSortedLists {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(2);
        listNode1.next.next = new ListNode(4);
        listNode1.next.next.next = new ListNode(14);
        System.out.println(listNode1);

        ListNode listNode2 = new ListNode(1);
        listNode2.next = new ListNode(3);
        listNode2.next.next = new ListNode(5);
        listNode2.next.next.next = new ListNode(9);
        listNode2.next.next.next.next = new ListNode(11);
        System.out.println(listNode2);
        System.out.println(mergeTwoLists(listNode1, listNode2));

        System.out.println(System.currentTimeMillis() - start + "ms");
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return getValueString(new ArrayList<>(), this);
    }

    private String getValueString(List<Integer> values, ListNode listNode) {
        if (listNode != null) {
            values.add(listNode.val);
            getValueString(values, listNode.next);
        }
        return values.toString();
    }
}
