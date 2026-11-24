
class Solution {
    public int countDominantElements(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            int neighbors = 0;

            if (i > 0) {
                sum += nums[i - 1];
                neighbors++;
            }

            if (i < n - 1) {
                sum += nums[i + 1];
                neighbors++;
            }

            if (neighbors == 0 ||
                nums[i] * neighbors >= sum) {
                count++;
            }
        }

        return count;
    }
}
