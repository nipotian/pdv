package demo.model;


import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * @author piandv
 *
 */
@Entity
@Table(name="Model")
public class Model {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Size(min = 3, max = 30, message = "Username must be between 3 and 30 characters long.")
	@Pattern(regexp = "^[a-zA-Z0-9]+$", message = "Username must be alphanumeric with no spaces")
	private String name;
	
	private Date modertime;
	
	@NotNull
	@Pattern(regexp = "Using||Stopped||Pause", message = "Status must be 'Using', 'Stopped', or 'Pause' ")
	private String status;
	
	private Boolean publics;
	
	public Model(){
	}

	public Model(String name){
		this.name=name;
	}
	
	public Model(String name, Date modertime, String status, Boolean publics){
		this(name);
		this.modertime=modertime;
		this.status=status;
		this.publics=publics;
	}
	
	public Model(Model m){
		this(m.getName(),m.getModertime(),m.getStatus(),m.getPublics());
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

	public Boolean getPublics() {
		return publics;
	}

	public void setPublics(Boolean publics) {
		this.publics = publics;
	}
	
	
}
