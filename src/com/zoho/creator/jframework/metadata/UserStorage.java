// $Id$
package com.zoho.creator.jframework.metadata;

public interface UserStorage {

	//public String loadUserName();
	//public void saveUserName(String userName);

	public String loadAuthToken();
	
	public void saveAuthToken(String authToken);
	
	public void removeAuthToken();
	
	
}
