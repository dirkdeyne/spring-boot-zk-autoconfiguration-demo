package be.enyed.zk;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HelloController {

	@GetMapping("/")
	public String home(){
		return "redirect:hello/ZK world";
	}
	
	@GetMapping("/hello/{message}")
	public String hello(Model model, @PathVariable("message") String message){
		model.addAttribute("message", message);
		return "hello";
	}
	
}
