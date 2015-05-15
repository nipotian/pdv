package demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DemoController {

	@RequestMapping("")
	public String getPageHome(){
		
		return "home.xhtml";
	}
	@RequestMapping("idx")
	public String getPageIndex(){
		return "index.jsp";
	}
}
