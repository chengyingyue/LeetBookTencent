package com.arraysandstrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    /**给你一个包含 n 个整数的数nums，判断num中是否存在三个元素 a，b，c ，使得a + b + c = 0 ？
     请你找出所有满足条件且不重复的三元组。
     注意：答案中不可以包含重复的三元组。
     示例：
     给定数组 nums = [-1, 0, 1, 2, -1, -4]，
     满足要求的三元组集合为：
     [
     [-1, 0, 1],
     [-1, -1, 2]
     ]
     链接：https://leetcode-cn.com/leetbook/read/tencent/xxst6e/
     *
     * @return*/
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        //                          for two ptr
        for (int start = 0; start < nums.length - 2; start++) {
            if(nums[start] > 0) break;
            if(start > 0 && nums[start] == nums[start - 1]) continue;
            int first_ptr = start + 1;
            int sec_ptr = nums.length - 1;

            while(first_ptr < sec_ptr){

                int sum = nums[start] + nums[first_ptr] + nums[sec_ptr];
                if(sum == 0){
                    var p = new ArrayList<Integer>(3);
                    p.add(nums[start]);
                    p.add(nums[first_ptr]);
                    p.add(nums[sec_ptr]);
                    res.add(p);

                    while(first_ptr < sec_ptr){
                        first_ptr += 1;
                        if(nums[first_ptr - 1] != nums[first_ptr]){
                            break;
                        }
                    }
                    while(first_ptr < sec_ptr){
                        sec_ptr -= 1;
                        if(nums[sec_ptr + 1] != nums[sec_ptr]){
                            break;
                        }
                    }

                }
                else if(sum < 0){
                    while(first_ptr < sec_ptr){
                        first_ptr += 1;
                        if(nums[first_ptr - 1] != nums[first_ptr]){
                            break;
                        }
                    }
                }
                else if(sum > 0){
                    while(first_ptr < sec_ptr){
                        sec_ptr -= 1;
                        if(nums[sec_ptr + 1] != nums[sec_ptr]){
                            break;
                        }
                    }

                }
            }

        }
        return res;
    }
    /*    编写一个函数来查找字符串数组中的最长公共前缀。

   如果不存在公共前缀，返回空字符串 ""。

   示例 1:

   输入: ["flower","flow","flight"]
   输出: "fl"
   示例 2:

   输入: ["dog","racecar","car"]
   输出: ""
   解释: 输入不存在公共前缀。
   说明:

   所有输入只包含小写字母 a-z 。*/
    public String longestCommonPrefix(String[] strs) {
        if (strs.length != 0) {
            if (strs[0].length() == 0) {
                return "";
            }
        } else {
            return "";
        }
        int index = 0;
        //StringBuilder，快！
        StringBuilder result = new StringBuilder();
        boolean notEnd = true;
        while (notEnd) {
            for (int i = 0; i < strs.length; i++) {
                if (index >= strs[i].length()) {
                    return result.toString();
                } else {
                    if (strs[i].charAt(index) != strs[0].charAt(index)) {
                        return result.toString();
                    }
                }
            }
            result.append(strs[0].charAt(index));
            index++;
        }
        return result.toString();
    }
    public String longestPalindrome(String s) {
        /* 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
        输入: "babad"
        输出: "bab"
        注意: "aba" 也是一个有效答案。
        输入: "cbbd"
        输出: "bb"*/


        return "";
    }

    /* public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3, 4};
        double fullLength = 4;
        double a = fullLength / 2;
        double b = Math.round(a);
        int i = (int) b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(i - 1);
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }*/
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i1 = 0;
        int i2 = 0;
        double fullLength = nums1.length + nums2.length;
        if (fullLength == 1) {
            if (nums1.length != 0) {
                return nums1[0];
            } else {
                return nums2[0];
            }
        }
        int mid = (int) Math.round(fullLength / 2 - 1);
        double median = -1;
        for (int i = 0; i <=mid; i++) {
            if(i1 == nums1.length){
                median = nums2[i2];
                i2++;
            }else if(i2 == nums2.length){
                median = nums1[i1];
                i1++;
            }else {
                if (nums1[i1] < nums2[i2]) {
                    median = nums1[i1];
                    i1++;
                } else {
                    median = nums2[i2];
                    i2++;
                }
            }
        }
        if (fullLength % 2 == 1) {
            return median;
        } else {
            if (i1 == nums1.length ) {
                median = (median + nums2[i2]) / 2;
            } else if (i2 == nums2.length ) {
                median = (median + nums1[i1]) / 2;
            } else if (nums1[i1] < nums2[i2]) {
                median = (median + nums1[i1]) / 2;
            } else {
                median = (median + nums2[i2]) / 2;
            }
        }
        return median;
    }




}