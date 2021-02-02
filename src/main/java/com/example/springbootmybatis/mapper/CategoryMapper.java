package com.example.springbootmybatis.mapper;


import com.example.springbootmybatis.pojo.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CategoryMapper {
    @Select("select * from category ")
    List<Category> findAll();

}
