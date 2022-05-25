package BooksManagementSystem.BookListOperation;

import BooksManagementSystem.Book;
import BooksManagementSystem.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2022-05-25
 * Time: 16:33
 */
public class DisplayOperation implements IOperation {

    @Override
    public void word(BookList bookList) {
        System.out.println("显示图书");
        int CurrentSize = bookList.getUsedsize();
        for (int i = 0; i < CurrentSize; i++) {
            Book book = bookList.getBook(i);//从书架上拿出书让后打印
            System.out.println(book);
        }
    }
}
