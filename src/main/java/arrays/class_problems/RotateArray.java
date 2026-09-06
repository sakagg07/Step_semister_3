package arrays.class_problems;
public class RotateArray {
    static int[] rotateArray(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[(i + k) % n] = nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] result = rotateArray(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
        for (int num : result) System.out.print(num + " ");
    }
}
