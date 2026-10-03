class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int size = Math.min(nums1.length, nums2.length);
        int[] arr = new int[size];
        int index = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int k = 0; k < nums2.length; k++) {

                if (nums1[i] == nums2[k]) {

                    boolean alreadyPresent = false;

                    for (int h = 0; h < index; h++) {
                        if (nums1[i] == arr[h]) {
                            alreadyPresent = true;
                            break;
                        }
                    }

                    if (!alreadyPresent) {
                        arr[index] = nums1[i];
                        index++;
                    }

                    break;
                }
            }
        }

        int[] result = new int[index];

        for (int i = 0; i < index; i++) {
            result[i] = arr[i];
        }

        return result;
    }
}