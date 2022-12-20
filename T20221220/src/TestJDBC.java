import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:测试JDBC用法，基于 JDBC 实现增删改查的 demo 程序
 * User: liaoyueyue
 * Date: 2022-12-20
 * Time: 13:38
 */
public class TestJDBC {
    public static void main(String[] args) throws SQLException {
        //创建数据源对象
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setURL("jdbc:mysql://localhost:3306/testJDBC?characterEncoding=UTF-8&useSSL=false&serverTimezone=UTC");
        ((MysqlDataSource) dataSource).setUser("root");
        ((MysqlDataSource) dataSource).setPassword("111111");

        //让代码和数据库建立连接
        Connection connection = dataSource.getConnection();
        System.out.println(connection);

        //打印菜单进行选择
        do {
            ment();
            Scanner scanner = new Scanner(System.in);
            while (!scanner.hasNextInt()){
                System.out.println("请输入整数");
            }
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addStudentInfo(connection);
                    break;
                case 2:
                    deleteStudentInfo(connection);
                    break;
                case 3:
                    updateStudentInfo(connection);
                    break;
                case 4:
                    queryStudentInfo(connection);
                    break;
                case 0:
                    exit(connection);//释放资源，退出程序
                    break;
                default:
                    System.out.println("暂时没有匹配的选择");
                    break;
            }
        } while (true);
    }

    public static void ment() {
        System.out.println("--------- JDBC-student --------");
        System.out.println("---------1、 添加学生信息 --------");
        System.out.println("---------2、 删除学生信息 --------");
        System.out.println("---------3、 修改学生信息 --------");
        System.out.println("---------4、 查询学生信息 --------");
        System.out.println("---------0、 退出本次程序 --------");
        System.out.println("-------------------------------");
    }


    /**
     * 添加学生信息
     */
    public static void addStudentInfo(Connection connection) throws SQLException {
        //[用户输入数据]
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要插入学生的编号");
        int id = scanner.nextInt();
        System.out.println("请输入需要插入学生的名字");
        String name = scanner.next();

        //构造sql语句 --使用?作为占位符，占个位置，后面替换
        String sql = "insert into student values (?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        statement.setString(2, name);
//        System.out.println(statement);

        //执行sql语句
        //   发送请求 & 读取相应
        //   executeUpdate  对应插入删除修改语句，返回值为该次SQL语句影响道德行数
        //   executeQuery   对应查询语句，返回值则是返回的临时表数据(resultSet)
        int rows = statement.executeUpdate();
        if (rows > 0) {
            System.out.println("添加学生信息成功");
        } else {
            System.out.println("添加学生信息失败");
        }

        //释放资源
        try {
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            statement = null;
        }
    }

    /**
     * 删除学生信息
     */
    public static void deleteStudentInfo(Connection connection) throws SQLException {
        System.out.println("学生信息如下:");
        queryStudentInfo(connection);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要删除学生的编号");
        int id = scanner.nextInt();

        String sql = "delete from student where id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);

        int rows = statement.executeUpdate();
        if (rows > 0) {
            System.out.println("删除学生信息成功");
        } else {
            System.out.println("删除学生信息失败");
        }

        try {
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            statement = null;
        }

    }

    /**
     * 修改学生信息
     */
    public static void updateStudentInfo(Connection connection) throws SQLException {
        System.out.println("学生信息如下:");
        queryStudentInfo(connection);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要修改学生的编号");
        int id = scanner.nextInt();
        System.out.println("请输入改学生的新名字");
        String name = scanner.next();

        String sql = "update student set name = ? where id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, name);
        statement.setInt(2, id);

        int rows = statement.executeUpdate();
        if (rows > 0) {
            System.out.println("修改学生信息成功");
        } else {
            System.out.println("修改学生信息失败");
        }

        try {
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            statement = null;
        }
    }

    /**
     * 查询学生信息
     */
    public static void queryStudentInfo(Connection connection) throws SQLException {
        String sql = "select * from student";
        PreparedStatement statement = connection.prepareStatement(sql);

        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            System.out.println("id = " + id + ", name = " + name);
        }

        try {
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            resultSet = null;
        }
        try {
            statement.close();
        }catch(SQLException e) {
            e.printStackTrace();
        }finally{
            statement = null;
        }

    }

    /**
     * 退出程序
     */
    public static void exit(Connection connection) throws SQLException {
        System.out.println("开始释放资源");
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            connection = null;
        }
        System.out.println("程序结束");
        System.exit(0);
    }

}
