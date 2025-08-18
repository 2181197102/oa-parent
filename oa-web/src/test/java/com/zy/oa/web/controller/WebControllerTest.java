package com.zy.oa.web.controller;

import com.zy.oa.auth.model.Authorization;
import com.zy.oa.flow.model.Application;
import com.zy.oa.organ.model.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-web.xml", "classpath:spring-servlet.xml"})
@WebAppConfiguration
public class WebControllerTest {

    @Resource
    private WebController webController;

    @Test
    public void testAddEmployee() {
        // Create a new Employee object
        Employee employee = new Employee();
        employee.setName("赵六");
        employee.setAge(45);

        // Call the addEmployee method
        String result = webController.addEmployee(employee);

        // Assert the result
        assert "Employee added successfully".equals(result) : "Expected success message";
    }

    @Test
    public void testAuthorize() {
        // Create a new Authorization object
        Authorization authorization = new Authorization();
        authorization.setEmployeeId(3L);
        authorization.setRoleId(3L);

        // Call the authorize method
        String result = webController.authorize(authorization);

        // Assert the result
        assert "Authorization successful".equals(result) : "Expected success message";
    }

    @Test
    public void testCreateApplication() {
        // Create a new Application object
        Application application = new Application();
        application.setEmployeeId(8L);
        application.setDays(6);

        // Call the createApplication method
        String result = webController.createApplication(application);

        // Assert the result
        assert "Application created successfully".equals(result) : "Expected success message";
    }

}
