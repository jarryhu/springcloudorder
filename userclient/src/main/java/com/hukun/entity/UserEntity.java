package com.hukun.entity;

import java.io.Serializable;

/**
 * (TUser)实体类
 *
 * @author makejava
 * @since 2020-08-24 12:34:05
 */
public class UserEntity implements Serializable {
    private static final long serialVersionUID = -50104201039319636L;

    private Integer id;

    private String username;

    private String password;

    private String nickname;

    private String gender;

    private String telephone;

    private Object registerdate;

    private String address;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Object getRegisterdate() {
        return registerdate;
    }

    public void setRegisterdate(Object registerdate) {
        this.registerdate = registerdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}