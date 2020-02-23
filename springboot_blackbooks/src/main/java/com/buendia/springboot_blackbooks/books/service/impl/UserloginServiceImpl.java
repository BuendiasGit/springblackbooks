package com.buendia.springboot_blackbooks.books.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.buendia.springboot_blackbooks.books.entity.Userlogin;
import com.buendia.springboot_blackbooks.books.dao.UserloginMapper;
import com.buendia.springboot_blackbooks.books.service.UserloginService;
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
public class UserloginServiceImpl extends ServiceImpl<UserloginMapper, Userlogin> implements UserloginService {

}
