class Solution {
    public List<String> stringMatching(String[] words) {
        Set<String> rs = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[j].contains(words[i])) {
                    rs.add(words[i]);
                    break;
                }
            }
        }

        return new ArrayList<>(rs);
    }
}