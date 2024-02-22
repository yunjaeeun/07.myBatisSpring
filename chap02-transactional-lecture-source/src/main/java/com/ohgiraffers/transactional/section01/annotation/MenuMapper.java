package com.ohgiraffers.transactional.section01.annotation;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;
import java.util.Map;

@Mapper
public interface MenuMapper {
    List<Menu> selectMenuByMenuCodes(Map<String, List<Integer>> map);
}
