import javax.swing.JOptionPane;

import static javax.swing.JOptionPane.WARNING_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_CANCEL_OPTION;

/**
 * Created with IntelliJ IDEA.
 * Description:测试异常的使用
 * User: liaoyueyue
 * Date: 2022-12-06
 * Time: 15:54
 */

class 负分异常 extends Exception{    //当录入了负分时。此处应用了自定义异常
    负分异常(int i) {
        System.out.println("分数为负数");
    }

}

class 高分异常 extends Exception{  //当录入分超过100时。应用了自定义异常

    高分异常(int i) {
        System.out.println("分数过高");
    }

}

public class ExceptionDemo {
    static final int number = 2;
    int score[] = new int[number];

    public void 检查分数(int 分数) throws 负分异常, 高分异常{        //下面方法中判断如果录入的成绩不合理，则抛出异常，但本方法并不处理异常，仅声明了异常

        if (分数 > 100) throw new 高分异常(分数);   //通过throw，人工抛出异常
        if (分数 < 0) throw new 负分异常(分数);
    }

    public void 录入成绩() {
        int i;
        for (i = 0; i < number; i++) {
            try {
                score[i] = Integer.parseInt(JOptionPane.showInputDialog("请输入第" + (i + 1)
                        + "个同学的成绩"));
            } catch (NumberFormatException e){    //在try{…….}catch间的语句中若产生异常，则捕获异常，直接进行异常处理
                //write
                JOptionPane.showMessageDialog(null, "警告\n您输入了非法字符","提示", WARNING_MESSAGE);
                JOptionPane.showConfirmDialog(null, "选择\n是否重新输入该同学成绩", "提示", YES_NO_CANCEL_OPTION);

                System.out.println(e.getMessage());
            }

            //开始检查同学的分数
            try {
                检查分数(score[i]);       //在检查分数模块中，可能产生高分异常对象，也可能产生低分异常对象，根据不同情况，进行不同处理
            } catch (高分异常 e) {
                System.out.println(e);
                //write
            } catch (负分异常 e) {
                System.out.println(e);
                //write

            }
        }
    }

    public void 输出成绩() {

        System.out.println(score[0]);
        System.out.println(score[1]);

        //write

    }

    public static void main(String arg[]) {
        ExceptionDemo demo = new ExceptionDemo();
        demo.录入成绩();
        demo.输出成绩();
    }
}

