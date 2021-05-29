package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="cities")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","job_titles"})
public class City {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")	
	private int id;
	
	@Column(name="name")	
	private String Name;

	@OneToMany(mappedBy = "city")
	private List<Job> jobs;

	public City() {
		super();
	}

	public City(int id, String name, List<Job> jobs) {
		super();
		this.id = id;
		Name = name;
		this.jobs = jobs;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public List<Job> getJobs() {
		return jobs;
	}

	public void setJobs(List<Job> jobs) {
		this.jobs = jobs;
	}

}
