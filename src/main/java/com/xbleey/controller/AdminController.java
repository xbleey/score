/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: AdminController
 * Author:   11580
 * Date:     2019/5/23 0023 14:19
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xbleey.controller;

import com.xbleey.entity.Admin;
import com.xbleey.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 11580
 * @create 2019/5/23 0023
 * @since 1.0.0
 */
@Controller
public class AdminController {
    @Autowired
    AdminService adminService;

    @PostMapping(value = "/login")
    public String login(Model model, @RequestParam(value = "username") String userName, @RequestParam(value = "password") String passWord, HttpSession session) {
        Admin admin =adminService.check(userName);
        if (admin!=null) {
            if(admin.getPassWord().equals(passWord)){
                session.setAttribute("loginUser", userName);
                return "index";
            }else {
                model.addAttribute("message","帐号或密码错误");
                return "login";
            }
        } else {
            model.addAttribute("message","没有这样的帐号");
            return "login";
        }
    }
}
 

