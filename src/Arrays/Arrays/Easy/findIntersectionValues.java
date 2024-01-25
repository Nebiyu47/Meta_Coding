package Arrays.Arrays.Easy;

import java.util.*;

public class findIntersectionValues {
    public static void main(String[] args) {

    }

    public static int[] findIntersectionValues(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Add elements of nums1 to set1
        for (int num : nums1) {
            set1.add(num);
        }

        // Calculate the count of common elements between nums1 and nums2
        int commonCount = 0;
        for (int num : nums2) {
            if (set1.contains(num)) {
                commonCount++;
            }
        }

        // Add elements of nums2 to set2
        for (int num : nums2) {
            set2.add(num);
        }

        // Calculate the count of common elements between nums2 and nums1
        int commonCount2 = 0;
        for (int num : nums1) {
            if (set2.contains(num)) {
                commonCount2++;
            }
        }

        // Create an ArrayList to store the counts
        ArrayList<Integer> counts = new ArrayList<>();
        counts.add(commonCount2);
        counts.add(commonCount);

        // Convert ArrayList to an array
        int[] intersectionCounts = counts.stream().mapToInt(Integer::intValue).toArray();

        return intersectionCounts;
    }
}
