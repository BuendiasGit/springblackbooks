package com.buendia.springboot_blackbooks.books.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.buendia.springboot_blackbooks.books.entity.Orders;
import com.buendia.springboot_blackbooks.books.dao.OrdersMapper;
import com.buendia.springboot_blackbooks.books.service.OrdersService;
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
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements OrdersService {

}
