package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import kodlamaio.hrms.entities.concretes.cvInfos.CoverLetter;
import kodlamaio.hrms.entities.concretes.cvInfos.Education;
import kodlamaio.hrms.entities.concretes.cvInfos.Language;
import kodlamaio.hrms.entities.concretes.cvInfos.ProfileLink;
import kodlamaio.hrms.entities.concretes.cvInfos.WorkExperience;

@Entity
@Table(name="employees")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","images","cvs"})
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


	public Employee() {
		super();
	}



	public Employee(int id, String firstName, String lastName, String identityNumber, LocalDate dateOfBirth,
			int userType, int userId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		this.dateOfBirth = dateOfBirth;
		this.userType = userType;
		this.userId = userId;
	
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




	
	

	
}
