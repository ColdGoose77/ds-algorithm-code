public class LeetCode328 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    //给定单链表的头节点 head ，将所有索引为奇数的节点和索引为偶数的节点分别组合在一起，然后返回重新排序的列表。
    //
    //第一个节点的索引被认为是 奇数 ， 第二个节点的索引为 偶数 ，以此类推。
    //
    //请注意，偶数组和奇数组内部的相对顺序应该与输入时保持一致。
    //
    //你必须在 O(1) 的额外空间复杂度和 O(n) 的时间复杂度下解决这个问题。
    public ListNode oddEvenList(ListNode head) {
        int index = 1;
        if (head == null) {
            return null;
        }

        ListNode temp1 = new ListNode();
        ListNode cur1 = temp1;
        ListNode temp2 = new ListNode();
        ListNode cur2 = temp2;
        ListNode cur = head;
        while (cur != null) {
            if (index % 2 != 0) {
                cur1.next = cur;
                cur1 = cur1.next;
            } else {
                cur2.next = cur;
                cur2 = cur2.next;
            }
            index++;
            cur = cur.next;
        }

        cur1.next = temp2.next;
        cur2.next = null;
        return temp1.next;
    }
}
