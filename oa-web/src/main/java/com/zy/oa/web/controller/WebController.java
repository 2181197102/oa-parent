package com.zy.oa.web.controller;

import com.zy.oa.auth.model.Authorization;
import com.zy.oa.auth.service.AuthorizationService;
import com.zy.oa.flow.model.Application;
import com.zy.oa.flow.service.ApplicationService;
import com.zy.oa.organ.model.Employee;
import com.zy.oa.organ.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private AuthorizationService authorizationService;

    @Autowired
    private ApplicationService applicationService;

    @RequestMapping("/addEmployee")
    @ResponseBody
    public String addEmployee(Employee employee) {
        try{
            employeeService.addEmployee(employee);
        } catch (Exception e) {
            e.printStackTrace();
            return "Error adding employee: " + e.getMessage();
        }
        return "Employee added successfully";
    }

    @RequestMapping("/authorize")
    @ResponseBody
    public String authorize(Authorization authorization) {
        try {
            authorizationService.authorize(authorization);
        } catch (Exception e) {
            e.printStackTrace();
            return "Error during authorization: " + e.getMessage();
        }
        return "Authorization successful";
    }

    @RequestMapping("/createApplication")
    @ResponseBody
    public String createApplication(Application application) {
        try {
            applicationService.create(application);
        } catch (Exception e) {
            e.printStackTrace();
            return "Error creating application: " + e.getMessage();
        }
        return "Application created successfully";
    }

}
