import java.util.Arrays;

public class RotateArray {
    //assumption k is non-negative
    public int[] rotateArray(int[] array, int k) {
        k %= array.length;
        reverse(array, 0, array.length - 1);
        reverse(array, 0, k - 1);
        reverse(array, k, array.length - 1);
        return array;
    }
    public void reverse(int[]array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        RotateArray sol = new RotateArray();
        int[] array = new int[]{1,2,3,4,5,6,7};
        int k = 5;
        System.out.println(Arrays.toString(sol.rotateArray(array, k)));
    }
}
