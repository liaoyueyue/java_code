import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2022-11-27
 * Time: 16:40
 */

class BankAccount {
    private String account;
    private String name;
    private LocalDateTime openingTime = LocalDateTime.now();
    private String idCard;
    private double balance;

    public BankAccount(String account, String name, String idCard) {
        this.account = account;
        this.name = name;
        this.idCard = idCard;
    }

    public void deposit() {
        double money;
        Scanner in = new Scanner(System.in);
        System.out.println("输入你要存入的金额");
        money = in.nextDouble();
        balance += money;
        System.out.println("存入"+ money + "，您现在金额为：" +  balance);
    }

    public void drawMoney() {
        double money;
        Scanner in = new Scanner(System.in);
        System.out.println("输入你要存入的金额");
        money = in.nextDouble();
        balance -= money;
        System.out.println("取出"+ money + "，您现在金额为：" +  balance);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "account='" + account + '\'' +
                ", name='" + name + '\'' +
                ", openingTime=" + openingTime +
                ", idCard='" + idCard + '\'' +
                ", balance=" + balance +
                '}';
    }
}

public class Example2 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("123456", "张三", "421000000000000000");
        System.out.println(bankAccount.toString());
        bankAccount.deposit();
        bankAccount.drawMoney();
        System.out.println(bankAccount.toString());
    }
}
