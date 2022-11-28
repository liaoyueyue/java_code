package ExperimentThree;
/**
 * Created with IntelliJ IDEA.
 * Description:测试类的用法
 * User: 严显鹏
 * class: 21软工本1
 * Date: 2022-11-20
 */

import java.time.LocalDate;

/**
 * 实验三(2)
 */
class Book{
    private String name;
    private String author;
    private String press;
    private boolean bookState;

    public Book(String book, String author, String press) {
        this.name = book;
        this.author = author;
        this.press = press;
    }

    //这里设置书籍的状态，true是借出，false是没有借出
    public void setBookState(boolean b){
        bookState = b;
    }

    //这里获取书籍的状态,没有设置默认是没有借出
    public void getBookState(){
        if (bookState == false) {
            System.out.println("书籍状态：没有借出");
        } else {
            System.out.println("书籍状态：已经被借出");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }
}

/**
 * 实验三(3)
 */
class Birthday {
    private int year;
    private int month;
    private int day;

    public Birthday(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //输出birthday对象值的方法
    public Birthday retFun(Birthday birthday) {
        return birthday;
    }

    //计算年龄
    public int retAge(Birthday birthday) {
        LocalDate now = LocalDate.now();
        return now.getYear()-this.year;
    }

}

public class TestClass {
    public static void main(String[] args) {

    }
}
