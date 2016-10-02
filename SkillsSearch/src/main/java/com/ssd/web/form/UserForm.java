package com.ssd.web.form;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.ssd.entity.User;

public class UserForm {

    @Digits(integer=8, fraction=0)
    private Long id;

    @Digits(integer=8, fraction=0)
    private Long version;
    
    @NotNull
    @Size(min = 3, max = 80)
    private String name;

    @NotNull
    @Size(min = 6, max = 20)
    private String username;
    
    @Size(min = 8, max = 20)
    private String password;

    @Size(min = 8, max = 20)
    private String confirm;

    private boolean enabled;
    
    private boolean administrator;

    public UserForm() {
        
    }

    /** Populate fields from supplied user. */
    public UserForm(final User user) {
        
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = emptyAsNull(name);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = emptyAsNull(username);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = emptyAsNull(password);
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = emptyAsNull(confirm);
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isAdministrator() {
        return administrator;
    }

    public void setAdministrator(boolean administrator) {
        this.administrator = administrator;
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
        
    }
}
