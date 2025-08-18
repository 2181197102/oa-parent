package com.zy.oa.flow.service.impl;

import com.zy.oa.flow.mapper.ApplicationMapper;
import com.zy.oa.flow.model.Application;
import com.zy.oa.flow.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ApplicationService")
public class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    private ApplicationMapper applicationMapper;

    public void create(Application app) {
        applicationMapper.create(app);
    }

    public Application findById(Long id) {
        return applicationMapper.findById(id);
    }

    public void delete(Long id) {
        applicationMapper.delete(id);
    }
}
