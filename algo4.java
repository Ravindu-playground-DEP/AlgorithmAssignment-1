import java.util.Scanner;

public class algo4 {
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};

        for (int i = 0; i < nums.length/2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length-(i+1)];
            nums[nums.length-(i+1)] = temp;
            }

        System.out.print("[");
    for (int i = 0; i < nums.length; i++) {
        System.out.print(nums[i] + ", ");
    }
    System.out.print("\b\b]");

    }
}
}