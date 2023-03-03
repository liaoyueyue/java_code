import com.mysql.cj.jdbc.MysqlDataSource;


import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-03-03
 * Time: 20:37
 */
public class JDBC_DEMO {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //建立数据库源对象
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl("jdbc:mysql://127.0.0.1:3306/testjdbc?serverTimezone=UTC");
        ((MysqlDataSource) dataSource).setUser("root");
        ((MysqlDataSource) dataSource).setPassword("111111");
        //代码与数据库连接
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        //定义sql语句
        String sql1 = "select * from ikun";
        String sql2 = "update ikun set count = 1314 where id = 1";
        //获取执行sql的对象
        PreparedStatement statement1 = connection.prepareStatement(sql1);
        PreparedStatement statement2 = connection.prepareStatement(sql2);
        System.out.println(statement1);
        System.out.println(statement2);
        //执行sql1语句，查询表
        ResultSet resultset1 = statement1.executeQuery();
        while (resultset1.next()) {
            //每次循环获取一行
            int id = resultset1.getInt("id");
            String name = resultset1.getString("name");
            int count1 = resultset1.getInt("count");
            System.out.println("id = " + id + " name = " + name + " count = " + count1);
        }
        //执行sql2语句，修改表
        int count = statement2.executeUpdate();
        System.out.println("被修改的行为:" + count);
        ResultSet resultset2 = statement1.executeQuery();
        //继续查询
        while (resultset2.next()) {
            //每次循环获取一行
            int id = resultset2.getInt("id");
            String name = resultset2.getString("name");
            int count2 = resultset2.getInt("count");
            System.out.println("id = " + id + " name = " + name + " count = " + count2);
        }
        //释放资源
        try {
            statement1.close();
            statement2.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            statement1 = null;
            statement2 = null;
            connection = null;
        }

    }
}
