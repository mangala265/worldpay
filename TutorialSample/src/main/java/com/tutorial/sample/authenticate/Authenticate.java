/**
 * 
 */
package com.tutorial.sample.authenticate;

import com.tutorial.sample.userInfo.UserInfo;
import com.tutorial.sample.userInfo.UserStorageInterface;

/**
 * @author Ritika.Malhotra
 *
 */
public class Authenticate {
	
	public boolean authenticateUser(UserInfo uifo,UserStorageInterface usfo){
		
		StringBuffer sb = new StringBuffer();
		String part1 = uifo.getName().substring(0, 2);
		System.out.println("in authenticate class "+uifo.getName());
		
		String part2 = uifo.getDOB().substring(0, 2);
		String part3 = uifo.getPhoneNo().substring(0, 2);
		sb.append(part1).append(part2).append(part3);
		
		String key= sb.reverse().toString();
		
		if(key.equals(usfo.readFromFile())){
			return true;
		}
		return false;
	}
}
