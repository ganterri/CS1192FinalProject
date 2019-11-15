package app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Event 
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long eventId;
	
	@Column
	String eventName;

	@Column
	Long venueID;

	@Column
	String dateMonth;

	@Column
	Double dateDay;

	@Column
	Double dateYear;
	
	@Column
	Double startTime;
	
	@Column
	Double endTime;
	
	@Column
	Long orgID;
	
	@Column
	Boolean opa;
	
	@Column
	String category;
	
	@Column
	String description;

	public Long getEventId() {
		return eventId;
	}

	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public Long getVenueID() {
		return venueID;
	}

	public void setVenueID(Long venueID) {
		this.venueID = venueID;
	}

	public String getDateMonth() {
		return dateMonth;
	}

	public void setDateMonth(String dateMonth) {
		this.dateMonth = dateMonth;
	}

	public Double getDateDay() {
		return dateDay;
	}

	public void setDateDay(Double dateDay) {
		this.dateDay = dateDay;
	}

	public Double getDateYear() {
		return dateYear;
	}

	public void setDateYear(Double dateYear) {
		this.dateYear = dateYear;
	}

	public Double getStartTime() {
		return startTime;
	}

	public void setStartTime(Double startTime) {
		this.startTime = startTime;
	}

	public Double getEndTime() {
		return endTime;
	}

	public void setEndTime(Double endTime) {
		this.endTime = endTime;
	}

	public Long getOrgID() {
		return orgID;
	}

	public void setOrgID(Long orgID) {
		this.orgID = orgID;
	}

	public Boolean getOpa() {
		return opa;
	}

	public void setOpa(Boolean opa) {
		this.opa = opa;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	
}
