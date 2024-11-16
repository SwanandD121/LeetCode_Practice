class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int a : nums) map.put(a, map.getOrDefault(a, 0) + 1);
        List<Integer> res = new ArrayList<>();
        for(Map.Entry<Integer, Integer> set : map.entrySet()){
            if(set.getValue() == 2) res.add(set.getKey());
        }
        return res;
    }
}