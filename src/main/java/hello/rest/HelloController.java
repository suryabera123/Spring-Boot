package hello.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/rest")
    public String index() {
        return "Greetings from Spring Boot!++++++++++";
    }

    @RequestMapping("/rest/1")
    public String index1() {
        return "1111111111111111";
    }

    @RequestMapping("/rest/2")
    public String index2() {
        return "222222222222";
    }

}
