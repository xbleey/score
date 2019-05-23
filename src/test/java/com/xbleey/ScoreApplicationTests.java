package com.xbleey;

import com.xbleey.dao.AdminDao;
import com.xbleey.entity.Admin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ScoreApplicationTests {

    @Autowired
    AdminDao adminDao;

    @Test
    public void testAdmin() {
        List<Admin> admins =adminDao.findAll();
        for(Admin admin:admins){
            System.out.println(admin.toString());
        }
    }

}
