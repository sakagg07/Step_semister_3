package arrays.assignment_problems;

public class ProductExceptSelf {
    static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] result = productExceptSelf(new int[]{1, 2, 3, 4});
        for (int num : result) System.out.print(num + " ");
        System.out.println();

        int[] result2 = productExceptSelf(new int[]{-1, 1, 0, -3, 3});
        for (int num : result2) System.out.print(num + " ");
    }
}
