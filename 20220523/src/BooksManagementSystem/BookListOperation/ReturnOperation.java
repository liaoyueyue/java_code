package BooksManagementSystem.BookListOperation;

import BooksManagementSystem.Book;
import BooksManagementSystem.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2022-05-25
 * Time: 16:37
 */
public class ReturnOperation implements IOperation{

    @Override
    public void word(BookList bookList) {
        System.out.println("归还图书");
        Scanner in = new Scanner(System.in);
        System.out.println("请输入你需要归还图书的名字");
        String name = in.nextLine();
        int CurrentSize = bookList.getUsedsize();
        for (int i = 0; i < CurrentSize; i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)){
                book.setIsborrowed(false);
                System.out.println("归还成功");
                return;
            }
        }
    }
}
