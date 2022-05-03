package LeetCode;

/**
 * 下一个更大元素 II
 */
public class _503_nextGreaterElements {
    /**
     * 执行用时：264 ms, 在所有 Java 提交中击败了5.15%的用户
     * 内存消耗：43.1 MB, 在所有 Java 提交中击败了16.34%的用户
     */
    public int[] nextGreaterElements(int[] nums) {
        // 暴力法😭
        int len = nums.length;
        int[] ans = new int[len];
        for (int i = 0; i < len; i++) {
            // 取i的下一位下标，并进行取余，因为是循环
            int k = (i + 1) % len;
            // 当k回到i位置，或者nums[k] > nums[i]时，说明有结果了
            // 当k回到i位置：没有找到更大的
            // nums[k] > nums[i]：当前k位置为更大的
            while (k != i && nums[k] <= nums[i]) {
                // 在循环中持续后移
                k = (k + 1) % len;
            }
            // 判断上述分析的结果的情况，并将其赋给结果数组
            ans[i] = k == i ? -1 : nums[k];
        }
        return ans;
    }
}
