class Solution {
    public int removeElement(int[] nums, int val) {
        Arrays.sort(nums);
        int c=0;
        for(int i=0 ;i<nums.length ;i++){
            if(nums[i]==val){
                nums[i]=51;
                c+=1;
            }
        }
        Arrays.sort(nums);
        return nums.length - c;
    }
}