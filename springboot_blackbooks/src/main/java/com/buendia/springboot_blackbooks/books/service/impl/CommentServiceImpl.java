package com.buendia.springboot_blackbooks.books.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.buendia.springboot_blackbooks.books.entity.Comment;
import com.buendia.springboot_blackbooks.books.dao.CommentMapper;
import com.buendia.springboot_blackbooks.books.service.CommentService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-02-22
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
