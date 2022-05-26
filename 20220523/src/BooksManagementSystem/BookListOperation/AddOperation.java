package BooksManagementSystem.BookListOperation;

import BooksManagementSystem.Book;
import BooksManagementSystem.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:添加图书，其实就是创建一本新的书(Book)让后放进书架(BookList)里
 * User: liaoyueyue
 * Date: 2022-05-25
 * Time: 16:28
 */
public class AddOperation implements IOperation{

    @Override
    public void word(BookList bookList) {
        int CurrentSize = bookList.getUsedsize();//读取当前实时图书数量
        if(CurrentSize == BookList.MaxBook){
            System.out.println("当前图书已达上限，需要进行扩容或者进行删除");
            return;
        }
        System.out.println("新增图书");
        Scanner in = new Scanner(System.in);//创建键盘录入对象
        System.out.println("输入你需要添加图书的名字");
        String name = in.nextLine();
        System.out.println("输入你需要添加图书的作者");
        String author = in.nextLine();
        System.out.println("输入你需要添加图书的价格");
        double price = in.nextDouble();
        String temp = in.nextLine();//这里回收一下换行符"\n"
        temp = null;//释放该变量内存
        System.out.println("输入你需要添加图书的类型");
        String type = in.nextLine();
        Book book = new Book(name, author, price, type);//创建一本新的完整的书
        bookList.setBook(CurrentSize, book);//往书架上添加书
        bookList.setUsedsize(CurrentSize+1);//书架上书的数量+1
        System.out.println("书籍"+name+"新增成功");
}

/*
        旧代码，这个方法可以直接把从键盘输入的数据直接存进book对应的类型中，但是利用之前构造好的book方法更易读
        System.out.println("新增图书");
        Scanner in = new Scanner(System.in);//创建键盘录入对象
        int CurrentSize = bookList.getUsedsize();
        System.out.println("输入你需要添加图书的名字");
        bookList.getBook(CurrentSize).setName(in.nextLine());
        System.out.println("输入你需要添加图书的作者");
        bookList.getBook(CurrentSize).setAuthor(in.nextLine());
        System.out.println("输入你需要添加图书的价格");
        bookList.getBook(CurrentSize).setPrice(in.nextDouble());
        System.out.println("输入你需要添加图书的类型");
        bookList.getBook(CurrentSize).setType(in.nextLine());
        bookList.setUsedsize(CurrentSize+1);
        System.out.println("新增成功");*/
}