class Solution {
    public boolean hasDuplicate(int[] nums) {

        int n = nums.length;

        HashMap<Integer,Integer> map1 = new HashMap<>();
        for(int i = 0; i<n; i++){
            if(!map1.containsKey(nums[i])){
                map1.put(nums[i],1);
            }
            else{
                return true;
            }
        }
        return false; 
    }
}

//Time Complexity : O(n) - for iterating all the elements in the array.
//Space Complexity : O(n) - for storing all the n elements in the hash map.