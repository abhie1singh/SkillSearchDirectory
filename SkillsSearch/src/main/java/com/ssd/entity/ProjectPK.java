package com.ssd.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the project database table.
 * 
 */
@Embeddable
public class ProjectPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private int projectId;
	private String projectName;

	public ProjectPK() {
	}

	@Column(name="project_id")
	public int getProjectId() {
		return this.projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	@Column(name="project_name")
	public String getProjectName() {
		return this.projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ProjectPK)) {
			return false;
		}
		ProjectPK castOther = (ProjectPK)other;
		return 
			(this.projectId == castOther.projectId)
			&& this.projectName.equals(castOther.projectName);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.projectId;
		hash = hash * prime + this.projectName.hashCode();
		
		return hash;
	}
}