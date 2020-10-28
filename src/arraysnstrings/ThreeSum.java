package arraysnstrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

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
}
