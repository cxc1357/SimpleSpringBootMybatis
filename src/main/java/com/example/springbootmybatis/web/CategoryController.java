package com.example.springbootmybatis.web;

import com.example.springbootmybatis.mapper.CategoryMapper;
import com.example.springbootmybatis.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CategoryController {
    @Autowired
    CategoryMapper categoryMapper;
    @RequestMapping("/listCategory")
    public String listCategory(Model m) throws Exception{
        List<Category> cs = categoryMapper.findAll();
        m.addAttribute("cs",cs);
        return "listCategory";
    }
}
