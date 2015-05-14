package demo.controller;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import demo.model.Model;

@Controller



@RequestMapping({"","index"})
public class ModelCtrl {
	@PersistenceContext
	private EntityManager em;
	
	@RequestMapping("")
	public String demoReg(){
		Model m=new Model("Pian",new Date(),"Using",true);
		em.persist(m);
		return "index.jsp";
	}
}
