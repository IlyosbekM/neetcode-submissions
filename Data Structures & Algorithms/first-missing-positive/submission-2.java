class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> numbers = new HashSet();
        int findNumber=1;
        for (int num : nums) {
            numbers.add(num);
        }

        for (int num : nums) {
            if(!numbers.contains(findNumber)){
                return findNumber;
            }
            findNumber++;
            
        }
        return findNumber;
    }
}