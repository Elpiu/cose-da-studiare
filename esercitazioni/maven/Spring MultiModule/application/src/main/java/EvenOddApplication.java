import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@SpringBootApplication(scanBasePackages = "com.baeldung")
@EnableAutoConfiguration
@RestController
public class EvenOddApplication {



    @Autowired
    private EvenOddService evenOddService;


    // constructor

    @GetMapping("/validate/")
    public String isEvenOrOdd(@RequestParam("number") Integer number
            ) {
        return evenOddService.isEvenOrOdd(number);
    }

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(EvenOddApplication.class);
        app.setDefaultProperties(Collections
                .singletonMap("server.port", "8090"));
        app.run(args);
    }
}
