class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder rs = new StringBuilder();
        int length = word1.length();

        if (word1.length() > word2.length()) {
            length = word2.length();
        }

        for (int i = 0; i < length; i++) {
            rs.append(word1.charAt(i));
            rs.append(word2.charAt(i));
        }

         if (word1.length() > word2.length()) {
            rs.append(word1.substring(length));
        }
        else{
            rs.append(word2.substring(length));

        }

        

            return rs.toString();
    }
}