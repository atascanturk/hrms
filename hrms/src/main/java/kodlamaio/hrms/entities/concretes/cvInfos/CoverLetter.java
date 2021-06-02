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
@Table(name="cover_letters")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","cv",})
public class CoverLetter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;	
	
	@Column(name="cover_letter")
	private String coverLetter;
	
	@ManyToOne()
	@JoinColumn(name="cv_id")
	private Cv cv;

	public CoverLetter() {
		super();
	}

	public CoverLetter(int id, String coverLetter, Cv cv) {
		super();
		this.id = id;
		this.coverLetter = coverLetter;
		this.cv = cv;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCoverLetter() {
		return coverLetter;
	}

	public void setCoverLetter(String coverLetter) {
		this.coverLetter = coverLetter;
	}

	public Cv getCv() {
		return cv;
	}

	public void setCv(Cv cv) {
		this.cv = cv;
	}
}
