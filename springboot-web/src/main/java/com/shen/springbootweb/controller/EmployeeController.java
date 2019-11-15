package com.shen.springbootweb.controller;

import com.shen.springbootweb.dao.DepartmentDao;
import com.shen.springbootweb.dao.EmployeeDao;
import com.shen.springbootweb.entities.Department;
import com.shen.springbootweb.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    DepartmentDao departmentDao;

    @GetMapping("/emps")
    public String list(Model model){

        Collection<Employee> employees = employeeDao.getAll();

        model.addAttribute("emps",employees);

        return "emp/list";
    }

    @GetMapping("/emp")
    public String toAddPage(Model model){
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("deps",departments);

        return "emp/add";
    }

    @PostMapping("/emp")
    public String addEmp(Employee employee){

        System.out.println(employee);
        employeeDao.save(employee);
        //redirect:表示重定向一个地址
        //forward:表示转发到一个地址
        return "redirect:/emps";
    }

    @GetMapping("/emp/{id}")
    public String toEidtEmp(@PathVariable("id") Integer id,Model model){

        Employee employee = employeeDao.get(id);
        model.addAttribute("emp",employee);

        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("deps",departments);

        return "emp/add";
    }

    @DeleteMapping("/emp/{id}")
    public String toDeleteEmp(@PathVariable("id") Integer id,Model model){

        employeeDao.delete(id);

        return "redirect:/emps";
    }


    @PutMapping("/emp")
    public String upadteEmployee(Employee employee){

        employeeDao.save(employee);

        return "redirect:/emps";
    }
}
