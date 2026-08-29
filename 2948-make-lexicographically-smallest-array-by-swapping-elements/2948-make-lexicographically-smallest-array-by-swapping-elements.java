class Solution {

    public int[] lexicographicallySmallestArray(int[] nums, int limit) {

        int n = nums.length;

        // value + original index
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];  // value
            arr[i][1] = i;        // original index
        }

        // Values ke according sort
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        int start = 0;

        while (start < n) {

            int end = start;

            // Same group find karo
            while (end + 1 < n &&
                   arr[end + 1][0] - arr[end][0] <= limit) {
                end++;
            }

            // Is group ke original indices nikalo
            int[] indices = new int[end - start + 1];

            for (int i = start; i <= end; i++) {
                indices[i - start] = arr[i][1];
            }

            // Original indices sort
            Arrays.sort(indices);

            // Group ki values already sorted hain
            for (int i = start; i <= end; i++) {
                nums[indices[i - start]] = arr[i][0];
            }

            start = end + 1;
        }

        return nums;
    }
}