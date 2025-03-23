import java.util.Scanner;

// Given a binary array, find the maximum number of consecutive 1s in this array.

class Consecutive1s {
    public int findMaxConsecutive1s(int[] nums) {
        int num1s = 0;
        int maxNum1s = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                num1s++;
            }
            else {
                maxNum1s = Math.max(num1s, maxNum1s);
                num1s = 0;
            }
        }

        maxNum1s = Math.max(num1s, maxNum1s);
        return maxNum1s;
    }

    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the length of the array: ");
        int n = scan.nextInt();
        int [] nums = new int[n];

        System.out.println("Enter the binary elements in the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }

        Consecutive1s obj = new Consecutive1s();
        int max1s = obj.findMaxConsecutive1s(nums);

        System.out.println("The maximum number of consecutive 1s in the array is " + max1s);
        scan.close();

    }
}
