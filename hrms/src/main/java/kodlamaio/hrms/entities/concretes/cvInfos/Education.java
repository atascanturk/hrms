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
@Table(name="educations")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","employee"})
public class Education {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;	
	
	@Column(name="university")
	private String university;
	
	@Column(name="department")
	private String department;
	
	@Column(name="starting_year_of_university")
	private LocalDate startingYearOfUniversity;
	
	@Column(name="graduation_year_of_university")
	private LocalDate graduationYearOfUniversity;
	
	@ManyToOne()
	@JoinColumn(name="cv_id")
	private Cv cv;

	public Education() {
		super();
	}

	public Education(int id, String university, String department, LocalDate startingYearOfUniversity,
			LocalDate graduationYearOfUniversity, Cv cv) {
		super();
		this.id = id;
		this.university = university;
		this.department = department;
		this.startingYearOfUniversity = startingYearOfUniversity;
		this.graduationYearOfUniversity = graduationYearOfUniversity;
		this.cv = cv;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public LocalDate getStartingYearOfUniversity() {
		return startingYearOfUniversity;
	}

	public void setStartingYearOfUniversity(LocalDate startingYearOfUniversity) {
		this.startingYearOfUniversity = startingYearOfUniversity;
	}

	public LocalDate getGraduationYearOfUniversity() {
		return graduationYearOfUniversity;
	}

	public void setGraduationYearOfUniversity(LocalDate graduationYearOfUniversity) {
		this.graduationYearOfUniversity = graduationYearOfUniversity;
	}

	public Cv getCv() {
		return cv;
	}

	public void setCv(Cv cv) {
		this.cv = cv;
	}
	
}
