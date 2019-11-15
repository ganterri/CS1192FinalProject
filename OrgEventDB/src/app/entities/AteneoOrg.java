package app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AteneoOrg {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long orgID;
	
	@Column
	String orgName;
	
	@Column
	String orgAcronym;
	
	@Column
	Boolean orgAccreditation;

	public Long getOrgID() {
		return orgID;
	}

	public void setOrgID(Long orgID) {
		this.orgID = orgID;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getOrgAcronym() {
		return orgAcronym;
	}

	public void setOrgAcronym(String orgAcronym) {
		this.orgAcronym = orgAcronym;
	}

	public Boolean getOrgAccreditation() {
		return orgAccreditation;
	}

	public void setOrgAccreditation(Boolean orgAccreditation) {
		this.orgAccreditation = orgAccreditation;
	}	
	
	
}
