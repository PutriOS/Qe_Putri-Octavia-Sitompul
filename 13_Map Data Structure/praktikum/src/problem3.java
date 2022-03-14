import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class problem3 {
    private static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                result[0] = i;
                result[1] = map.get(nums[i]);
                break;
            }
            else {
                map.put(target - nums[i], i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,6};
        int target = 6;
        System.out.println("Dua index akan ditambahkan untuk mencapai target: " + Arrays.toString(twoSum(nums, target)));

        nums = new int[]{2,5,9,11};
        target = 11;
        System.out.println("Dua index akan ditambahkan untuk mencapai target: " + Arrays.toString(twoSum(nums, target)));
    }
}
