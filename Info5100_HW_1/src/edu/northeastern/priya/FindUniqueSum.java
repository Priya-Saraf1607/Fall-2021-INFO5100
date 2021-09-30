package edu.northeastern.priya;

public class FindUniqueSum {

        public static int uniqueSum(int[] nums) {
            int sum = 0;

            int[] no_of_count = new int[nums.length];

            for(int j = 0; j < nums.length; j++){
                no_of_count[nums[j]]++;
            }
            for(int j=0; j< nums.length; j++){
                if(no_of_count[nums[j]] == 1){
                       sum += nums[j];
                }
            }
            return sum;
        }

    public static void main(String[] args) {
            int result = uniqueSum(new int[]{1, 2, 3, 2});
        System.out.println(result);

        int result1 = uniqueSum(new int[]{1,1,1,1,1});
        System.out.println(result1);

    }
}
