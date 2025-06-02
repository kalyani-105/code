class Solution {
    public static int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            hs.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (hs.contains(nums2[i])) {
                ans.add(nums2[i]);
            }
        }

        
        int[] result = new int[ans.size()];
        int c = 0;
        
        for (int a : ans) {
            result[c++] = a;
        }

        return result;
    }
}