package com.company.db;


import com.company.db.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author wangzhj
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-rw.xml"})
public class ReadWriteTest {

    private static final Logger logger = LoggerFactory.getLogger(ReadWriteTest.class);

    @Autowired
    private OrderService orderService;

    @Test
    public void test_add() {
        String name = "我是写写库";
        orderService.add(1L, name);
    }

    @Test
    public void test_get() {
        orderService.get(1L);
    }

    @Test
    public void test_find() {
        orderService.find(1L);
    }

    @Test
    public void test_findLt() {

//        for(int i = 0; i < 2; i++){
            orderService.findLt(1L, false);
//        }
    }


    @Test
    public void test(){
        int type = 5;
        System.out.println(type != 6 && type != 7 && type != 8);
    }
}
