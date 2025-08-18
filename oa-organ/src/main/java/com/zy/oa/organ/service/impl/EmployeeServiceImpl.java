package com.zy.oa.organ.service.impl;

import com.zy.oa.organ.mapper.EmployeeMapper;
import com.zy.oa.organ.model.Employee;
import com.zy.oa.organ.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("employeeService")
public class EmployeeServiceImpl  implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    public void addEmployee(Employee employee) {
        employeeMapper.addEmployee(employee);
    }

    public Employee findEmployeeById(Long id) {
        return employeeMapper.findEmployeeById(id);
    }

}
