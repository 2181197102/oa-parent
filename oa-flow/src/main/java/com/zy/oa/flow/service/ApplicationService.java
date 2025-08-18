package com.zy.oa.flow.service;

import com.zy.oa.flow.model.Application;

public interface ApplicationService {

    /**
     * 添加申请
     * @param app 申请实体
     */
    void create(Application app);

    /**
     * 根据ID查找申请
     * @param id 申请ID
     * @return 申请实体
     */
    Application findById(Long id);

    /**
     * 删除申请
     * @param id 申请ID
     */
    void delete(Long id);

}
