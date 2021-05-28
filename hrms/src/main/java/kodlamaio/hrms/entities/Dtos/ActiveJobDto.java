package kodlamaio.hrms.entities.Dtos;

import java.time.LocalDate;

public class ActiveJobDto {

	private String employerName;
	
	private String jobPosition;
	
	private int openPositionCount;
	
	private LocalDate createdDate;
	
	private LocalDate applicationDeadline;

	public ActiveJobDto() {
		super();
	}

	public ActiveJobDto(String employerName,String jobPosition, int openPositionCount, LocalDate createdDate,
			LocalDate applicationDeadline) {
		super();
		this.employerName = employerName;
		this.jobPosition = jobPosition;
		this.openPositionCount = openPositionCount;
		this.createdDate = createdDate;
		this.applicationDeadline = applicationDeadline;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public String getJobPosition() {
		return jobPosition;
	}

	public void setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition;
	}

	public int getOpenPositionCount() {
		return openPositionCount;
	}

	public void setOpenPositionCount(int openPositionCount) {
		this.openPositionCount = openPositionCount;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDate getApplicationDeadline() {
		return applicationDeadline;
	}

	public void setApplicationDeadline(LocalDate applicationDeadline) {
		this.applicationDeadline = applicationDeadline;
	}
	
}
