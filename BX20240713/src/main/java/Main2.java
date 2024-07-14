import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description: 腐烂的苹果 https://www.nowcoder.com/practice/54ab9865ce7a45968b126d6968a77f34?tpId=196&tqId=40529&ru=/exam/oj
 * User: liaoyueyue
 * Date: 2024-07-13
 * Time: 15:40
 */
public class Main2 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        list1.add(2);
        list1.add(1);
        list1.add(1);
        list2.add(1);
        list2.add(0);
        list2.add(1);
        list3.add(1);
        list3.add(1);
        list3.add(1);
        lists.add(list1);
        lists.add(list2);
        lists.add(list3);
        Main2 main = new Main2();
        System.out.println(main.rotApple(lists));
    }
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * [2,1,1]
     * [1,0,1]
     * [1,1,1]
     *
     * @param grid int整型ArrayList<ArrayList<>>
     * @return int整型
     */
    //每一个腐烂苹果，过了一分钟，都会影响上下左右（即下一个层次）苹果的状态，依次类推直到下一层次没有好苹果可以影响到（没有好苹果了，或者影响不到），明显的广度优先搜索
    public int rotApple (ArrayList<ArrayList<Integer>> grid) {
        //对应上下左右坐标的改变
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int m = grid.size(), n = grid.get(0).size();
        Queue<int[]> que = new LinkedList<>();
        int count = 0;
        //遍历，腐烂苹果的坐标放入队列，用于改变上下左右坐标处苹果的状态，count记录好苹果的数量，
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid.get(i).get(j) == 2) {
                    que.add(new int[]{i, j});
                } else if (grid.get(i).get(j) == 1) {
                    count++;
                }
            }
        }
        int round = 0;
        while (count > 0 && !que.isEmpty()) {
            //过去了多少分钟
            round++;
            //队列长度会变，直接把que.size()放入for循环会出错
            int size = que.size();
            for (int i = 0; i < size; i++) {
                int[] org = que.poll();
                //改变当前腐烂苹果的上下左右处苹果的状态
                for (int j = 0; j < 4; j++) {
                    int x = org[0] + dx[j];
                    int y = org[1] + dy[j];
                    //边界判定
                    if (x >= 0 && y >= 0 && x < m && y < n && grid.get(x).get(y) == 1) {
                        grid.get(x).set(y, 2);
                        que.add(new int[]{x, y});
                        count--;
                    }
                }
            }
        }
        if (count != 0) {
            return -1;
        } else {
            return round;
        }
    }
}
