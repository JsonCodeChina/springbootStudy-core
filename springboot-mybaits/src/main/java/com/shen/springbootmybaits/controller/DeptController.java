package com.shen.springbootmybaits.controller;

import com.shen.springbootmybaits.bean.Department;
import com.shen.springbootmybaits.bean.Employee;
import com.shen.springbootmybaits.mapper.DepartmentMapper;
import com.shen.springbootmybaits.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {

    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;

    @GetMapping("/dept/{id}")
    public Department getDepartment(@PathVariable("id") Integer id){
        return departmentMapper.getDeptByID(id);
    }


    @GetMapping("/dept")
    public Department insertDepartment(Department department){
        departmentMapper.insertDept(department);
        return department;
    }

    @GetMapping("/emp/{id}")
    public Employee getEmp(@PathVariable("id") Integer id){
        System.out.println("here is "+id);
        System.out.println(employeeMapper.getEmpById(id));
        return employeeMapper.getEmpById(id);
    }




}
