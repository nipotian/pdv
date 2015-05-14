package demo.controller;




import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller



@RequestMapping({"","home"})
public class ModelController {
	
	@RequestMapping("")
	public String demoReg(){
		
		return "index";
	}
}
