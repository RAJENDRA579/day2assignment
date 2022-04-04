package passportTestDemo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp_tbl")
	
class passport{
	
	@Id
	@GeneratedValue
	@Column(name="passport_no")
	private int passportNumber;
	
	@Column(name="passport_id")	
	private int passportId;
	
	@Column(name="passport_doi")
	private LocalDate dateOfIssue;
	
	@Column(name="passport_doe")
	private LocalDate dateOfExpiry;
	
	@Override
public String toString() {
	return "classPassport [passportNumber=" + passportNumber + ", passportId=" + passportId + ", dateOfIssue="
			+ dateOfIssue + ", dateOfExpiry=" + dateOfExpiry + "]";
}
public int getPassportNumber() {
	return passportNumber;
}
public void setPassportNumber(int passportNumber) {
	this.passportNumber = passportNumber;
}
public int getPassportId() {
	return passportId;
}
public void setPassportId(int passportId) {
	this.passportId = passportId;
}
public LocalDate getDateOfIssue() {
	return dateOfIssue;
}
public void setDateOfIssue(LocalDate dateOfIssue) {
	this.dateOfIssue = dateOfIssue;
}
public LocalDate getDateOfExpiry() {
	return dateOfExpiry;
}
public void setDateOfExpiry(LocalDate dateOfExpiry) {
	this.dateOfExpiry = dateOfExpiry;
}


}
