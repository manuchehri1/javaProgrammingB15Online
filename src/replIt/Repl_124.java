package replIt;

        import java.util.Arrays;
        import java.util.Scanner;

public class Repl_124 {
    public static void main(String[] args) {

        //TODO: write your code below


        //Do not change below statement:
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: write your code below
        int temp=0;
        for(int i =0; i<nums.length/2; i++){
            temp=nums[i];
            nums[i]=nums[nums.length-1-i];
            nums[nums.length-1-i]=temp;
        }


        //Do not change below statement:
        System.out.println(Arrays.toString(nums));
    }
}
