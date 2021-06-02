package kodlamaio.hrms.entities.concretes.cvInfos;

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

import kodlamaio.hrms.entities.concretes.Cv;


@Entity
@Table(name="work_experiences")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","employee"})
public class WorkExperience {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;		
	
	
	@Column(name="job_experience")
	private String jobExperience;
	
	@Column(name="experience_starting_date")
	private LocalDate experienceStartingDate;
	
	@Column(name="experience_end_date")
	private LocalDate experienceEndDate;
	
	@ManyToOne()
	@JoinColumn(name="cv_id")
	private Cv cv;

	public WorkExperience() {
		super();
	}

	public WorkExperience(int id, String jobExperience, LocalDate experienceStartingDate, LocalDate experienceEndDate,
			Cv cv) {
		super();
		this.id = id;
		this.jobExperience = jobExperience;
		this.experienceStartingDate = experienceStartingDate;
		this.experienceEndDate = experienceEndDate;
		this.cv = cv;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJobExperience() {
		return jobExperience;
	}

	public void setJobExperience(String jobExperience) {
		this.jobExperience = jobExperience;
	}

	public LocalDate getExperienceStartingDate() {
		return experienceStartingDate;
	}

	public void setExperienceStartingDate(LocalDate experienceStartingDate) {
		this.experienceStartingDate = experienceStartingDate;
	}

	public LocalDate getExperienceEndDate() {
		return experienceEndDate;
	}

	public void setExperienceEndDate(LocalDate experienceEndDate) {
		this.experienceEndDate = experienceEndDate;
	}

	public Cv getCv() {
		return cv;
	}

	public void setCv(Cv cv) {
		this.cv = cv;
	}
	
}
