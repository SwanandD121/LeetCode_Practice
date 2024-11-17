class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int a : nums) map.put(a, map.getOrDefault(a, 0) + 1);
        for(int i = 1; i <= nums.length; i++){
            if(!map.containsKey(i)) res.add(i);
        }
        return res;
        
    }
}