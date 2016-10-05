package com.ssd.web.form;

import java.util.Date;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.ssd.entity.User;

public class UserForm {

    @Digits(integer=8, fraction=0)
    private Integer id;
    
    @Size(min = 5, max = 20)
    private String sid;
    
    @NotNull
    @Size(min = 3, max = 80)
    private String name;

    @NotNull
    @Size(min = 6, max = 20)
    private String email;
    
    @Size(min = 8, max = 20)
    private String pwd;

    @Size(min = 8, max = 20)
    private String confirm;

    public UserForm() {
        
    }

    /** Populate fields from supplied user. */
    public UserForm(final User user) {
        
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = emptyAsNull(name);
    }


    public String getConfirm() {
        return confirm;
    }

    public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public void setConfirm(String confirm) {
        this.confirm = emptyAsNull(confirm);
    }

    private String emptyAsNull(final String value) {
        return (value == null || value.trim().length() == 0) ? null : value;
    }
    
    /**
     * Update the user with values from this form.
     * 
     * @param user
     */
    public void update(User user) {
    	user.setUserId(id);
    	user.setEmail(email);
    	user.setPassword(pwd);
    	user.setUserSid(sid);
    	user.setUpdatedBy(sid);
    	user.setUpdatedDate(new Date());
    }
}
