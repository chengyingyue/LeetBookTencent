package arraysnstrings;

public class FindMedianSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i1 = 0;
        int i2 = 0;
        double fullLength = nums1.length + nums2.length;
        if (fullLength == 1) {
            if (nums1.length != 0) {
                return nums1[0];
            } else {
                return nums2[0];
            }
        }
        int mid = (int) Math.round(fullLength / 2 - 1);
        double median = -1;
        for (int i = 0; i <=mid; i++) {
            if(i1 == nums1.length){
                median = nums2[i2];
                i2++;
            }else if(i2 == nums2.length){
                median = nums1[i1];
                i1++;
            }else {
                if (nums1[i1] < nums2[i2]) {
                    median = nums1[i1];
                    i1++;
                } else {
                    median = nums2[i2];
                    i2++;
                }
            }
        }
        if (fullLength % 2 == 1) {
            return median;
        } else {
            if (i1 == nums1.length ) {
                median = (median + nums2[i2]) / 2;
            } else if (i2 == nums2.length ) {
                median = (median + nums1[i1]) / 2;
            } else if (nums1[i1] < nums2[i2]) {
                median = (median + nums1[i1]) / 2;
            } else {
                median = (median + nums2[i2]) / 2;
            }
        }
        return median;
    }

}
