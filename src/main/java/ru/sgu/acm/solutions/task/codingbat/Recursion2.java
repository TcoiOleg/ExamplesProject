package ru.sgu.acm.solutions.task.codingbat;

public class Recursion2 {

    /*
    * Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the
    given target? This is a classic backtracking recursion problem. Once you understand the recursive backtracking
    strategy in this problem, you can use the same pattern for many problems to search a space of choices. Rather
    than looking at the whole array, our convention is to consider the part of the array starting at index start
    and continuing to the end of the array. The caller can specify the whole array simply by passing start as 0.
    No loops are needed -- the recursive calls progress down the array.
    groupSum(0, [2, 4, 8], 10) → true
    groupSum(0, [2, 4, 8], 14) → true
    groupSum(0, [2, 4, 8], 9) → false
    * */
    public boolean groupSum(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }
        return groupSum(start + 1, nums, target - nums[start]) || groupSum(start + 1, nums, target);
    }


    /**
     * Given an array of ints, is it possible to divide the ints into two groups, so that the sums of the two groups
     are the same. Every int must be in one group or the other. Write a recursive helper method that takes whatever
     arguments you like, and make the initial call to your recursive helper from splitArray(). (No loops needed.)
     splitArray([2, 2]) → true
     splitArray([2, 3]) → false
     splitArray([5, 2, 3]) → true
     */
    public boolean splitArray(int[] nums) {
        return rec(nums, 0, 0, 0);
    }
    private boolean rec(int[] nums, int ind, int target1, int target2) {
        if (ind >= nums.length) {
            return target1 == target2;
        }
        return rec(nums, ind + 1, target1 - nums[ind], target2) | rec(nums, ind + 1, target1, target2 - nums[ind]);
    }
}
