package cn.happy.dao.impl;

import cn.happy.dao.IBookDAO;
import cn.happy.pojo.BookInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class BookInfoDAOImpl implements IBookDAO {

    @Override
    public List<BookInfo> getBooks() throws Exception {

        String path = "mybatis-config.xml";
        InputStream is = Resources.getResourceAsStream(path);

        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(is);
        SqlSession session = factory.openSession();
        List<BookInfo> list = session.selectList("getBooks");
        return list;
    }
}