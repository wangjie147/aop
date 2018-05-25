package com.dongnao.jack.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dongnao.jack.service.MyService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:config/spring/spring-dispatcher.xml")
public class MyTest implements ApplicationContextAware {
    
    public ApplicationContext context;
    
    //    @Autowired
    //    CommonMapper mapper;
    
    @Test
    public void test1() {
        MyService service = (MyService)context.getBean("myservice");
        service.execute();
    }
    
    @Test
    public void test2() {
        IntroductionIntf service = (IntroductionIntf)context.getBean("myservice");
        service.extend();
    }
    
    //    @Test
    //    public void test3() {
    //        System.out.println(mapper.queryContent(new HashMap()));
    //    }
    
    @Override
    public void setApplicationContext(ApplicationContext arg0)
            throws BeansException {
        this.context = arg0;
        
    }
    
}
