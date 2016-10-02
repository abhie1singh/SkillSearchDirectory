package com.ssd.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the skill database table.
 * 
 */
@Entity
@NamedQuery(name="Skill.findAll", query="SELECT s FROM Skill s")
public class Skill implements Serializable {
	private static final long serialVersionUID = 1L;
	private int skillId;
	private String createdBy;
	private Date createdDate;
	private String skillName;
	private String updatedBy;
	private Date updatedDate;
	private String version;
	private List<UserProjectSkill> userProjectSkills;

	public Skill() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="skill_id")
	public int getSkillId() {
		return this.skillId;
	}

	public void setSkillId(int skillId) {
		this.skillId = skillId;
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


	@Column(name="skill_name")
	public String getSkillName() {
		return this.skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
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


	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}


	//bi-directional many-to-one association to UserProjectSkill
	@OneToMany(mappedBy="skill")
	public List<UserProjectSkill> getUserProjectSkills() {
		return this.userProjectSkills;
	}

	public void setUserProjectSkills(List<UserProjectSkill> userProjectSkills) {
		this.userProjectSkills = userProjectSkills;
	}

	public UserProjectSkill addUserProjectSkill(UserProjectSkill userProjectSkill) {
		getUserProjectSkills().add(userProjectSkill);
		userProjectSkill.setSkill(this);

		return userProjectSkill;
	}

	public UserProjectSkill removeUserProjectSkill(UserProjectSkill userProjectSkill) {
		getUserProjectSkills().remove(userProjectSkill);
		userProjectSkill.setSkill(null);

		return userProjectSkill;
	}

}