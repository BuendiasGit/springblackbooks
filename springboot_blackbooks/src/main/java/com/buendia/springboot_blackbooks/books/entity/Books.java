package com.buendia.springboot_blackbooks.books.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

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
public class Books extends Model<Books> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "bkid", type = IdType.AUTO)
    private Integer bkid;

    /**
     * 书本类别
     */
    private Integer bkclass;

    /**
     * 书本名
     */
    private String bkname;

    /**
     * 书本作者
     */
    private String bkauthor;

    /**
     * 出版社
     */
    private String bkpublisher;

    /**
     * 书籍地址
     */
    private String bkfile;

    /**
     * 书籍封面地址
     */
    private String bkcover;

    /**
     * 书本价格
     */
    private Integer bkprice;


    @Override
    protected Serializable pkVal() {
        return this.bkid;
    }

}
