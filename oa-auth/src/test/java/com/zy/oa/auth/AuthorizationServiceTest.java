package com.zy.oa.auth;

import com.zy.oa.auth.model.Authorization;
import com.zy.oa.auth.service.AuthorizationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.TestCase.*;

@ContextConfiguration(locations = {"classpath:application-auth.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class AuthorizationServiceTest {

    @Autowired
    private AuthorizationService authorizationService;

    @Test
    public void testAuthorize() {
        Authorization authorization = new Authorization();
        authorization.setEmployeeId(1L);
        authorization.setRoleId(1L);
        authorizationService.authorize(authorization);
        assertTrue(authorization.getId() != null && authorization.getId() > 0);
    }

    @Test
    public void testFindById() {
        Authorization authorization = new Authorization();
        authorization.setEmployeeId(1L);
        authorization.setRoleId(1L);
        authorizationService.authorize(authorization);

        Authorization _authorization = authorizationService.findById(authorization.getId());
        assertNotNull(_authorization);
    }

    @Test
    public void testUnauthorize() {
        Authorization authorization = new Authorization();
        authorization.setEmployeeId(1L);
        authorization.setRoleId(1L);
        authorizationService.authorize(authorization);

        authorizationService.unauthorize(authorization.getId());
        Authorization _authorization = authorizationService.findById(authorization.getId());
        assertNull(_authorization);
    }
}
