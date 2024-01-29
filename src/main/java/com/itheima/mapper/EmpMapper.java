package com.itheima.mapper;

import com.itheima.pojo.Emp;
import com.itheima.pojo.PageBean;
import org.apache.ibatis.annotations.Mapper;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface EmpMapper {
    public void update(Emp emp);

    Emp getById(Integer id);

    List<Emp> getByPage(String name, Short gender, LocalDate begin, LocalDate end);

    void deleteByIds(List<Integer> ids);

    Emp login(Emp emp);
}

