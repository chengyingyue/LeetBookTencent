package com.arraysandstrings;

import java.util.*;

public class SolutionLemon {
    public List<List<Integer>> threeSum(int[] nums) {
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