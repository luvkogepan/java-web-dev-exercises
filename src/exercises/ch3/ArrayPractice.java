package exercises.ch3;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 5, 8};

        for (int i : nums) {
            if (i%2==1)
            System.out.println(i);
        }
    }
}
