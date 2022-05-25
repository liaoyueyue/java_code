package BooksManagementSystem.BookListOperation;

import BooksManagementSystem.Book;
import BooksManagementSystem.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2022-05-25
 * Time: 16:31
 */
public class DelOperation implements IOperation{
    @Override
    public void word(BookList bookList) {
        System.out.println("删除图书");
        Scanner in = new Scanner(System.in);//创建键盘录入对象
        System.out.println("输入你需要删除图书的名字");
        String name = in.nextLine();
        int CurrentSize = bookList.getUsedsize();
        for (int i = 0; i < CurrentSize; i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)){
                System.out.println("已找到图书"+name);

                System.out.println("书籍"+name+"删除成功");
            }
        }

        bookList.setUsedsize(CurrentSize-1);//书架上书的数量-1

    }
}
