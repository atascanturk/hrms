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

import kodlamaio.hrms.entities.concretes.cvInfos.CoverLetter;
import kodlamaio.hrms.entities.concretes.cvInfos.Education;
import kodlamaio.hrms.entities.concretes.cvInfos.Language;
import kodlamaio.hrms.entities.concretes.cvInfos.ProfileLink;
import kodlamaio.hrms.entities.concretes.cvInfos.WorkExperience;

@Entity
@Table(name="cvs")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","images","workExperiences","languages","profileLink","educations","coverLetters"})
public class Cv {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")	
	private int id;
	
	@ManyToOne()
	@JoinColumn(name="employee_id")
	private Employee employee;
	
	@ManyToOne()
	@JoinColumn(name="image_id")
	private Image image ;
	
	@OneToMany(mappedBy = "cv")
	private List<WorkExperience> workExperiences;
	
	@OneToMany(mappedBy = "cv")
	private List<Language> languages;
	
	@OneToMany(mappedBy = "cv")
	private List<ProfileLink> profileLinks;
	
	@OneToMany(mappedBy = "cv")
	private List<Education> educations;
	
	@OneToMany(mappedBy = "cv")
	private List<CoverLetter> coverLetters ;

	public Cv() {
		super();
	}

	public Cv(int id, Employee employee, Image image, List<WorkExperience> workExperiences,
			List<Language> languages, List<ProfileLink> profileLinks, List<Education> educations,
			List<CoverLetter> coverLetters) {
		super();
		this.id = id;
		this.employee = employee;
		this.image = image;
		this.workExperiences = workExperiences;
		this.languages = languages;
		this.profileLinks = profileLinks;
		this.educations = educations;
		this.coverLetters = coverLetters;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Image getImages() {
		return image;
	}

	public void setImages(Image image) {
		this.image = image;
	}

	public List<WorkExperience> getWorkExperiences() {
		return workExperiences;
	}

	public void setWorkExperiences(List<WorkExperience> workExperiences) {
		this.workExperiences = workExperiences;
	}

	public List<Language> getLanguages() {
		return languages;
	}

	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}

	public List<ProfileLink> getProfileLink() {
		return profileLinks;
	}

	public void setProfileLink(List<ProfileLink> profileLinks) {
		this.profileLinks = profileLinks;
	}

	public List<Education> getEducations() {
		return educations;
	}

	public void setEducations(List<Education> educations) {
		this.educations = educations;
	}

	public List<CoverLetter> getCoverLetters() {
		return coverLetters;
	}

	public void setCoverLetters(List<CoverLetter> coverLetters) {
		this.coverLetters = coverLetters;
	}
}
