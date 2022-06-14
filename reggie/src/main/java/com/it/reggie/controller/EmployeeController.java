package com.it.reggie.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.it.reggie.common.Result;
import com.it.reggie.pojo.Employee;
import com.it.reggie.mapper.EmployeeMapper;
import com.it.reggie.service.EmployeeService;
import com.it.reggie.service.impl.EmployeeServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


@Slf4j
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    //员工登录
    @PostMapping("/login")
    public Result<Employee> login(HttpServletRequest request, @RequestBody Employee employee) {

        

       return null;
    }

    /*@PostMapping("/logout")
    public Result<String> logout(HttpServletRequest request) {
        // 清除session中的对象
        request.removeAttribute("employee");
        return Result.success("退出成功");
    }

    @PostMapping
    public Result<String> save(HttpServletRequest request, @RequestBody Employee employee) {
        // 创建初始密码
        employee.setPassword(DigestUtils.md5DigestAsHex("123456".getBytes()));

//        employee.setCreateTime(LocalDateTime.now());
//        employee.setUpdateTime(LocalDateTime.now());
//
//        // 获取添加人的id
//        Employee em = employeeService.getById(((Employee) request.getSession().getAttribute("employee")).getId());
//        employee.setCreateUser(em.getId());
//        employee.setUpdateUser(em.getId());

        boolean save = employeeService.save(employee);
        return Result.success("新增员工成功");
    }

    @GetMapping("/page")
    public Result<Page> findPage(int page, int pageSize, String name) {
        // 构建分页
        Page<Employee> pageInfo = new Page<>(page, pageSize);
        QueryWrapper<Employee> wrapper = new QueryWrapper<>();
        // 判断是否需要进行条件查询
        if (!StringUtils.isEmpty(name)) {
            wrapper.like("username", name);
        }
        wrapper.orderByDesc("update_time");
        employeeService.page(pageInfo, wrapper);
        // 通过查看Page的属性 可以将其直接返回
        return Result.success(pageInfo);
    }

    @PutMapping
    public Result<String> update(HttpServletRequest request, @RequestBody Employee employee) {
//        // 获取管理员的id
//        Employee em = (Employee) request.getSession().getAttribute("employee");
//        employee.setUpdateUser(em.getId());
//        employee.setUpdateTime(LocalDateTime.now());

        employeeService.updateById(employee);

        return Result.success("员工信息修改成功");
    }

    @GetMapping("/{id}")
    public Result<Employee> getById(@PathVariable("id") Long id) {
        Employee em = employeeService.getById(id);
        if (em == null) {
            return Result.error("没有查到员工的信息");
        }
        return Result.success(em);
    }*/
}
