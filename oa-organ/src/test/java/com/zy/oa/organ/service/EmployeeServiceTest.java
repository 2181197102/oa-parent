package com.zy.oa.organ.service;

import com.zy.oa.organ.model.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@ContextConfiguration(locations = {"classpath:application-organ.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class EmployeeServiceTest {

    @Autowired
    private EmployeeService employeeService;

    @Test
    public void testAddEmployee() {
        Employee employee = new Employee();
        employee.setName("王五");
        employee.setAge(27);
        employeeService.addEmployee(employee);
    }

}
