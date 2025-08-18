package com.zy.oa.organ.mapper;

import com.zy.oa.organ.model.Employee;

public interface EmployeeMapper {

    public void addEmployee(Employee employee);

    public Employee findEmployeeById(Long id);

}
