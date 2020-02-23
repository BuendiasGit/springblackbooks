package com.buendia.springboot_blackbooks.books.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.buendia.springboot_blackbooks.books.entity.Books;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jobob
 * @since 2020-02-22
 */
public interface BooksService extends IService<Books> {

    List<Books> queryListByName(String name);

}
