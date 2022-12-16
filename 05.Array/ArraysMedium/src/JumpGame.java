public class JumpGame {

    public static boolean canJump(int[] nums) {

        int maxJump = 0;
        for (int i = 0; i < nums.length; ) {
            maxJump = nums[i];
            if (i == nums.length-1)
                return true;
            if (maxJump >= nums.length)
                maxJump = nums.length-1;
            i = maxJump;
        }

        return false;
    }

    public static void main(String[] args) {
        boolean output = canJump(new int[]{2,0});
        System.out.println("Output: " + output);
    }
}
