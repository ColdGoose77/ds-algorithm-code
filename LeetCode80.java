public class LeetCode80 {

    //给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使得出现次数超过两次的元素只出现两次 ，返回删除后数组的新长度。
    //
    //不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
    public int removeDuplicates(int[] nums) {
        int fast=1,slow=1;
        int count=1;
        for(;fast<nums.length;fast++) {

            if(nums[fast]!=nums[fast-1]) {
                nums[slow]=nums[fast];
                slow++;
                count=1;
            } else {
                count++;
                if(count<=2) {
                    nums[slow]=nums[fast];
                    slow++;
                }
            }



        }
        return slow;
    }
}
