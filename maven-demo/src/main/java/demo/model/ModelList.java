package demo.model;

import java.io.Serializable;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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
	
	
	private String name;	
	private String mday;
	private String mmonth;
	private String myear;
	private String status;	
	private boolean publics;
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


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}


public String getMday() {
	return mday;
}

public void setMday(String mday) {
	this.mday = mday;
}

public String getMmonth() {
	return mmonth;
}

public void setMmonth(String mmonth) {
	this.mmonth = mmonth;
}

public String getMyear() {
	return myear;
}

public void setMyear(String myear) {
	this.myear = myear;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public boolean isPublics() {
	return publics;
}

public void setPublics(boolean publics) {
	this.publics = publics;
}

public String addMdl(){
	
	Date mdate=new Date();
	try{
		mdate=new SimpleDateFormat("dd/MM/yyyy").parse(mday + "/" + mmonth + "/" + myear);
	}catch(Exception e){
		
	}
	mls.add(new Model(name,mdate, status, true));
	all();
	return null;
}
public String rmvMdl(Model m){
	mls.remove(m);
	System.out.println(mls);
	return null;
}
public String edMdl(Model m){
	m.setCanedit(!m.isCanedit());
	return null;
}
public void sort(){
	Collections.sort(mls);
}
public void search(){
	for(Model m :mls){
		if(!m.getName().contains(name)) m.setTk(false);
		else m.setTk(true);
	}
}
public void all(){
	for(Model m :mls){
		
		m.setTk(true);
	}
}
}
