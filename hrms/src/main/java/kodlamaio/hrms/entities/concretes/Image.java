package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name="images")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","employee","cvs"})
public class Image {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="image_url")
	private String imageUrl;
	
	@Column(name="image_id")
	private String imageId;
	
	@ManyToOne()
	@JoinColumn(name="employee_id")
	private Employee employee;
	
	@OneToMany(mappedBy = "image")
	private List<Cv> cvs ;

	public Image() {
		super();
	}

	public Image(String name, String imageUrl, String imageId) {
		super();
		this.name = name;
		this.imageUrl = imageUrl;
		this.imageId = imageId;
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

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getImageId() {
		return imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public List<Cv> getCvs() {
		return cvs;
	}

	public void setCvs(List<Cv> cvs) {
		this.cvs = cvs;
	}

	
	
}
