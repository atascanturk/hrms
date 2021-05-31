package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employee extends User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="identity_number")
	private String identityNumber;
	
	@Column(name="date_of_birth")
	private LocalDate dateOfBirth;
	
	@Column(name="user_type_id")
	private int userType = 1;

	@Column(name="user_id")
	private int userId;
	
	@Column(name="university")
	private String university;
	
	@Column(name="starting_year_of_university")
	private LocalDate startingYearOfUniversity;
	
	@Column(name="graduation_year_of_university")
	private LocalDate graduationYearOfUniversity;
	
	@Column(name="job_experience")
	private String jobExperience;
	
	@Column(name="experience_starting_date")
	private LocalDate experienceStartingDate;
	
	@Column(name="experience_end_date")
	private LocalDate experienceEndDate;
	
	@Column(name="known_language")
	private String knownLanguage;
	
	@Column(name="image_name")
	private String imageName;
	
	@Column(name="github_link")
	private String githubLink;
	
	@Column(name="linkedin_link")
	private String linkedInLink;
	
	@Column(name="cover_letter")
	private String coverLetter;
	
	@Column(name="known_technology")
	private String knownTechnology;

	public Employee() {
		super();
	}

	public Employee(int id, String firstName, String lastName, String identityNumber, LocalDate dateOfBirth,
			int userType, int userId, String university, LocalDate startingYearOfUniversity,
			LocalDate graduationYearOfUniversity, String jobExperience, LocalDate experienceStartingDate,
			LocalDate experienceEndDate, String knownLanguage, String imageName, String githubLink, String linkedInLink,
			String coverLetter, String knownTechnology) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		this.dateOfBirth = dateOfBirth;
		this.userType = userType;
		this.userId = userId;
		this.university = university;
		this.startingYearOfUniversity = startingYearOfUniversity;
		this.graduationYearOfUniversity = graduationYearOfUniversity;
		this.jobExperience = jobExperience;
		this.experienceStartingDate = experienceStartingDate;
		this.experienceEndDate = experienceEndDate;
		this.knownLanguage = knownLanguage;
		this.imageName = imageName;
		this.githubLink = githubLink;
		this.linkedInLink = linkedInLink;
		this.coverLetter = coverLetter;
		this.knownTechnology = knownTechnology;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getUserType() {
		return userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
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

	public String getKnownLanguage() {
		return knownLanguage;
	}

	public void setKnownLanguage(String knownLanguage) {
		this.knownLanguage = knownLanguage;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
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

	public String getKnownTechnology() {
		return knownTechnology;
	}

	public void setKnownTechnology(String knownTechnology) {
		this.knownTechnology = knownTechnology;
	}
	
	

	
}
