class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int cnt=0;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]==nums[i-1]){
                cnt++;
            }
        }
        return nums.length-cnt;
    }
}