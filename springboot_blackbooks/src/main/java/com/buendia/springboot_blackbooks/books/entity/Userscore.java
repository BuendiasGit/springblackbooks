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
public class Userscore extends Model<Userscore> {

    private static final long serialVersionUID = 1L;

    private String uid;

    private Integer score;

    private String info;

    private LocalDateTime ctime;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
