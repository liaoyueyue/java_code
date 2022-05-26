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
        int CurrentSize = bookList.getUsedsize();//获取实时图书数量
        for (int i = 0; i < CurrentSize; i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)){
                System.out.println("已找到图书"+name);//如果找到该图书则进行删除操作
                /**
                 * 如果需要删除图书，不能直接进行删除，为了之后的书的存放等等一些操作
                 * 需要试着把book的地址往前面挪，如删除books[2],则books[3]的地址放到books[2],books[4]的地址放到books[3]....
                 * 而且当前i的值就是需要删除的books的下标
                 */
                //下面分开讨论是因为当删除最后一本时，原有代码会越界访问数组
                if(i != BookList.MaxBook){//当删除的不是容量最后一本时
                    for (int j = i; j < CurrentSize - 1; j++) {
                        bookList.setBook(j, bookList.getBook(j + 1));
                    }
                }else{//但删除的为容量最后一本时
                    bookList.setBook(CurrentSize, null);
                }
                bookList.setUsedsize(CurrentSize-1);//书架上书的实时数量-1
                System.out.println("书籍"+name+"删除成功");
                return;
            }
        }
        System.out.println("未找到该图书，删除失败");
    }
}
