import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:打印大x
 * User: liaoyueyue
 * Date: 2022-04-24
 * Time: 12:57
 */

public class print_image_x {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            for(int i = 0; i < n; i++ ){
                for(int j = 0; j < n; j++){
                    if(i == j || j == n-i-1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.print("\n");
            }
        }
    }
}
