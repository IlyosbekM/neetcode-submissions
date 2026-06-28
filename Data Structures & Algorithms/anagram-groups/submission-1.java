class Solution {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> buckets = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if (!buckets.containsKey(sortedWord)) {
                buckets.put(sortedWord, new ArrayList<>());
            }

            buckets.get(sortedWord).add(word);
        }

        return new ArrayList<>(buckets.values());
    }
}
