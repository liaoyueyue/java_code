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
 * Date: 2022-12-20
 * Time: 16:13
 */
public class JDBCSelect {
    public static void main(String[] args) throws SQLException {
        //1、建立数据库源对象
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setURL("jdbc:mysql://localhost:3306/temp?characterEncoding=UTF-8&useSSL=false&serverTimezone=UTC");
        ((MysqlDataSource) dataSource).setUser("root");
        ((MysqlDataSource) dataSource).setPassword("111111");

        //2、让代码与数据库建立连接
        Connection connection = dataSource.getConnection();
        System.out.println(connection);

        //3、构建sql语句
        String sql = "select * from staff";
        PreparedStatement statement = connection.prepareStatement(sql);
        System.out.println(statement);

        //4、执行sql语句
        /**
         * 查询语句需要使用executeQuery
         * 返回结果为 resultSet(结果集），类似表的结构
         */
        ResultSet resultSet = statement.executeQuery();

        //5、遍历结果集，打印相应结果
        while(resultSet.next()){
            //每次循环获取一行，从而获取每一行
            //getxxx 同时有一系列方法，用户需要根据自行使用相应方法
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            System.out.println("id = " + id + ", name = " + name);
        }

        //6、释放资源
        resultSet.close();
        statement.close();
        connection.close();

    }
}
