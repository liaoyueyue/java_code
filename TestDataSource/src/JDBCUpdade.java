package src;

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.*;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:JDBC更新Mysql数据库
 * User: liaoyueyue
 * Date: 2022-11-25
 * Time: 22:48
 */
public class JDBCUpdade {
    public static void main(String[] args) throws SQLException {
        //1、创建数据源对象
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource) dataSource).setURL("jdbc:mysql://127.0.0.1:3306/temp ? characterEncoding=utf8 & useSSL=false & serverTimezone=UTC");
        ((MysqlDataSource) dataSource).setUser("root");
        ((MysqlDataSource) dataSource).setPassword("111111");

        //2、连接数据库
        Connection connection = dataSource.getConnection();
        System.out.println(connection); //判断是否连接成功

        //3、构建语句
        Scanner in = new Scanner(System.in);
        System.out.println("输入要修改同学的id");
        int id = in.nextInt();
        System.out.println("输入新名字");
        String name = in.next();    //next()方法读取到空白符就结束，nextLine()读取到回车结束也就是“\r”

        String sql = "update staff set name = ? where id = ?";  //这里'?'表示占位符,之后会进行替换
        PreparedStatement statement = connection.prepareStatement(sql);
        System.out.println(statement);
        statement.setString(1, name);
        statement.setInt(2, id);

        //4、执行语句
        int n = statement.executeUpdate();  //这会返回被影响的行数
        System.out.println("被影响的行数 = " + n);

        //5、进行资源回收
        statement.close();
        connection.close();
    }
}
