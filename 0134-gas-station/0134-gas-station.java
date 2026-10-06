class Solution {
    public int canCompleteCircuit(int[] g, int[] c) {
        int start = 0;
        int s = 0;
        int total = 0;

        for (int i = 0; i < g.length; i++) {

            s += g[i] - c[i];
            total += g[i] - c[i];

            if (s < 0) {
                start = i + 1;
                s = 0;
            }
        }

        if (total < 0)
            return -1;

        return start;
    }
}