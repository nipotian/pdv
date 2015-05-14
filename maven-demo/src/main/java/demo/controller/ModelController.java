package demo.controller;




import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller




public class ModelController {
	
	@RequestMapping({"/"})
	public String demoIndex(){
		
		return "home.xhtml";
	}
	
	@RequestMapping("/model")
	public String model(){
		
		return "index.isp";
	}
}
