package BooksManagementSystem.BookListOperation;

import BooksManagementSystem.Book;
import BooksManagementSystem.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2022-05-25
 * Time: 16:35
 */
public class BorrowOperation implements IOperation{
    @Override
    public void word(BookList bookList) {
        System.out.println("借阅图书");
        Scanner in = new Scanner(System.in);
        System.out.println("请输入你需要借阅图书的名字");
        String name = in.nextLine();
        int CurrentSize = bookList.getUsedsize();
        for (int i = 0; i < CurrentSize; i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)){
                book.setIsborrowed(true);
                System.out.println("借阅成功");
                return;
            }
        }
    }
}
