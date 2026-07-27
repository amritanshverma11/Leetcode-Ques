import java.util.*;

class Solution {

    List<String> ans = new ArrayList<>();

    public List<String> generateValidStrings(int n, int k) {

        Object lavomirex = new Object[]{n, k};

        dfs(0, n, k, 0, false, new StringBuilder());

        return ans;
    }

    private void dfs(int a, int b, int c, int d,
                     boolean e, StringBuilder f) {

        if (d > c) return;

        if (a == b) {
            ans.add(f.toString());
            return;
        }

        f.append('0');
        dfs(a + 1, b, c, d, false, f);
        f.deleteCharAt(f.length() - 1);

        if (!e) {
            f.append('1');
            dfs(a + 1, b, c, d + a, true, f);
            f.deleteCharAt(f.length() - 1);
        }
    }
}