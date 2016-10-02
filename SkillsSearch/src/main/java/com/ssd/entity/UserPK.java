package com.ssd.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the user database table.
 * 
 */
@Embeddable
public class UserPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private int userId;
	private String userSid;

	public UserPK() {
	}

	@Column(name="user_id")
	public int getUserId() {
		return this.userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Column(name="user_sid")
	public String getUserSid() {
		return this.userSid;
	}
	public void setUserSid(String userSid) {
		this.userSid = userSid;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof UserPK)) {
			return false;
		}
		UserPK castOther = (UserPK)other;
		return 
			(this.userId == castOther.userId)
			&& this.userSid.equals(castOther.userSid);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.userId;
		hash = hash * prime + this.userSid.hashCode();
		
		return hash;
	}
}