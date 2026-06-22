class Solution {
    public boolean hasDuplicate(int[] nums) {

        int n = nums.length;

        HashSet<Integer> map1 = new HashSet<>();
        for(int i = 0; i<n; i++){
            if(!map1.contains(nums[i])){
                map1.add(nums[i]);
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