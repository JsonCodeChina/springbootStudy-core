package com.shen.springbootmybaits.mapper;

import com.shen.springbootmybaits.bean.Employee;
import org.apache.ibatis.annotations.Mapper;

//@Mapper 将接口扫描到容器配置中
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}
