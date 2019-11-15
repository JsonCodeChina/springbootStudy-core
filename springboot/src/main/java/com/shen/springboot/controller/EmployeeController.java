package com.shen.springboot.controller;


import com.shen.springboot.bean.Department;
import com.shen.springboot.bean.Employee;
import com.shen.springboot.dao.DepartmentDao;
import com.shen.springboot.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Email;
import java.util.Collection;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    DepartmentDao departmentDao;

    @GetMapping("/emps")
    public String list(Model model){

        Collection<Employee> all = employeeDao.getAll();
        model.addAttribute("emps",all);
        return "emp/list";
    }

    @GetMapping("/emp/{id}")
    public String editEmpToShow(@PathVariable("id") Integer id,Model model){

        Employee employee = employeeDao.get(id);
        model.addAttribute("emp",employee);


        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("deps",departments);

        return "emp/add";
    }

    @PostMapping("/emp")
    public String editEmpToPost(Employee employee){
        //System.out.println(employee);
        System.out.println("post");
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    @DeleteMapping("/emp/{id}")
    public String toDeleteEmp(@PathVariable("id") Integer id,Model model){

        System.out.println("ddddddd");
        employeeDao.delete(id);

        return "redirect:/emps";
    }


    @PutMapping("/emp")
    public String upadteEmployee(Employee employee){

        System.out.println("put");
        employeeDao.save(employee);

        return "redirect:/emps";
    }

    @GetMapping("/emp")
    public String toAddPage(Model model){
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("deps",departments);

        return "emp/add";
    }

}
