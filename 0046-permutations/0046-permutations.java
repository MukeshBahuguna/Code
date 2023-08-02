class Solution {
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> list = new ArrayList<>();

        backtrack(list, new ArrayList<>(), nums,new boolean[nums.length]);
        return list;
    }

    public void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, boolean[] freq)      
    {
        if(tempList.size() == nums.length){
          list.add(new ArrayList<>(tempList));  
        } 
        else{
          for(int i = 0; i < nums.length; i++){ 
             if(!freq[i]) {
                 freq[i]=true;
                 tempList.add(nums[i]);
                 backtrack(list, tempList, nums,freq);
                 tempList.remove(tempList.size() - 1);
                 freq[i]=false;
             }
          }
       }
	}
}