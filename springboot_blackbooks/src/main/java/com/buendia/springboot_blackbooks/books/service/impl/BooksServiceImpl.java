package com.buendia.springboot_blackbooks.books.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.buendia.springboot_blackbooks.books.entity.Books;
import com.buendia.springboot_blackbooks.books.dao.BooksMapper;
import com.buendia.springboot_blackbooks.books.service.BooksService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-02-22
 */
@Service
public class BooksServiceImpl extends ServiceImpl<BooksMapper, Books> implements BooksService {

    /**
     * 模糊查询
     * @param name
     * @return
     */
    @Override
    public List<Books> queryListByName(String name) {
        QueryWrapper<Books> wrapper = new QueryWrapper<>();
        if(name!=null && name.length()!=0){
            //使用条件构造器编辑查询条件
            wrapper.like("bkname","%"+name+"%").or().like("bkauthor","%"+name+"%");
        }

        return getBaseMapper().selectList(wrapper);
    }
}
