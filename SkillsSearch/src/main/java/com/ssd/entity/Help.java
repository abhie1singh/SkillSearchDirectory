package com.ssd.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the help database table.
 * 
 */
@Entity
@NamedQuery(name="Help.findAll", query="SELECT h FROM Help h")
public class Help implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_help")
	private int idHelp;

	@Column(name="actual_hours")
	private int actualHours;

	private String comment;

	@Column(name="created_by")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_date")
	private Date createdDate;

	private String isApproved;

	private String isHelping;

	private String provider;

	private BigDecimal rating;

	@Column(name="requested_hours")
	private int requestedHours;

	private String requester;

	@Column(name="updated_by")
	private String updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_date")
	private Date updatedDate;

	public Help() {
	}

	public int getIdHelp() {
		return this.idHelp;
	}

	public void setIdHelp(int idHelp) {
		this.idHelp = idHelp;
	}

	public int getActualHours() {
		return this.actualHours;
	}

	public void setActualHours(int actualHours) {
		this.actualHours = actualHours;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
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

	public String getIsApproved() {
		return this.isApproved;
	}

	public void setIsApproved(String isApproved) {
		this.isApproved = isApproved;
	}

	public String getIsHelping() {
		return this.isHelping;
	}

	public void setIsHelping(String isHelping) {
		this.isHelping = isHelping;
	}

	public String getProvider() {
		return this.provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public BigDecimal getRating() {
		return this.rating;
	}

	public void setRating(BigDecimal rating) {
		this.rating = rating;
	}

	public int getRequestedHours() {
		return this.requestedHours;
	}

	public void setRequestedHours(int requestedHours) {
		this.requestedHours = requestedHours;
	}

	public String getRequester() {
		return this.requester;
	}

	public void setRequester(String requester) {
		this.requester = requester;
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