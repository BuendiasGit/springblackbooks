package com.buendia.springboot_blackbooks.books.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.buendia.springboot_blackbooks.books.entity.Users;
import com.buendia.springboot_blackbooks.books.dao.UsersMapper;
import com.buendia.springboot_blackbooks.books.service.UsersService;
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
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {

}
