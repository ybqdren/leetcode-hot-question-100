import java.util.HashMap;

/**
 * 1.两数之和
 * @author zhao wen
 * @sice 2/16/2023
 **/
public class two_sum_1 {

    // 更快的哈希表 O(n)
    public int[] twoSum_3(int[] nums, int target) {
        HashMap<Integer, Integer> numsHashMap = new HashMap<>(nums.length - 1);
        // O(n)
        for (int i = 0; i < nums.length; i++) {
            // 寻找 target - nums[i] 的差值，如果数组中存在，就说明存在答案
            int difference = target - nums[i];
            if(numsHashMap.containsKey(difference)){
                return new int[]{i, numsHashMap.get(difference)};
            }else{
                numsHashMap.put(nums[i] , i);
            }
        }
        return new int[]{};
    }

    // 哈希表 O(2n)
    public int[] twoSum_2(int[] nums, int target) {
        HashMap<Integer, Integer> numsHashMap = new HashMap<>();
        // O(n)
        for (int i = 0; i < nums.length; i++) {
            numsHashMap.put(nums[i], i);
        }
        // O(n)
        for (int i = 0; i < nums.length; i++) {
            // 寻找 target - nums[i] 的差值，如果数组中存在，就说明存在答案
            int difference = target - nums[i];
            if(numsHashMap.containsKey(difference) && numsHashMap.get(difference) != i){
                return new int[]{i, numsHashMap.get(difference)};
            }
        }
        return new int[]{};
    }


    // 暴力破解
    public int[] twoSum_1(int[] nums, int target) {
        // nums[i] == nums[i] O(n^2)
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
