package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.inject.Inject;
import java.util.List;

@RestController
public class HelloController {

    @Inject
    private Test1Dao test1Dao;

    @RequestMapping("/")
    public String index() {
        List<Test1> list = test1Dao.getTestData();
        return "Greetings from Spring Boot!++++++++++test";
    }

}