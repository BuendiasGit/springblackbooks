package com.buendia.springboot_blackbooks.books.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author jobob
 * @since 2020-02-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Orders extends Model<Orders> {

    private static final long serialVersionUID = 1L;

    /**
     * 订单主键
     */
    @TableId(value = "oid", type = IdType.AUTO)
    private Integer oid;

    /**
     * 用户openid
     */
    private String uid;

    /**
     * 订单支付价格
     */
    private Integer oprice;

    /**
     * 订单创建时间
     */
    private LocalDateTime otime;

    /**
     * 书籍id
     */
    private Integer bkid;


    @Override
    protected Serializable pkVal() {
        return this.oid;
    }

}
