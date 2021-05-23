package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_activations_by_admin_users")
public class UserActivationsByAdmin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="confirmed_employee_id")
	private int employeeId;
	
	@Column(name="is_confirmed")
	private boolean isConfirmed;
	
	@Column(name="confirmation_date")
	private LocalDate confirmationDate  = LocalDate.now();

	public UserActivationsByAdmin() {
		super();
	}

	public UserActivationsByAdmin(int id, int employeeId, boolean isConfirmed) {
		super();
		this.id = id;
		this.employeeId = employeeId;
		this.isConfirmed = isConfirmed;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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
