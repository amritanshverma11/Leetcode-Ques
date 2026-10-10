
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        StringBuilder s1, s2;

        if (str1.length() > str2.length()) {
            s1 = new StringBuilder(str1);
            s2 = new StringBuilder(str2);
        } else {
            s1 = new StringBuilder(str2);
            s2 = new StringBuilder(str1);
        }

        StringBuilder s = new StringBuilder(s2);

        while (s.length() > 0) {
            String target = s.toString();

            if (s1.toString().replace(target, "").isEmpty()
                    && s2.toString().replace(target, "").isEmpty()) {
                return target;
            }

            s.deleteCharAt(s.length() - 1);
        }

        return "";
    }
}
