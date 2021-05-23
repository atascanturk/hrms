package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_activations")
public class UserActivation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="activation_code")
	private String activationCode;
	
	@Column(name="is_confirmed")
	private boolean isConfirmed;
	
	@Column(name="confirmation_date")
	private LocalDate confirmationDate = LocalDate.now();

	public UserActivation() {
		super();
	}

	public UserActivation(int id, int userId, String activationCode, boolean isConfirmed) {
		super();
		this.id = id;
		this.userId = userId;
		this.activationCode = activationCode;
		this.isConfirmed = isConfirmed;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getActivationCode() {
		return activationCode;
	}

	public void setActivationCode(String activationCode) {
		this.activationCode = activationCode;
	}

	public boolean isConfirmed() {
		return isConfirmed;
	}

	public void setConfirmed(boolean isConfirmed) {
		this.isConfirmed = isConfirmed;
	}

	public LocalDate getConfirmationDate() {
		return confirmationDate;
	}
	
	
	
}
