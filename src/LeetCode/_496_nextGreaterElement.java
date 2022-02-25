package LeetCode;

/**
 * 下一个更大元素 I
 */
public class _496_nextGreaterElement {
    /**
     * 执行用时：5 ms, 在所有 Java 提交中击败了21.90%的用户
     * 内存消耗：41.4 MB, 在所有 Java 提交中击败了16.96%的用户
     */
//    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//        int[] res = new int[nums1.length];
//        for (int i = 0; i < nums1.length; i++) {
//            int indexNum = Integer.MAX_VALUE;
//            for (int j = 0;j < nums2.length;j++) {
//                if (nums1[i] == nums2[j]) {
//                    indexNum = nums2[j];
//                }
//                if (nums2[j] > indexNum) {
//                    res[i] = nums2[j];
//                    break;
//                }
//                if (indexNum == nums1[i] && j == nums2.length - 1) {
//                    res[i] = -1;
//                }
//            }
//        }
//        return res;
//    }
    /**
     * 执行用时：3 ms, 在所有 Java 提交中击败了91.40%的用户
     * 内存消耗：41.4 MB, 在所有 Java 提交中击败了19.69%的用户
     */
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int[] res = new int[m];
        for (int i = 0; i < m; ++i) {
            int j = 0;
            while (j < n && nums2[j] != nums1[i]) {
                ++j;
            }
            int k = j + 1;
            while (k < n && nums2[k] < nums2[j]) {
                ++k;
            }
            res[i] = k < n ? nums2[k] : -1;
        }
        return res;
    }
}
