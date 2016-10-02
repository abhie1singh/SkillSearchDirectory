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

	private Project project;

	private BigDecimal ratings;

	private User user;

	private Skill skill;

	@Column(name="updated_by")
	private String updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_date")
	private Date updatedDate;

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

	@ManyToOne
	@JoinColumn(name="project_id")
	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public BigDecimal getRatings() {
		return this.ratings;
	}

	public void setRatings(BigDecimal ratings) {
		this.ratings = ratings;
	}

	@ManyToOne
	@JoinColumn(name="location_id")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@ManyToOne
	@JoinColumn(name="skillid")
	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
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