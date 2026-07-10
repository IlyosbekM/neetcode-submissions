class Solution {
    public List<String> stringMatching(String[] words) {
        Set<String> rs = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                 if (words[j].contains(words[i]) && words[j].length() > words[i].length()){
                    rs.add(words[i]);
                    break;
                }
            }
        }

        return new ArrayList<>(rs);
    }
}