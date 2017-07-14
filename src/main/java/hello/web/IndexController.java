package hello.web;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/index")
	public String home(Map<String, Object> model) {
		model.put("message", "HowToDoInJava Reader index !!");
		return "index";
	}
	
	@RequestMapping("/next")
	public String next(Map<String, Object> model) {
		model.put("message", "You are in next page !!");
		return "next";
	}

}