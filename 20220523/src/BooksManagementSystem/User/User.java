package BooksManagementSystem.User;

import BooksManagementSystem.BookList;
import BooksManagementSystem.BookListOperation.IOperation;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2022-05-25
 * Time: 16:41
 */
public abstract class User {
    protected String name;
    protected IOperation[] iOperations;//这里没发生初始化，没有分配大小
    public User(String name){
        this.name = name;
    }
    public abstract int menu();
    public void doOperation(int choice, BookList bookList){
        this.iOperations[choice].word(bookList);
    }
}
