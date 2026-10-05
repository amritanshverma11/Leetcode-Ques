class Solution {
    public String addBinary(String a, String b) {

        String m, n, f = "";

        if (a.length() >= b.length()) {
            m = a;
            n = b;
        } else {
            m = b;
            n = a;
        }

        while (n.length() < m.length()) {
            n = "0" + n;
        }

        char c = '0';

        for (int i = m.length() - 1; i >= 0; i--) {
            char p = m.charAt(i);
            char q = n.charAt(i);

            if (p == '0' && q == '0' && c == '0') {
                f = "0" + f;
                c = '0';
            } else if ((p == '0' && q == '0' && c == '1') ||
                       (p == '0' && q == '1' && c == '0') ||
                       (p == '1' && q == '0' && c == '0')) {
                f = "1" + f;
                c = '0';
            } else if ((p == '0' && q == '1' && c == '1') ||
                       (p == '1' && q == '1' && c == '0') ||
                       (p == '1' && q == '0' && c == '1')) {
                f = "0" + f;
                c = '1';
            } else {
                f = "1" + f;
                c = '1';
            }
        }

        if (c == '1')
            f = c + f;

        return f;
    }
}