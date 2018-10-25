package com.xtj.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionFactoryUtils {

    private static final String RESOURCE = "mybatis-conf.xml";

    private static ThreadLocal<SqlSession> threadLocal = new ThreadLocal<>();

    private static SqlSessionFactory factory;

    public static void initSqlSessionFactory() {
        try {
            InputStream is = Resources.getResourceAsStream(RESOURCE);
            factory = new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSessionFactory getFactory() {
        return factory;
    }

    public static void close() {
        SqlSession session = threadLocal.get();
        if (session != null) {
            session.close();
            threadLocal.set(null);
        }
    }
}
