package kodlamaio.hrms.entities.concretes.cvInfos;

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
@Table(name="profile_links")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","employee"})
public class ProfileLink {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="github_link")
	private String githubLink;
	
	@Column(name="linkedin_link")
	private String linkedInLink;
	
	@ManyToOne()
	@JoinColumn(name="cv_id")
	private Cv cv;

	public ProfileLink() {
		super();
	}

	public ProfileLink(int id, String githubLink, String linkedInLink, Cv cv) {
		super();
		this.id = id;
		this.githubLink = githubLink;
		this.linkedInLink = linkedInLink;
		this.cv = cv;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Cv getCv() {
		return cv;
	}

	public void setCv(Cv cv) {
		this.cv = cv;
	}
	
}
