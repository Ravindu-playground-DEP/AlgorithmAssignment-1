public class algo3 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};

        int[] reverse = new int[nums.length];
        int length = nums.length;

        for (int i = 0; i < length; i++) {
            reverse[i] = nums[length - 1 - i];
        }

        for (int num : reverse) {
            System.out.print(num+" ,");
            
    }
    System.out.print("\b ");
}
}
