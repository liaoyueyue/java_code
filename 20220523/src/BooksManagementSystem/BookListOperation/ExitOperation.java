package BooksManagementSystem.BookListOperation;

import BooksManagementSystem.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2022-05-25
 * Time: 16:34
 */
public class ExitOperation implements IOperation{
    @Override
    public void word(BookList bookList) {
        System.out.println("退出图书系统");
        System.exit(0);
    }
}
