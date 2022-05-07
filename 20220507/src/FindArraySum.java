import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那 两个 整数，并返回它们的数组下标。
 * User: liaoyueyue
 * Date: 2022-05-07
 * Time: 9:47
 */
public class FindArraySum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] nums = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("请输入一个目标值：");
        int target = in.nextInt();
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    System.out.println("["+i+","+j+"]");
                }
            }
        }
    }
}
