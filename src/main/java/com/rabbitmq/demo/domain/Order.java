package com.rabbitmq.demo.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * Created by Enzo Cotter on 2019/11/15.
 */

@Data
@TableName(value = "order")
public class Order implements Serializable {
    @TableId(value = "id", type = IdType.INPUT)
    private Integer id;

    @TableField(value = "name")
    private String name;

    @TableField(value = "message_id")
    private Integer messageId;

    private static final long serialVersionUID = 1L;
}