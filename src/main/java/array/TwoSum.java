package array;

import java.util.Arrays;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] output = {0,0};
        boolean found = false;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j< nums.length; j++){
                if(nums[i]+nums[j] == target){
                    output[0] = i;
                    output[1] = j;
                    found = true;
                    break;

                }
            }
            if (found) break;
        }
        return output;
    }
    public static void main(String[] args){
        int[] nums = {3,2,3,4};
        int target = 6;
        System.out.println(Arrays.toString(new TwoSum().twoSum(nums,target)));
    }
}