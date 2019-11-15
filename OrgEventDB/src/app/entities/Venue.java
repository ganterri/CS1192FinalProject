package app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Venue {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long venueID;
	
	@Column
	String venueName;
	
	@Column
	String venueBuildingName;
	
	@Column
	Long venueRoomNumber;
	
	@Column
	Boolean venueHasAircon;

	public Long getVenueID() {
		return venueID;
	}

	public void setVenueID(Long venueID) {
		this.venueID = venueID;
	}

	public String getVenueName() {
		return venueName;
	}

	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}

	public String getVenueBuildingName() {
		return venueBuildingName;
	}

	public void setVenueBuildingName(String venueBuildingName) {
		this.venueBuildingName = venueBuildingName;
	}

	public Long getVenueRoomNumber() {
		return venueRoomNumber;
	}

	public void setVenueRoomNumber(Long venueRoomNumber) {
		this.venueRoomNumber = venueRoomNumber;
	}

	public Boolean getVenueHasAircon() {
		return venueHasAircon;
	}

	public void setVenueHasAircon(Boolean venueHasAircon) {
		this.venueHasAircon = venueHasAircon;
	}

	
}
