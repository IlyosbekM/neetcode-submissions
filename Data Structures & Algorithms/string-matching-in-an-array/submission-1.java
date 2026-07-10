class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> rs = new ArrayList();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (!rs.contains(words[j]) && i != j && (words[i].indexOf(words[j])) != -1)
                    rs.add(words[j]);
            }
        }

        return rs;
    }
}