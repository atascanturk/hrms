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
@Table(name="languages")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","employee"})
public class Language {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;		
	
	@Column(name="language")
	private String language;		

	@Column(name="level")
	private int level;	
	
	@ManyToOne()
	@JoinColumn(name="cv_id")
	private Cv cv;

	public Language() {
		super();
	}

	public Language(int id, String language, int level, Cv cv) {
		super();
		this.id = id;
		this.language = language;
		this.level = level;
		this.cv = cv;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Cv getCv() {
		return cv;
	}

	public void setCv(Cv cv) {
		this.cv = cv;
	}
	
}
