class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> set = new HashSet<>();
        for(int a : nums) set.add(a);
        if(!set.contains(original)) return original;
        else original *= 2;
        return findFinalValue(nums, original);
    }
}