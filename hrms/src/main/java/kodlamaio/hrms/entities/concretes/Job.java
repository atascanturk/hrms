package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="job_titles")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","employer","city"})
public class Job {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	//@Column(name="employer_id")
	//private int employerId;
	
	@Column(name="title")
	private String jobName;
	
	//@Column(name="city_id")
	//private int city;
	
	@Column(name="min_salary")
	private  int minSalary;
	
	@Column(name="max_salary")
	private int maxSalary;
	
	@Column(name="open_position_count")
	private int openPositionCount;
	
	@Column(name="created_date")
	private LocalDate createdDate = LocalDate.now();
	
	@Column(name="application_deadline")
	private LocalDate applicationDeadline;
	
	@Column(name="is_active")
	private boolean isActive;
	
	@ManyToOne()
	@JoinColumn(name="employer_id")
	private Employer employer;
	
	@ManyToOne()
	@JoinColumn(name="city_id")
	private City city;

	public Job() {
		super();
	}

	public Job(int id, String jobName, int minSalary, int maxSalary, int openPositionCount, LocalDate createdDate,
			LocalDate applicationDeadline, boolean isActive, Employer employer, City city) {
		super();
		this.id = id;
		this.jobName = jobName;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
		this.openPositionCount = openPositionCount;
		this.createdDate = createdDate;
		this.applicationDeadline = applicationDeadline;
		this.isActive = isActive;
		this.employer = employer;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public int getMinSalary() {
		return minSalary;
	}

	public void setMinSalary(int minSalary) {
		this.minSalary = minSalary;
	}

	public int getMaxSalary() {
		return maxSalary;
	}

	public void setMaxSalary(int maxSalary) {
		this.maxSalary = maxSalary;
	}

	public int getOpenPositionCount() {
		return openPositionCount;
	}

	public void setOpenPositionCount(int openPositionCount) {
		this.openPositionCount = openPositionCount;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDate getApplicationDeadline() {
		return applicationDeadline;
	}

	public void setApplicationDeadline(LocalDate applicationDeadline) {
		this.applicationDeadline = applicationDeadline;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Employer getEmployer() {
		return employer;
	}

	public void setEmployer(Employer employer) {
		this.employer = employer;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

}