package com.imaginnovate.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "employee_tax")
public class Employee {
	@Id
	@NotBlank(message = "Employee Id is Mandatory")
	@Pattern(regexp = "^E\\d{3}$", message = "Employee ID should start with 'E' followed by 3 digits")
	private String employeeId;
	
	@NotBlank(message = "First Name is Mandatory")
	private String firstName;
	
	@NotBlank(message = "Last Name is Mandatory")
	private String lastName;
	
	@NotBlank(message = "Email is Mandatory")
	@Email
	private String email;
	
	@NotEmpty(message = "Phone numbers list non-empty list")
	@Size(min = 1, message = "There should be at least one phone number")
	
	private List<@Pattern(regexp = "^[1-9]\\d{9}$", message = "Phone number must be exactly 10 digits and cannot start with 0")String> phoneNumbers;
	
	@NotBlank(message = "Date of Join is Mandatory")
	@JsonFormat(pattern = "YYYY-MM-DD")
	private String doj;
	
	@NotNull(message = "Salary is Mandatory")
	@Positive(message = "Salary should be positive number")
	private double salary;

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(
			@NotEmpty(message = "Employee Id is Mandatory") @Pattern(regexp = "^E\\d{3}$", message = "Employee ID should start with 'E' followed by 3 digits") String employeeId,
			@NotEmpty(message = "First Name is Mandatory") String firstName,
			@NotEmpty(message = "Last Name is Mandatory") String lastName,
			@NotEmpty(message = "Email is Mandatory") @Email String email,
			@NotEmpty(message = "Phone numbers list non-empty list") @Size(min = 1, message = "There should be at least one phone number") @Pattern(regexp = "^[1-9]\\d{9}$", message = "Phone number must be exactly 10 digits and cannot start with 0") List<String> phoneNumbers,
			@NotEmpty(message = "Date of Join is Mandatory") String doj,
			@NotEmpty(message = "Salary is Mandatory") @Positive(message = "Salary should be positive number") double salary) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumbers = phoneNumbers;
		this.doj = doj;
		this.salary = salary;
	}

	public Employee() {
	}
	
	
	
	
	

}
