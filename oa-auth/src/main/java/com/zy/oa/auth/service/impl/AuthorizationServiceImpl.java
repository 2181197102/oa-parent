package com.zy.oa.auth.service.impl;

import com.zy.oa.auth.mapper.AuthorizationMapper;
import com.zy.oa.auth.model.Authorization;
import com.zy.oa.auth.service.AuthorizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("authorizationService")
public class AuthorizationServiceImpl implements AuthorizationService {

    @Autowired
    private AuthorizationMapper authorizationMapper;

    public void authorize(Authorization authorization) {
        authorizationMapper.authorize(authorization);
        System.out.println("Authorization successful for:..." + authorization);
        System.out.println("modify the authorizationMapper to use the correct SQL query for authorization. in feature/002");
    }

    public Authorization findById(Long id) {
        System.out.println("Finding authorization by ID: " + id);
        System.out.println("prepare to execute findById sql query... ...");
        return authorizationMapper.findById(id);
    }

    public void unauthorize(Long id) {
        System.out.println("Unauthorized ID: " + id);
        System.out.println("prepare to execute unauthorize sql query... ...");
        authorizationMapper.unauthorize(id);
    }

}
