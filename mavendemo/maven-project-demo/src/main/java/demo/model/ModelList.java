package demo.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "ModelList", eager = true)
@SessionScoped
public class ModelList implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	
	private static List<Model> mls=new ArrayList<Model>(Arrays.asList(
			new Model("John",new Date(),"us",true),
			new Model("Robert",new Date(),"stp",true),
			new Model("Mark",new Date(),"us",false),
			new Model("Chris",new Date(),"pse",true),
			new Model("Peter",new Date(),"us",false)));
	public ModelList(){
			
	}
	
public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static void setMls(List<Model> mls) {
		ModelList.mls = mls;
	}

public List<Model> getMls(){
	
	return mls;
}
public String addMdl(){
	
	mls.add(new Model("Pian",new Date(), "as", false));
	System.out.println(mls);
	return "add-done";
}
public String rmvMdl(){
	mls.remove(0);
	System.out.println(mls);
	return "rmv-done";
}
}
