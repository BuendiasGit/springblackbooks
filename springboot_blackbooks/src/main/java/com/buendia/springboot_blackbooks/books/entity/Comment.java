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
public class Comment extends Model<Comment> {

    private static final long serialVersionUID = 1L;

    /**
     * 评论id
     */
    @TableId(value = "cmid", type = IdType.AUTO)
    private Integer cmid;

    /**
     * 用户openid
     */
    private String uid;

    /**
     * 用户名
     */
    private String uname;

    /**
     * 平均内容
     */
    private String ccontent;

    /**
     * 书籍名
     */
    private String bkname;

    /**
     * 书籍id
     */
    private Integer bkid;

    /**
     * 用户头像
     */
    private String uavarta;

    /**
     * 评论时间
     */
    private LocalDateTime ctime;


    @Override
    protected Serializable pkVal() {
        return this.cmid;
    }

}
