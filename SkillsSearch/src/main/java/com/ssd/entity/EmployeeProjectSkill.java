package com.ssd.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the employee_project_skill database table.
 * 
 */
@Entity
@Table(name="employee_project_skill")
@NamedQuery(name="EmployeeProjectSkill.findAll", query="SELECT e FROM EmployeeProjectSkill e")
public class EmployeeProjectSkill implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idemployee_project_skill")
	private int idemployeeProjectSkill;

	@Column(name="created_by")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date")
	private Date createdDate;

	@Temporal(TemporalType.TIMESTAMP)
	private Date origindate;

	private int projectid;

	private BigDecimal ratings;

	private String sid;

	private int skillid;

	@Column(name="updated_by")
	private String updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_date")
	private Date updatedDate;

	public EmployeeProjectSkill() {
	}

	public int getIdemployeeProjectSkill() {
		return this.idemployeeProjectSkill;
	}

	public void setIdemployeeProjectSkill(int idemployeeProjectSkill) {
		this.idemployeeProjectSkill = idemployeeProjectSkill;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getOrigindate() {
		return this.origindate;
	}

	public void setOrigindate(Date origindate) {
		this.origindate = origindate;
	}

	public int getProjectid() {
		return this.projectid;
	}

	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}

	public BigDecimal getRatings() {
		return this.ratings;
	}

	public void setRatings(BigDecimal ratings) {
		this.ratings = ratings;
	}

	public String getSid() {
		return this.sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public int getSkillid() {
		return this.skillid;
	}

	public void setSkillid(int skillid) {
		this.skillid = skillid;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

}