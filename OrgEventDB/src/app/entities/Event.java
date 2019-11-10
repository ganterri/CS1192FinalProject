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
	Long id;
	
	@Column
	String eventName;

	@Column
	String venue;

	@Column
	String dateMonth;

	@Column
	Double dateDay;

	@Column
	Double dateYear;
	
	@Column
	String startTime;
	
	@Column
	String endTime;
	
	@Column
	String orgName;
	
	@Column
	Boolean opa;
	
	@Column
	String category;
	
	@Column
	String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
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

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
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

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
	
	
	
}
