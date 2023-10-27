package com.varma.www.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employe 
{
	@Id
	private int empId;
	@Column
	private int empSal;
	@Column
	private String empAdd;
	@Column
	private String empName;

}
