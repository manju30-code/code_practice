package array;

import java.util.HashMap;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        boolean duplicate = false;
        HashMap<Integer,Boolean> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])) {
                duplicate = true;
                break;
            }
            map.put(nums[i],true);
        }

        return duplicate;
    }
    public static void main(String[] args){
        int [] nums = {1,2,3,1};
        ContainsDuplicate cd = new ContainsDuplicate();
        System.out.println(cd.containsDuplicate(nums));
    }
}
