package com.buendia.springboot_blackbooks.books.entity;

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
public class Users extends Model<Users> {

    private static final long serialVersionUID = 1L;

    /**
     * 小程序下发给用户的openid
     */
    private String uid;

    /**
     * 用户的微信名
     */
    private String uname;

    /**
     * 用户的性别
     */
    private Integer ugender;

    /**
     * 用户地址
     */
    private String uaddress;

    /**
     * 用户积分余额
     */
    private Integer ubalance;

    /**
     * 用户头像
     */
    private String uavarta;

    /**
     * 用户的skey，应用分配的值
     */
    private String skey;

    /**
     * 微信下发的session_key
     */
    private String sessionkey;

    /**
     * 注册时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
