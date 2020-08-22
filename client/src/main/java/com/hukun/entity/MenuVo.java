package com.hukun.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class MenuVo {
    int code;
    String msg;
    int count;
    List<Menu> data;
}
