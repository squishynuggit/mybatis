package cn.happy.day01;

import cn.happy.dao.IBookDAO;
import cn.happy.dao.impl.BookInfoDAOImpl;
import cn.happy.pojo.BookInfo;
import org.junit.jupiter.api.Test;

import java.util.List;

public class test2024 {
    @Test
    public void test() throws Exception{
        // u cant do new bookDAO because it's abstract so
        // we have to use the implementation of this abstract class
        // which is BookInfoDAOImpl
        IBookDAO bookDAO = new BookInfoDAOImpl();
//        bookDAO.getBooks();
        List<BookInfo> list = bookDAO.getBooks();
        for (BookInfo info: list) {
            System.out.println(info.getName());
        }

    }
}
