package com.sharding.jdbc.shardingjdbc.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_order")
public class Order {

    @TableId(type = IdType.AUTO)
    private Integer id;
    @TableField(value = "order_id")
    private Integer OrderId;
    @TableField(value = "user_name")
    private String userName;
    @TableField(value = "money")
    private Integer money;
}
