package com.buendia.springboot_blackbooks.books.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.buendia.springboot_blackbooks.books.entity.Userscore;
import com.buendia.springboot_blackbooks.books.dao.UserscoreMapper;
import com.buendia.springboot_blackbooks.books.service.UserscoreService;
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
public class UserscoreServiceImpl extends ServiceImpl<UserscoreMapper, Userscore> implements UserscoreService {

}
