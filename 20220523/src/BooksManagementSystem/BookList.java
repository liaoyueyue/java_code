package BooksManagementSystem;

/**
 * Created with IntelliJ IDEA.
 * Description:书架这个类
 * User: liaoyueyue
 * Date: 2022-05-22
 * Time: 22:46
 */

public class BookList {
    public static final int MaxBook = 10;//书架的最大书的数量
    private Book[] books = new Book[MaxBook];//定义一个10本数的书架
    private int usedsize;//记录实时书的数量

    public BookList(){  //书架原本2本书
        books[0] = new Book("西游记", "吴承恩", 120, "小说");
        books[1] = new Book("三国演义", "罗贯中", 120, "小说");
        books[2] = new Book("红楼梦", "曹雪芹", 120, "小说");
        usedsize = 3;
    }

    public Book getBook(int pos){   //获取书
        return books[pos];
    }

    public void setBook(int pos, Book book){    //设置书
        books[pos] = book;
    }

    public int getUsedsize(){   //获取书的实时数量
        return usedsize;
    }

    public void setUsedsize(int size){   //修改书的数量
        usedsize = size;
    }


}
