package com.ssd.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private UserPK id;
	private String createdBy;
	private Date createdDate;
	private String email;
	private String password;
	private String updatedBy;
	private Date updatedDate;
	private List<Help> helps1;
	private List<Help> helps2;
	private UserProfile userProfile;
	private List<UserProjectSkill> userProjectSkills;

	public User() {
	}


	@EmbeddedId
	public UserPK getId() {
		return this.id;
	}

	public void setId(UserPK id) {
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


	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
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


	//bi-directional many-to-one association to Help
	@OneToMany(mappedBy="user1")
	public List<Help> getHelps1() {
		return this.helps1;
	}

	public void setHelps1(List<Help> helps1) {
		this.helps1 = helps1;
	}

	public Help addHelps1(Help helps1) {
		getHelps1().add(helps1);
		helps1.setProvider(this);

		return helps1;
	}

	public Help removeHelps1(Help helps1) {
		getHelps1().remove(helps1);
		helps1.setProvider(this);

		return helps1;
	}


	//bi-directional many-to-one association to Help
	@OneToMany(mappedBy="user2")
	public List<Help> getHelps2() {
		return this.helps2;
	}

	public void setHelps2(List<Help> helps2) {
		this.helps2 = helps2;
	}

	public Help addHelps2(Help helps2) {
		getHelps2().add(helps2);
		helps2.setRequester(this);
		return helps2;
	}

	public Help removeHelps2(Help helps2) {
		getHelps2().remove(helps2);
		helps2.setRequester(this);

		return helps2;
	}


	//bi-directional one-to-one association to UserProfile
	@OneToOne
	@JoinColumn(name="user_sid", referencedColumnName="user_sid")
	public UserProfile getUserProfile() {
		return this.userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}


	//bi-directional many-to-one association to UserProjectSkill
	@OneToMany(mappedBy="user")
	public List<UserProjectSkill> getUserProjectSkills() {
		return this.userProjectSkills;
	}

	public void setUserProjectSkills(List<UserProjectSkill> userProjectSkills) {
		this.userProjectSkills = userProjectSkills;
	}

	public UserProjectSkill addUserProjectSkill(UserProjectSkill userProjectSkill) {
		getUserProjectSkills().add(userProjectSkill);
		userProjectSkill.setUser(this);

		return userProjectSkill;
	}

	public UserProjectSkill removeUserProjectSkill(UserProjectSkill userProjectSkill) {
		getUserProjectSkills().remove(userProjectSkill);
		userProjectSkill.setUser(null);

		return userProjectSkill;
	}

}