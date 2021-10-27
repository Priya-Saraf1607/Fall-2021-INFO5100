package edu.northeastern.priya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Question3 {


    public static int findSumOfDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        int sum=0;

        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                ans.add(nums[i]);
                sum=sum+nums[i];
                i++;        // skip over next element
            }
        }

        return sum;
    }


    public static void main(String args[]){

        int[] nums1 = {1,3,-1,3,4,-1};
        System.out.println(findSumOfDuplicates(nums1));

        int[] nums2 = {1,-1,3,4,-1};
        System.out.println(findSumOfDuplicates(nums2));

        int[] nums3 = {0,0,0,0};
        System.out.println(findSumOfDuplicates(nums3));

        int[] nums4 = {0,0,0,1,-1};
        System.out.println(findSumOfDuplicates(nums4));

        int[] nums5 = {2};
        System.out.println(findSumOfDuplicates(nums5));

        int[] nums6 = {2,2};
        System.out.println(findSumOfDuplicates(nums6));

    }
}
