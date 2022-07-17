package com.tianque;

import com.tianque.entity.Department;
import com.tianque.entity.User;
import com.tianque.mapper.DepartmentMapper;
import com.tianque.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

/**
 * @author fades
 * @description
 * @date 2022/7/10 17:32
 */

@SpringBootTest(classes = TestDemo_01Application.class)
public class TestDemo_01ApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private DepartmentMapper departmentMapper;

    @Test
    public void selectTest(){
        List<User> list = userMapper.selectList(null);
        list.forEach(System.out::println);
    }

    @Test
    public void insertTest(){
        User tb_newbee_mall_user = new User();
        tb_newbee_mall_user.setUser_id(7);
        tb_newbee_mall_user.setNick_name("fades");
        tb_newbee_mall_user.setAddress("河南省信阳市固始县湖畔春天三期T17");
        int rows = userMapper.insert(tb_newbee_mall_user);
        System.out.println("影响了"+rows+"行");
    }

    @Test
    public void selectDeptTest(){
        Department department = new Department();
        List<Department> departmentList = departmentMapper.selectList(null);
        departmentList.forEach(System.out::println);
    }
}
