package BooksManagementSystem.BookListOperation;

import BooksManagementSystem.Book;
import BooksManagementSystem.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:查找图书，其实就是遍历书架（BookList）里的书（Book）
 * User: liaoyueyue
 * Date: 2022-05-25
 * Time: 16:29
 */
public class FindOperation implements IOperation{
    @Override
    public void word(BookList bookList) {
        System.out.println("查找图书");
        Scanner in = new Scanner(System.in);
        System.out.println("请输入你需要查找的图书");
        String name = in.nextLine();
        int CurrentSize = bookList.getUsedsize();
        for (int i = 0; i < CurrentSize; i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)){
                System.out.println("找到了"+name);
                return;
            }
        }
        System.out.println("没有这本书");
    }
}
