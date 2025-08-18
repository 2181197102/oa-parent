package com.zy.oa.flow;

import com.zy.oa.flow.model.Application;
import com.zy.oa.flow.service.ApplicationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.TestCase.*;

@ContextConfiguration(locations = {"classpath:application-flow.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class ApplicationServiceTest {

    @Autowired
    private ApplicationService applicationService;

    @Test
    public void testCreate() {
        Application application = new Application();
        application.setEmployeeId(1L);
        application.setDays(1);
        applicationService.create(application);
        assertTrue(application.getId() != null && application.getId() > 0);
    }

    @Test
    public void testFindById() {
        Application application = new Application();
        application.setEmployeeId(1L);
        application.setDays(5);
        applicationService.create(application);

        Application _application = applicationService.findById(application.getId());
        assertNotNull(_application);
    }

    @Test
    public void testDelete() {
        Application application = new Application();
        application.setEmployeeId(1L);
        application.setDays(5);
        applicationService.create(application);

        applicationService.delete(application.getId());
        Application _application = applicationService.findById(application.getId());
        assertNull(_application);
    }

}
