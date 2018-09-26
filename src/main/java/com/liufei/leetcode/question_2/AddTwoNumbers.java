package com.liufei.leetcode.question_2;

/**
 * @author:liufei
 * @create_time:2018/9/26
 */
public class AddTwoNumbers {

  public static void main(String[] args) {
    ListNode l1 = new ListNode(5);
    //l1.next = new ListNode(4);
    //l1.next.next = new ListNode(3);
    ListNode l2 = new ListNode(5);
    //l2.next = new ListNode(6);
    //l2.next.next = new ListNode(4);

    ListNode resultNode = addTwoNumbers(l1, l2);

    do {
      System.out.println(resultNode.val);
      resultNode = resultNode.next;
    } while (resultNode != null);
  }

  public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode listNode = null;
    ListNode curListNode = null;
    int carry = 0;
    do {
      int sum = 0;
      if (l1 != null) {
        sum += l1.val;
        l1 = l1.next;
      }
      if (l2 != null) {
        sum += l2.val;
        l2 = l2.next;
      }
      //进行进位加1
      sum += carry;
      //清除进位
      carry = 0;

      if (sum >= 10) {
        carry = 1;
        sum = sum % 10;
      }
      if (listNode == null) {
        listNode = new ListNode(sum);
        curListNode = listNode;
      } else {
        curListNode.next = new ListNode(sum);
        curListNode = curListNode.next;
      }


    } while (l1 != null || l2 != null || carry > 0);
    return listNode;
  }
}
