package com.packt.cardatabase;
import com.packt.cardatabase.service.SimpleService;
import com.packt.cardatabase.web.SimpleController;
import org.aspectj.lang.annotation.Before;
import org.hibernate.service.spi.InjectService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.util.ReflectionTestUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;


@ExtendWith(SpringExtension.class)
//@WebMvcTest(SimpleController.class)
public class SimpleControllerIntegrationTest {

    @InjectMocks
    private SimpleController simpleController;
    @Mock
    private SimpleService simpleService;


    @Before("")
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        int a = 50;
    }


    @Test
    public void test_controller_api_simple_controller_service1(){
        when(simpleService.transformFullName(1L)).thenReturn("E M");
        assertEquals(simpleController.service1(),"Ciao belli E M",
                () -> "Sometingh goes wrong.");

    }

}
