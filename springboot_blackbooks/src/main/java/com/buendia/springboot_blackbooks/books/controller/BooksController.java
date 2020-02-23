package com.buendia.springboot_blackbooks.books.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.buendia.springboot_blackbooks.books.entity.Books;
import com.buendia.springboot_blackbooks.books.service.BooksService;
import com.buendia.springboot_blackbooks.vo.R;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2020-02-22
 */
@Api(value = "书籍操作", tags = "操作书籍")
@RestController
@RequestMapping("/books/books")
public class BooksController {

    @Autowired
    private BooksService booksService;

    @GetMapping("/all")
    public R all() {
        return R.ok(booksService.list().toString());
    }

    @PostMapping("/save")
    public R save(@RequestBody Books books){
        boolean save = booksService.save(books);
        if(save){
            return R.ok();
        }
        return R.fail("添加书籍失败");
    }

    @GetMapping("/page")
    public R page(int size,int page){
        return R.ok(booksService.page(new Page<>(page,size)));
    }

    @GetMapping("/books")
    public R query(String name){
        return R.ok(booksService.queryListByName(name));
    }


}
