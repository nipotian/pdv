package demo.controller;




import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller



@RequestMapping({"/model"})
public class ModelController {
	
	
	
	@RequestMapping("")
	public String getPageModel(){
		
		return "model/index.isp";
	}
	
	@RequestMapping("home")
	public String getPageHome(){
		return "home.xhtml";
	}
	
}
