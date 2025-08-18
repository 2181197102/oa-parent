package com.zy.oa.auth.mapper;

import com.zy.oa.auth.model.Authorization;

public interface AuthorizationMapper {

    /**
     * 添加授权
     * @param authorization 授权实体
     */
    void authorize(Authorization authorization);

    /**
    * 根据ID查找授权
    * @param id 授权ID
    * @return 授权实体
    */
    Authorization findById(Long id);

    /**
     * 删除授权
     * @param  id 授权ID
     */
    void unauthorize(Long id);

}
