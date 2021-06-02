package kodlamaio.hrms.entities.Dtos;

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

import kodlamaio.hrms.entities.concretes.Employee;
import kodlamaio.hrms.entities.concretes.Image;


public class CvDto {
	
	private int id;	
	

	private String university;
	
	private String department;
	

	private LocalDate startingYearOfUniversity;
	

	private LocalDate graduationYearOfUniversity;
	

	private String jobExperience;
	

	private LocalDate experienceStartingDate;
	

	private LocalDate experienceEndDate;
	

	private String language;
	
	private int level;	
	

	private String githubLink;
	
	
	private String linkedInLink;
	

	private String coverLetter;
	

		

	public CvDto() {
		super();
	}




	public CvDto(int id, String university, String department, LocalDate startingYearOfUniversity,
			LocalDate graduationYearOfUniversity, String jobExperience, LocalDate experienceStartingDate,
			LocalDate experienceEndDate, String language, int level, String githubLink, String linkedInLink,
			String coverLetter) {
		super();
		this.id = id;
		this.university = university;
		this.department = department;
		this.startingYearOfUniversity = startingYearOfUniversity;
		this.graduationYearOfUniversity = graduationYearOfUniversity;
		this.jobExperience = jobExperience;
		this.experienceStartingDate = experienceStartingDate;
		this.experienceEndDate = experienceEndDate;
		this.language = language;
		this.level = level;
		this.githubLink = githubLink;
		this.linkedInLink = linkedInLink;
		this.coverLetter = coverLetter;
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




	public String getLanguage() {
		return language;
	}




	public void setLanguage(String language) {
		this.language = language;
	}




	public int getLevel() {
		return level;
	}




	public void setLevel(int level) {
		this.level = level;
	}




	public String getGithubLink() {
		return githubLink;
	}




	public void setGithubLink(String githubLink) {
		this.githubLink = githubLink;
	}




	public String getLinkedInLink() {
		return linkedInLink;
	}




	public void setLinkedInLink(String linkedInLink) {
		this.linkedInLink = linkedInLink;
	}




	public String getCoverLetter() {
		return coverLetter;
	}




	public void setCoverLetter(String coverLetter) {
		this.coverLetter = coverLetter;
	}



	
}
