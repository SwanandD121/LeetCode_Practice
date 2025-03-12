class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int a : nums) set.add(a);
        int i = 0;
        for(int a : set) {
            nums[i] = a;
            i++;
        }
        return set.size();
    }
}