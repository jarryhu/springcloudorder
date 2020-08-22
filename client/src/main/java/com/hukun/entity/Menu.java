package com.hukun.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (TMenu)实体类
 *
 * @author makejava
 * @since 2020-08-21 10:56:22
 */
@Data
@NoArgsConstructor
public class Menu implements Serializable {
    private static final long serialVersionUID = -93464284205018557L;

    private Integer id;

    private String name;

    private Object price;

    private String flavor;

    private Type type;


}