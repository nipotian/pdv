package demo.model;


import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * @author piandv
 *
 */

@ManagedBean(name = "Model", eager = true)
@SessionScoped
public class Model implements Comparable<Model>{
	
	
	private int id;
	
	
	private String name;
	
	private Date modertime;
	
	private String status;
	
	private boolean publics;
	private boolean canedit;
	private boolean tk;
	public Model(){
		canedit=false;
		tk=true;
	}

	public Model(String name){
		this();
		this.name=name;
	}
	
	public Model(String name, Date modertime, String status, Boolean publics){
		this(name);
		this.modertime=modertime;
		this.status=status;
		this.publics=publics;
	}
	
	public Model(Model m){
		this(m.getName(),m.getModertime(),m.getStatus(),m.isPublics());
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getModertime() {
		
		return modertime;
	}

	public void setModertime(Date modertime) {
		this.modertime = modertime;
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

	public boolean isCanedit() {
		return canedit;
	}

	public void setCanedit(boolean canedit) {
		this.canedit = canedit;
	}
	public String editting(){
		if(isCanedit()) return "save";
		return "edit";
	}

	

	public boolean isTk() {
		return tk;
	}

	public void setTk(boolean tk) {
		this.tk = tk;
	}

	@Override
	public int compareTo(Model o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.getName());
	
	}

	
	
}
