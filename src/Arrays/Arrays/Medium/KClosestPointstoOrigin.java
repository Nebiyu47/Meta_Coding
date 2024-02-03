package Arrays.Arrays.Medium;

import java.util.Arrays;
import java.util.Comparator;

public class KClosestPointstoOrigin {
    public static void main(String[] args) {
      int [][] points ={{1,3},{-2,2}};
      int k=1;
        System.out.println(KCloset(points,k));
    }

    public static int[][] KCloset(int[][] pints, int k) {
        Comparator<int[]> comparator = (a, b) -> {
            double distanceA = Math.sqrt(a[0] * a[0] + a[1] * a[1]);
            double distanceB = Math.sqrt(b[0] * b[0] + b[1] + b[1]);
            return Double.compare(distanceA, distanceB);
        };
        Arrays.sort(pints, comparator);
        return Arrays.copyOfRange(pints, 0, k);
    }
}
