class Solution {
    public String reorderSpaces(String text) {
        int sp = 0;

        for (char c : text.toCharArray())
            if (c == ' ')
                sp++;

        String[] a = text.trim().split(" +");
        int l = a.length;

        if (l == 1) {
            StringBuilder ans = new StringBuilder(a[0]);
            while (sp-- > 0)
                ans.append(" ");
            return ans.toString();
        }

        int q = sp / (l - 1);
        int rem = sp % (l - 1);

        StringBuilder x = new StringBuilder();
        for (int i = 0; i < q; i++)
            x.append(" ");

        StringBuilder z = new StringBuilder();

        for (int i = 0; i < l - 1; i++) {
            z.append(a[i]);
            z.append(x);
        }

        z.append(a[l - 1]);

        while (rem-- > 0)
            z.append(" ");

        return z.toString();
    }
}