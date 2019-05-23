/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: AdminService
 * Author:   11580
 * Date:     2019/5/23 0023 14:12
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xbleey.service;

import com.xbleey.dao.AdminDao;
import com.xbleey.entity.Admin;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 11580
 * @create 2019/5/23 0023
 * @since 1.0.0
 */
@Service
public class AdminService {
    @Resource
    AdminDao adminDao;

    public List<Admin> findAll() {
        return adminDao.findAll();
    }

    public Admin check(String userName) {
        List<Admin> admins = adminDao.findByUserName(userName);
        if (!admins.isEmpty()) {
            return admins.get(0);
        } else {
            return null;
        }
    }
}
 

