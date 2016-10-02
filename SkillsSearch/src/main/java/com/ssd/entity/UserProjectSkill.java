package com.ssd.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the user_project_skill database table.
 * 
 */
@Entity
@Table(name="user_project_skill")
@NamedQuery(name="UserProjectSkill.findAll", query="SELECT u FROM UserProjectSkill u")
public class UserProjectSkill implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="iduser_project_skill")
	private int iduserProjectSkill;

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

	@Column(name="user_id")
	private int userId;

	public UserProjectSkill() {
	}

	public int getIduserProjectSkill() {
		return this.iduserProjectSkill;
	}

	public void setIduserProjectSkill(int iduserProjectSkill) {
		this.iduserProjectSkill = iduserProjectSkill;
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

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}