class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indexes = {0, 0};
        for (int i = 0; i < nums.length-1; i++) {
            for (int x=i+1; x < nums.length; x++){
                if (nums[i] + nums[x] == target){
                    indexes[0] = i;
                    indexes[1] = x;
                    return indexes;
                }
            }
        } 
        return indexes;
    }
}
