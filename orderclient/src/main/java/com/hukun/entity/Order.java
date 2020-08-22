package com.hukun.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class Order {
    private Integer id;
    private Integer uid;
    private Integer mid;
    private Integer aid;
    private Date date;
    private Integer state;
}
