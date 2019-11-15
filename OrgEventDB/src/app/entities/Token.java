package app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Token {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long tokenID;
	
	@Column
	String tokenCode;
	
	// As foreign key to connect to User Entity
	@Column
	Long userID;

	public Long getTokenID() {
		return tokenID;
	}

	public void setTokenID(Long tokenID) {
		this.tokenID = tokenID;
	}

	public String getTokenCode() {
		return tokenCode;
	}

	public void setTokenCode(String tokenCode) {
		this.tokenCode = tokenCode;
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}
	
	
}
