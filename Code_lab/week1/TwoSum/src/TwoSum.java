import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] array, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++){
            int indices = target - array[i];
            if(map.containsKey(indices)){
                return new int[]{map.get(indices), i};
            }
            map.put(array[i], i);
        }
        throw new IllegalArgumentException("No result");
    }
    public static void main(String[] args) {
        TwoSum sol = new TwoSum();
        int[] array = new int[]{2, 7, 11, 15, 30};
        int target = 32;
        System.out.println(Arrays.toString(sol.twoSum(array, target)));
    }
}
