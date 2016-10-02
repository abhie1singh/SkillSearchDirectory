package com.ssd.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the project database table.
 * 
 */
@Entity
@NamedQuery(name="Project.findAll", query="SELECT p FROM Project p")
public class Project implements Serializable {
	private static final long serialVersionUID = 1L;
	private ProjectPK id;
	private String createdBy;
	private Date createdDate;
	private String updatedBy;
	private Date updatedDate;
	private Location location;
	private List<UserProjectSkill> userProjectSkills;

	public Project() {
	}


	@EmbeddedId
	public ProjectPK getId() {
		return this.id;
	}

	public void setId(ProjectPK id) {
		this.id = id;
	}


	@Column(name="created_by")
	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}


	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date")
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}


	@Column(name="updated_by")
	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}


	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_date")
	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}


	//bi-directional many-to-one association to Location
	@ManyToOne
	@JoinColumn(name="location_id")
	public Location getLocation() {
		return this.location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}


	//bi-directional many-to-one association to UserProjectSkill
	@OneToMany(mappedBy="project")
	public List<UserProjectSkill> getUserProjectSkills() {
		return this.userProjectSkills;
	}

	public void setUserProjectSkills(List<UserProjectSkill> userProjectSkills) {
		this.userProjectSkills = userProjectSkills;
	}

	public UserProjectSkill addUserProjectSkill(UserProjectSkill userProjectSkill) {
		getUserProjectSkills().add(userProjectSkill);
		userProjectSkill.setProject(this);

		return userProjectSkill;
	}

	public UserProjectSkill removeUserProjectSkill(UserProjectSkill userProjectSkill) {
		getUserProjectSkills().remove(userProjectSkill);
		userProjectSkill.setProject(null);

		return userProjectSkill;
	}

}