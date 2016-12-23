/**
 * 
 */
package com.tutorial.sample.authenticate;

import static org.junit.Assert.*;
import mockit.Mock;
import mockit.MockUp;

import org.junit.Before;
import org.junit.Test;

import com.tutorial.sample.userInfo.UserInfo;
import com.tutorial.sample.userInfo.UserStorageInterface;
import com.tutorial.sample.userInfo.UserStorageInterfaceImpl;

/**
 * @author Ritika.Malhotra
 *
 */
public class AuthenticateTest {

	UserInfo uifo;
	Authenticate auth;
	UserStorageInterface usfo;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		auth = new Authenticate();
		
		
		new MockUp<UserInfo>() {
			@Mock
			public String getDOB()
			{
				return "121212";
			}
			@Mock
			public String getName()
			{
				return "amit";
			}
			@Mock
			public String getPhoneNo()
			{
				return "9993203191";
			}
		};
		
		new MockUp<UserStorageInterfaceImpl>() {
			@Mock
			public String readFromFile(){
				return "9921ma";
			}
		};
		
	}

	/**
	 * Test method for {@link com.tutorial.sample.authenticate.Authenticate#authenticateUser(com.tutorial.sample.userInfo.UserInfo, com.tutorial.sample.userInfo.UserStorageInterface)}.
	 */
	@Test
	public void testAuthenticateUser() {
		
		uifo = new UserInfo();
		
		usfo = new UserStorageInterfaceImpl();
		
		boolean isAuthenticated=auth.authenticateUser(uifo, usfo);
		
		assertEquals(true, isAuthenticated);
		
	}

}
