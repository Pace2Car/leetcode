package easy.list.linkedlist;

import java.util.ArrayList;
import java.util.List;

/**
 * 链表节点
 *
 * @author Pace2Car
 * @date 2019/10/18 15:53
 */
public class ListNode {
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
