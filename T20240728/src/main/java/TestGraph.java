import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description: 图的两种表示方法:邻接矩阵、邻接表
 * User: liaoyueyue
 * Date: 2024-08-25
 * Time: 2:31
 */
public class TestGraph {
    public static void main(String[] args) {
        /**
         * 1 邻接矩阵：
         *
         * 使用数组 vertices 存储顶点，邻接矩阵 edges 存储边； edges[i][j]代表顶点 i 和顶点 j 之间是否有边。
         */
        int[] vertices1 = {0, 1, 2, 3, 4};
        int[][] edges1 = {{0, 1, 1, 1, 1},
                         {1, 0, 0, 1, 0},
                         {1, 0, 0, 0, 1},
                         {1, 1, 0, 0, 1},
                         {1, 0, 1, 1, 0}};

        /**
         * 2 邻接表：
         *
         * 使用数组 vertices 存储顶点，邻接表 edges 存储边。edges 为一个二维容器，第一维 i 代表顶点索引，第二维 edges[i]存储此顶点对应的边集合；例如 edges[0] = [1, 2, 3, 4]代表 vertices[0] 的边集合为 [1, 2, 3, 4]。
         */
        int[] vertices2 = {0, 1, 2, 3, 4};
        List<List<Integer>> edges2 = new ArrayList<>();

        List<Integer> edge_1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> edge_2 = new ArrayList<>(Arrays.asList(0, 3));
        List<Integer> edge_3 = new ArrayList<>(Arrays.asList(0, 4));
        List<Integer> edge_4 = new ArrayList<>(Arrays.asList(0, 1, 4));
        List<Integer> edge_5 = new ArrayList<>(Arrays.asList(0, 2, 3));
        edges2.add(edge_1);
        edges2.add(edge_2);
        edges2.add(edge_3);
        edges2.add(edge_4);
        edges2.add(edge_5);

        /**
         * 邻接矩阵 VS 邻接表 ：
         *
         * 邻接矩阵的大小只与节点数量有关，即 N^2，其中 N 为节点数量。因此，当边数量明显少于节点数量时，使用邻接矩阵存储图会造成较大的内存浪费；
         * 邻接表适合存储稀疏图（顶点较多、边较少）； 邻接矩阵适合存储稠密图（顶点较少、边较多）；
         */
    }
}
