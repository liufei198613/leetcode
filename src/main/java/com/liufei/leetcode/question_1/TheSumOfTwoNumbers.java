package com.liufei.leetcode.question_1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author:liufei
 * @create_time:2018/9/26
 */
public class TheSumOfTwoNumbers {

  public static void main(String[] args) {
    int[] nums = new int[]{
        3, 2, 4
    };

    int target = 6;
    int[] result = new int[2];

    result = twoSum(nums, target);

    System.out.println("[" + result[0] + "," + result[1] + "]");
  }

  public static int[] twoSum(int[] nums, int target) {

    Map<Integer, Integer> numsMap = new HashMap<Integer, Integer>();

    for (int i = 0; i < nums.length; i++) {
      numsMap.put(nums[i], i);
    }

    for (int i = 0; i < nums.length; i++) {
      Integer flag = numsMap.get(target - nums[i]);
      if (flag != null) {
        if (i != flag) {
          return new int[]{i, flag};
        }
      }
    }
    return null;
  }
}
