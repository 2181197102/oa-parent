package com.zy.oa.organ.service;

import com.zy.oa.organ.model.Employee;

public interface EmployeeService {

    public void addEmployee(Employee employee);

    public Employee findEmployeeById(Long id);

}
