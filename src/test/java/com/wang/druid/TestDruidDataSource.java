package com.wang.druid;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Description: 测试数据源配置是否生效
 * @Author : 王俊
 * @date :  2020/11/18
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TestDruidDataSource {

    @Autowired
    private DataSource dataSource;

    @Test
    public void testDruid() throws SQLException {
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
            System.out.println("druid连接池:>>>" + connection);
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }finally {
            connection.close();
        }
    }
}
