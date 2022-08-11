package com.packt.cardatabase;


import com.packt.cardatabase.web.RootController;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.function.Executable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.servlet.view.RedirectView;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(SpringExtension.class)
@WebMvcTest(RootController.class)
public class RootControllerIntegrationTestin {

    @Autowired
    private RootController rootController;




    @RepeatedTest(2)
    public void test_root_controller_redirect(){
        RedirectView rw = rootController.rootMap();
        assertAll(
                () -> assertEquals("/swagger-ui/index.html", rw.getUrl()),
                () -> assertTimeout(Duration.ofMillis(2), () -> rootController.rootMap(),"Home indexing is too slow!")
        );

    }


}
