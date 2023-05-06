package src;

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.*;
import java.util.Scanner;

/**
* Created with IntelliJ IDEA.
* Description:JDBC插入Mysql数据库
* User: liaoyueyue
* Date: 2022-11-24
* Time: 19:22
*/
public class JDBCInsert {
    public static void main(String[] args) throws SQLException {
        //1、创建数据库对象
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource) dataSource).setURL("jdbc:mysql://127.0.0.1:3306/temp ? characterEncoding=utf8 & useSSL=false & serverTimezone=UTC");
        ((MysqlDataSource) dataSource).setUser("root");
        ((MysqlDataSource) dataSource).setPassword("111111");

        //2、让代码与数据库服务器进行连接
        Connection connection = dataSource.getConnection();
        System.out.println(connection);   //检查是否连接成功

        //3、构造要执行的sql语句
        Scanner in = new Scanner(System.in);
        System.out.println("输入新同学的id");
        int id = in.nextInt();
        System.out.println("输入同学的名字");
        String name = in.next();    //next()方法读取到空白符就结束，nextLine()读取到回车结束也就是“\r”

        String sql = "insert into staff values (?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql); //解析语句
        statement.setInt(1, id);
        statement.setString(2, name);
        System.out.println(statement);  //返回需要解析信息

        //4、执行sql语句
        int n = statement.executeUpdate();
        System.out.println("n = " + n); //返回修改的行数

        //5、释放资源
        statement.close();
        connection.close();

    }
}
