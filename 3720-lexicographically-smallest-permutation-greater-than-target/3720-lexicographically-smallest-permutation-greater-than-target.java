class Solution {
    public String lexGreaterPermutation(String s, String t) {

        int[] f = new int[26];

        for (int i = 0; i < s.length(); i++) {
            f[s.charAt(i) - 'a']++;
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < t.length(); i++) {

            int cur = t.charAt(i) - 'a';

            // Current character available hai
            if (f[cur] > 0) {
                ans.append(t.charAt(i));
                f[cur]--;
                continue;
            }

            // Current character se bada character dhoondo
            int bigger = cur + 1;

            while (bigger < 26 && f[bigger] == 0) {
                bigger++;
            }

            // Mil gaya
            if (bigger < 26) {
                ans.append((char) ('a' + bigger));
                f[bigger]--;

                for (int x = 0; x < 26; x++) {
                    while (f[x] > 0) {
                        ans.append((char) ('a' + x));
                        f[x]--;
                    }
                }

                return ans.toString();
            }

            // Yahan current char consume nahi hua,
            // isliye ab peeche se backtrack karenge
            for (int p = i - 1; p >= 0; p--) {

                int prev = t.charAt(p) - 'a';

                // t[p] ko wapas available karo
                f[prev]++;

                int biggerPrev = prev + 1;

                while (biggerPrev < 26 && f[biggerPrev] == 0) {
                    biggerPrev++;
                }

                if (biggerPrev < 26) {

                    StringBuilder res =
                        new StringBuilder(t.substring(0, p));

                    res.append((char) ('a' + biggerPrev));
                    f[biggerPrev]--;

                    for (int x = 0; x < 26; x++) {
                        while (f[x] > 0) {
                            res.append((char) ('a' + x));
                            f[x]--;
                        }
                    }

                    return res.toString();
                }
            }

            return "";
        }

        // t exactly match ho gaya.
        // Ab last se backtrack karke greater permutation dhoondo.
        for (int p = t.length() - 1; p >= 0; p--) {

            int prev = t.charAt(p) - 'a';

            f[prev]++;

            int bigger = prev + 1;

            while (bigger < 26 && f[bigger] == 0) {
                bigger++;
            }

            if (bigger < 26) {

                StringBuilder res =
                    new StringBuilder(t.substring(0, p));

                res.append((char) ('a' + bigger));
                f[bigger]--;

                for (int x = 0; x < 26; x++) {
                    while (f[x] > 0) {
                        res.append((char) ('a' + x));
                        f[x]--;
                    }
                }

                return res.toString();
            }
        }

        return "";
    }
}