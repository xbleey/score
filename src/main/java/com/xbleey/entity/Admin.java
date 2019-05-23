/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: Admin
 * Author:   11580
 * Date:     2019/5/23 0023 14:08
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xbleey.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author 11580
 * @create 2019/5/23 0023
 * @since 1.0.0
 */
@Entity
@Table(name = "administrator")
public class Admin {
    @Id
    @Column(name = "adminid",unique = true)
    private Integer adminId;
    @Column(name = "username")
    private String userName;
    @Column(name = "password")
    private String passWord;
    private String state;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminId=" + adminId +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}

 

