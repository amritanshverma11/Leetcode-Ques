
class Solution {
    public String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder ans = new StringBuilder();
        String vowels = "aeiouAEIOU";
        String a = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (vowels.indexOf(word.charAt(0)) == -1) {
                word = word.substring(1) + word.charAt(0);
            }

            a += "a";
            ans.append(word).append("ma").append(a);

            if (i < words.length - 1) {
                ans.append(" ");
            }
        }

        return ans.toString();
    }
}
