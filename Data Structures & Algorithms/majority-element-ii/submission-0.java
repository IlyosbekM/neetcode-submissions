class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap();
        int counter = nums.length / 3;
        List<Integer> rs =new ArrayList();


        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
    System.out.println(counter);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > counter) {
                rs.add(entry.getKey());
            }
        }
        return rs;
    }
}