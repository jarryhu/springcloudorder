package com.hukun.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (TUser)实体类
 *
 * @author makejava
 * @since 2020-08-24 12:34:05
 */
@Data
@NoArgsConstructor
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




}