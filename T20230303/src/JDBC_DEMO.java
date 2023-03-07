import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:学生信息管理系统
 * User: liaoyueyue
 * Date: 2023-03-03
 * Time: 20:37
 */
public class JDBC_DEMO {
    public static void main(String[] args) throws SQLException {
        //建立数据库源对象
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl("jdbc:mysql://localhost:3306/testjdbc?characterEncoding=UTF-8&useSSL=false&serverTimezone=Asia/Shanghai");
        ((MysqlDataSource) dataSource).setUser("root");
        ((MysqlDataSource) dataSource).setPassword("111111");
        //代码与数据库连接
        Connection connection = dataSource.getConnection();
        System.out.println(connection);

        Scanner in = new Scanner(System.in);
        //用户登录界面
        do {
            SignInMenu();
            int n = 0;
            if (in.hasNextInt()) {
                n = in.nextInt();
            }else {
                System.out.println("输入非法字符");
                break;
            }
            switch (n) {
                case 0:
                    exit(connection);//这里会直接回收资源并退出程序
                    break;
                case 1:
                    boolean flag = login(connection);
                    if (flag) {
                        secondaryMenu(connection);
                    }
                    break;
                case 2:
                    logon(connection);
                    break;
                default:
                    System.out.println("没有改选项");
                    break;
            }
        } while (true);
    }

    private static void secondaryMenu(Connection connection) throws SQLException {
        Scanner in = new Scanner(System.in);
        //学生信息管理系统
        do {
            StudentManagementmenu();
            int m = 0;
            if (in.hasNextInt()) {
                m = in.nextInt();
            } else {
                System.out.println("输入非法字符");
                break;
            }
            switch (m) {
                case 0:
                    exit(connection);
                    break;
                case 1:
                    addStudentInfo(connection);
                    break;
                case 2:
                    delStudentInfo(connection);
                    break;
                case 3:
                    updateStudentInfo(connection);
                    break;
                case 4:
                    queryStudentInfo(connection);
                    break;
                default:
                    System.out.println("不存在该选项");
                    break;
            }
        } while (true);
    }


    private static void logon(Connection connection) throws SQLException {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入要注册的账号");
        String username = in.next();
        System.out.println("请输入密码");
        String password = in.next();
        String sql = "insert into user values (default, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, username);
        statement.setString(2, password);
        int rows = statement.executeUpdate();
        if (rows > 0) {
            System.out.println("添加账号成功");
        } else {
            System.out.println("添加账号失败");
        }
        try {
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            statement = null;
        }
    }

    private static boolean login(Connection connection) throws SQLException {
        Scanner in = new Scanner(System.in);
        System.out.println("进入登录界面");
        System.out.println("请输入账号");
        String username = in.next();
        System.out.println("请输入密码");
        String password = in.next();
        String sql = "select username, password from user";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            if (resultSet.getString("username").compareTo(username) == 0 && resultSet.getString("password").compareTo(password) == 0) {
                System.out.println("登录成功");
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                    statement = null;
                }
                return true;
            }
        }
        System.out.println("没有此账号或者密码");
        try {
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            statement = null;
        }
        return false;
    }

    private static void queryStudentInfo(Connection connection) throws SQLException{
        String sql = "select * from student";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet  resultSet = statement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String sex = resultSet.getString("sex");
            String Sclass = resultSet.getString("class");
            System.out.println("id: " + id + " name: " + name + " sex: " + sex + " class: " + Sclass);
        }
    }

    private static void updateStudentInfo(Connection connection) throws SQLException {
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

    private static void delStudentInfo(Connection connection) throws SQLException {
        Scanner in = new Scanner(System.in);
        System.out.println("学生信息如下:");
        queryStudentInfo(connection);
        System.out.println("请输入要删除学生的学号");
        int id = in.nextInt();
        String sql = "delete from student where id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        int rows  = statement.executeUpdate();
        if (rows > 0) {
            System.out.println("删除学生成功");
        }else {
            System.out.println("删除学生失败");
        }
        try {
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            statement = null;
        }
    }

    private static void addStudentInfo(Connection connection) throws SQLException {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入学生的姓名");
        String name = in.next();
        System.out.println("请输入学生的性别（男/女）");
        String sex = in.next();
        System.out.println("请输入学生的班级");
        String sClass = in.next();
        String sql = "insert into student values (default, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, name);
        statement.setString(2, sex);
        statement.setString(3, sClass);
        int rows = statement.executeUpdate();
        if (rows > 0) {
            System.out.println("添加学生成功");
        } else {
            System.out.println("添加学生失败");
        }
        try {
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            statement = null;
        }
    }

    private static void exit(Connection connection) {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
          connection = null;
        }
        System.exit(0);
        System.out.println("程序已经退出");
    }

    private static void StudentManagementmenu() {
        System.out.println("--------- 学生信息管理系统 --------");
        System.out.println("-------- 1、 添加学生信息 --------");
        System.out.println("-------- 2、 删除学生信息 --------");
        System.out.println("-------- 3、 修改学生信息 --------");
        System.out.println("-------- 4、 查询学生信息 --------");
        System.out.println("-------- 0、 退出本次程序 --------");
        System.out.println("--------------------------------");
    }

    private static void SignInMenu() {
        System.out.println("--------- 登录界面 --------");
        System.out.println("-------- 1、 登录 --------");
        System.out.println("-------- 2、 注册 --------");
        System.out.println("-------- 0、 退出 --------");
        System.out.println("-------------------------");

    }
}
