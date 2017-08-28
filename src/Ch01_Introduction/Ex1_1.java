package Ch01_Introduction;

/**
 * Created by Ross on 28.08.2017.
 */
public class Ex1_1 {
    public static void main(String[] args) {
        int[] nums = new int[15];
        for (int i = 1, j = 0; i <= 15; i++, j++) {
            nums[j] = i;
            System.out.print(nums[j] + " ");
        }
        System.out.println();
        for (int i = nums.length - 1; i >= 0; i -= 2) {
            System.out.print(nums[i] + " ");
        }
    }
}
